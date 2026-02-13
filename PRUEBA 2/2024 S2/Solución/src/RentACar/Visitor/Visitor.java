package RentACar.Visitor;

import RentACar.Dominio.Auto;
import RentACar.Dominio.Camioneta;
import RentACar.Dominio.SUV;

public interface Visitor {

	void visit(SUV v);
	void visit(Camioneta v);
	void visit(Auto v);
	String ShowInfo();
	
}
