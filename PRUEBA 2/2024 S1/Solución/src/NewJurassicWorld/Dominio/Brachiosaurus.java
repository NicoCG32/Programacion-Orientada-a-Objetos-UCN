package NewJurassicWorld.Dominio;

import NewJurassicWorld.Visitor.DinoVisitor;

public class Brachiosaurus extends Dinosaurio {

	private double LargoCuello;

	public Brachiosaurus(String id, int peso, double altura, int velocidad, String region, double largoCuello) {
		super(id, peso, altura, velocidad, region);
		LargoCuello = largoCuello;
	}
	
	@Override
	public void accept(DinoVisitor v) {
		v.visit(this);
	}

	public double getLargoCuello() {
		return LargoCuello;
	}
	
}