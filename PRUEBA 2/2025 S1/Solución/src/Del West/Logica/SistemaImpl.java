package Logica;

import java.util.ArrayList;
import java.util.Locale;

import Dominio.*;

public class SistemaImpl implements Sistema {

	private static SistemaImpl instancia;
	private SistemaImpl() {}
	
	public static Sistema getSistema() {
		if (instancia == null) {
			instancia = new SistemaImpl();
		}
		return instancia;
	}

	ArrayList<Micro> micros = new ArrayList<>();
	
	@Override
	public void AgregarColectivo(String[] partes) {
		String patente = partes[0];
		String recInicial = partes[1];
		int kilometraje = Integer.valueOf(partes[2]);
		
		Micro m = new Micro(patente, recInicial, kilometraje);
		micros.add(m);
		
	}

	@Override
	public void AnalizarViaje(String[] partes) {
		String patente = partes[0];
		Micro m = BuscarMicro(patente);
		if (partes.length == 2) {
		
			String recorrido = partes[1];
			m.asignarRecorrido(recorrido);
		
		} else {
			
			int adultos = Integer.valueOf(partes[1]);
			int mayores = Integer.valueOf(partes[2]);
			int estudiantes = Integer.valueOf(partes[3]);
			int cantVueltas = Integer.valueOf(partes[4]);
			String dia = partes[5];
			
			m.CalcularGanancia(adultos, mayores, estudiantes, dia, cantVueltas);
			
		}
	}

	private Micro BuscarMicro(String patente) {
		for (Micro m : micros) {
			if (m.getPatente().equals(patente)) {
				return m;
			}
		}
		return null;
	}

	@Override
	public String ListadoMicros() {
		String mensaje = "";
		
		for (Micro m : micros) {
			mensaje += "[" + m.getPatente() + ", ";
			mensaje += "km: " + FormatearKilometraje(m.getKilometraje()) + ", ";
			mensaje += "Recorrido: " + m.getRecorrido() + ", ";
			mensaje += "Income $" + (int) m.getGanancia() + "]\n";
		}
		
		return mensaje;
	}

	@Override
	public String IngresoTotal() {
		int sumaTotal = 0;
		
		for (Micro m : micros) {
			sumaTotal += m.getGanancia();
		}
		
		String mensaje = "El ingreso total es de: $" + sumaTotal;
		return mensaje;
	}

	@Override
	public String KilometrajeTotal() {
		double sumaTotal = 0;
		
		for (Micro m : micros) {
			sumaTotal += m.getKilometraje();
		}
		
		String mensaje = "El kilometraje total es de: " + FormatearKilometraje(sumaTotal) + " km";
		return mensaje;
	}

	@Override
	public String ListadoMicrosGUI() {
		String mensaje = "<html>";
		
		for (Micro m : micros) {
			
			mensaje += "[" + m.getPatente() + ", ";
			mensaje += "km: " + FormatearKilometraje(m.getKilometraje()) + ", ";
			mensaje += "Recorrido: " + m.getRecorrido() + ", ";
			mensaje += "Income $" + (int) m.getGanancia() + "]<br>";
		
		}
		mensaje += "</html>";
		
		return mensaje;
	}

	private String FormatearKilometraje(double kilometraje) {
		double redondeado = Math.rint(kilometraje);
		if (Math.abs(kilometraje - redondeado) < 0.000001) {
			return String.valueOf((long) redondeado);
		}
		return String.format(Locale.US, "%.1f", kilometraje);
	}
}
