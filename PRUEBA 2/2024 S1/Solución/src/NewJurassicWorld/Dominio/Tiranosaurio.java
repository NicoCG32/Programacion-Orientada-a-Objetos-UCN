package NewJurassicWorld.Dominio;

import NewJurassicWorld.Visitor.DinoVisitor;

public class Tiranosaurio extends Dinosaurio {

	private int cicatrices;

	public Tiranosaurio(String id, int peso, double altura, int velocidad, String region, int cicatrices) {
		super(id, peso, altura, velocidad, region);
		this.cicatrices = cicatrices;
	}

	@Override
	public void accept(DinoVisitor v) {
		v.visit(this);
	}

	public int getCicatrices() {
		return cicatrices;
	}	
	
}