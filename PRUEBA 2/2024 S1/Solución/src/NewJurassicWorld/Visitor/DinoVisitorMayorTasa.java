package NewJurassicWorld.Visitor;

import NewJurassicWorld.Dominio.Brachiosaurus;
import NewJurassicWorld.Dominio.Dinosaurio;
import NewJurassicWorld.Dominio.Tiranosaurio;
import NewJurassicWorld.Dominio.Triceratops;
import NewJurassicWorld.Dominio.Velociraptor;

public class DinoVisitorMayorTasa implements DinoVisitor {

	private double mayorTasa;
	private String especie;
	private Dinosaurio masAdaptado;
	
	@Override
	public void visit(Tiranosaurio d) {
		if (d.getAltura() <= 0 || d.getCicatrices() < 0) {
			return;
		}

		double tasa = d.getPeso() / Math.pow(d.getAltura(), d.getCicatrices());
		
		if (tasa > mayorTasa) {
			mayorTasa = tasa;
			masAdaptado = d;
			especie = "Tiranosaurio";
		}
	}

	@Override
	public void visit(Triceratops d) {
		double tasa = 0;
		
		switch (d.getPlantaFav()) {
		
		case "Helechos":
			tasa = (d.getPeso() * d.getVelocidad()) / 2;
			break;
			
		case "Cicadáceas":
			tasa = (d.getPeso() * d.getVelocidad()) / 3;
			break;
		
		}
		
		if (tasa > mayorTasa) {
			mayorTasa = tasa;
			masAdaptado = d;
			especie = "Triceratops";
		}
	}

	@Override
	public void visit(Velociraptor d) {
		if (d.getVelocidad() <= 0) {
			return;
		}
		
		double tasa = (double) d.getDistanciaRec() / d.getVelocidad();
		
		if (tasa > mayorTasa) {
			mayorTasa = tasa;
			masAdaptado = d;
			especie = "Velociraptor";
		}
	}

	@Override
	public void visit(Brachiosaurus d) {
		double tasa = (d.getAltura() - d.getLargoCuello()) * d.getPeso();
		
		if (tasa > mayorTasa) {
			mayorTasa = tasa;
			masAdaptado = d;
			especie = "Brachiosaurus";
		}
	}

	@Override
	public String ShowInfo() {
		if (masAdaptado == null) {
			return "El dinosario mejor adaptado es: \n";
		}
		String message = "El dinosario mejor adaptado es: \n";
		message += especie + " [" + masAdaptado.getId() + "]";
		return message;
	}

}