package RentACar.Logica;

import java.util.ArrayList;

import RentACar.Dominio.Vehiculo;

import RentACar.Factory.IVehiculoFactory;
import RentACar.Factory.VehiculoFactory;

import RentACar.Visitor.Visitor;
import RentACar.Visitor.VisitorMayorConsumo;

public class SistemaImpl implements Sistema {

	private ArrayList<Vehiculo> vehiculos;
	private IVehiculoFactory vehiculoFactory;
	
	public SistemaImpl() {
		this(new VehiculoFactory());
	}

	public SistemaImpl(IVehiculoFactory vehiculoFactory) {
		this.vehiculos = new ArrayList<>();
		this.vehiculoFactory = vehiculoFactory;
	}
	
	@Override
	public void agregarVehiculo(String tipo, String VIN, String marca,
			String modelo, double eficiencia) {
		Vehiculo v = vehiculoFactory.crearVehiculo(tipo, VIN, marca, modelo, eficiencia);
		if (v != null) {
			vehiculos.add(v);
		}
	}

	@Override
	public void registrarConsumo(String VIN, String modo, int distancia) {
		Vehiculo v = this.buscarVehiculo(VIN);
		if (v == null) {
			return;
		}
		v.registrarConsumo(modo, distancia);
	}

	private Vehiculo buscarVehiculo(String VIN) {
		for (int i = 0; i < vehiculos.size(); i++) {
			if (vehiculos.get(i).getVIN().equals(VIN)) {
				return vehiculos.get(i);
			}
		}
		return null;
	}

	@Override
	public String CalcularKilometrajeYConsumo() {
		String m = "";
		
		for (int i = 0; i < vehiculos.size(); i++) {
			Vehiculo v = vehiculos.get(i);
			m += v.getMarca() + " " + v.getModelo() + " CONSUMO: " + v.getConsumo()
			+ " | ODÓMETRO: " + v.getDistanciaTotal() + " KM \n";
					
		}
		return m;
	}

	@Override
	public String MayoresConsumidores() {
		Visitor v = new VisitorMayorConsumo();
		
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).accept(v);
		}
		
		return v.ShowInfo();
	}

}