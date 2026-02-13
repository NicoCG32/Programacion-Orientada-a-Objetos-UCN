package RentACar.Dominio;

import RentACar.Visitor.Visitor;

public class SUV extends Vehiculo {

	public SUV(String VIN, String marca, String modelo, double eficiencia) {
		super(VIN, marca, modelo, eficiencia);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
