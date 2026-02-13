package RentACar.Dominio;

import RentACar.Strategy.ModoEco;
import RentACar.Strategy.ModoNormal;
import RentACar.Strategy.ModoSport;
import RentACar.Strategy.Strategy;
import RentACar.Visitor.Visitor;

public abstract class Vehiculo {
	
	protected String VIN; 
	protected String marca;
	protected String modelo;
	protected double eficiencia;
	
	protected Strategy modoDeUso;
	
	private int distanciaTotal;
	private double consumo;
	
	public Vehiculo(String VIN, String marca, String modelo, double eficiencia) {
		this.VIN = VIN;
		this.marca = marca;
		this.modelo = modelo;
		this.eficiencia = eficiencia;
	}

	public String getVIN() {
		return VIN;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModoDeUso(String modoDeUso) {
		switch (modoDeUso) {
		case "N":
			this.modoDeUso = ModoNormal.getModoNormal();
			break;
		case "E":
			this.modoDeUso = ModoEco.getModoEco();
			break;
		case "S":
			this.modoDeUso = ModoSport.getModoSport();
			break;
		default:
			this.modoDeUso = ModoNormal.getModoNormal();
			break;
		}
	}

	public void registrarConsumo(String modo, int distancia) {
		distanciaTotal += distancia;
		
		this.setModoDeUso(modo);
		consumo += modoDeUso.calcularConsumo(eficiencia, distancia);
	}

	public int getDistanciaTotal() {
		return distanciaTotal;
	}

	public double getConsumo() {
		return consumo;
	}
	
	public abstract void accept(Visitor v);
}
