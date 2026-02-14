package NewJurassicWorld.Dominio;

import NewJurassicWorld.Visitor.DinoVisitor;

public abstract class Dinosaurio {

	protected String id;
	protected int peso;
	protected double altura;
	protected int velocidad;
	protected String region;
	
	public Dinosaurio(String id, int peso, double altura, int velocidad, String region) {
		this.id = id;
		this.peso = peso;
		this.altura = altura;
		this.velocidad = velocidad;
		this.region = region;
	}

	public String getId() {
		return id;
	}

	public int getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public String getRegion() {
		return region;
	}
	
	public abstract void accept(DinoVisitor v);
		
}