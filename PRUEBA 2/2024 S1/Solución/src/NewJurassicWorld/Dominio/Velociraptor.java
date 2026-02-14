package NewJurassicWorld.Dominio;

import NewJurassicWorld.Visitor.DinoVisitor;

public class Velociraptor extends Dinosaurio {

	private int DistanciaRec;

	public Velociraptor(String id, int peso, double altura, int velocidad, String region, int distanciaRec) {
		super(id, peso, altura, velocidad, region);
		DistanciaRec = distanciaRec;
	}
	
	@Override
	public void accept(DinoVisitor v) {
		v.visit(this);
	}

	public int getDistanciaRec() {
		return DistanciaRec;
	}
	
}