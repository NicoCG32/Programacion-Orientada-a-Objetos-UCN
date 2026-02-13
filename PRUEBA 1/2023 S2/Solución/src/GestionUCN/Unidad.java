package GestionUCN;

import java.util.ArrayList;

public class Unidad {

	private String nombre;
	private ArrayList<Contrato> contratos;
	
	public Unidad(String nombre) {
		this.nombre = nombre;
		contratos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public void AgregarContrato(Contrato c) {
		contratos.add(c);
	}

	@Override
	public String toString() {
		return "Unidad{nombre='" + nombre + "'}";
	}
	
	
	
}
