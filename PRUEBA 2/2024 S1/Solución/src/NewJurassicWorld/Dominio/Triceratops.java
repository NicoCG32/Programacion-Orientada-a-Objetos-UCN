package NewJurassicWorld.Dominio;

import NewJurassicWorld.Visitor.DinoVisitor;

public class Triceratops extends Dinosaurio {

	private String PlantaFav;

	public Triceratops(String id, int peso, double altura, int velocidad, String region, String plantaFav) {
		super(id, peso, altura, velocidad, region);
		PlantaFav = plantaFav;
	}

	@Override
	public void accept(DinoVisitor v) {
		v.visit(this);
	}

	public String getPlantaFav() {
		return PlantaFav;
	}
	
}