package NewJurassicWorld.Visitor;

import NewJurassicWorld.Dominio.Brachiosaurus;
import NewJurassicWorld.Dominio.Tiranosaurio;
import NewJurassicWorld.Dominio.Triceratops;
import NewJurassicWorld.Dominio.Velociraptor;

public interface DinoVisitor {
	
	void visit(Tiranosaurio d);
	void visit(Triceratops d);
	void visit(Velociraptor d);
	void visit(Brachiosaurus d);
	String ShowInfo();
	
}