package Dominio;

import Strategy.*;

public class Micro {

	private String patente;
	private double kilometraje;
	
	private String ultimoRecorrido;
	private Strategy recorrido;
	
	private int ganancia;
	
	public Micro(String patente, String recInicial, int kilometraje) {
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.asignarRecorrido(recInicial);
	}

	public void asignarRecorrido(String recInicial) {
		switch (recInicial) {
		
		/* La estrategia no cambia según el objeto,
		 * así que se puede hacer Singleton */
		
		case "A":
			ultimoRecorrido = "A";
			recorrido = RecA.getRecorrido();
			break;
		case "B":
			ultimoRecorrido = "B";
			recorrido = RecB.getRecorrido();
			break;
		case "C":
			ultimoRecorrido = "C";
			recorrido = RecC.getRecorrido();
			break;
		}
	}

	public String getPatente() {
		return patente;
	}

	public double getKilometraje() {
		return kilometraje;
	}
	
	public double getGanancia() {
		return ganancia;
	}
	
	public String getRecorrido() {
		return ultimoRecorrido;
	}

	public void CalcularGanancia(int adultos, int mayores, int estudiantes, String dia, int cantVueltas) {
		
		int ganancia = recorrido.CalcularGanancia(adultos, mayores, estudiantes, dia);
		double kilometraje = recorrido.CalcularKilometraje(cantVueltas);
		
		this.ganancia += ganancia;
		this.kilometraje += kilometraje;
	}
}