package GestionUCN;

import java.util.ArrayList;

public class Persona {
	
	private String rut;
	private ArrayList<Contrato> contratos;
	
	public Persona(String rut) {
		this.rut = rut;
		contratos = new ArrayList<>();
	}

	public String getRut() {
		return rut;
	}

	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public void AgregarContrato(Contrato c) {
		contratos.add(c);
	}

	public void ordenarContratos() {
		for (int i = 0; i < contratos.size() - 1; i++) {
			for (int j = i + 1; j < contratos.size(); j++) {
				Contrato c1 = contratos.get(i);
				Contrato c2 = contratos.get(j);

				if (c2.getFechaInicio().estaAntes(c1.getFechaInicio())) {
					Contrato aux = c1;
					contratos.set(i, c2);
					contratos.set(j, aux);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Persona{rut='" + rut + "'}";
	}
	
}