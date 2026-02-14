package NewJurassicWorld.Visitor;

import NewJurassicWorld.Dominio.Brachiosaurus;
import NewJurassicWorld.Dominio.Tiranosaurio;
import NewJurassicWorld.Dominio.Triceratops;
import NewJurassicWorld.Dominio.Velociraptor;

public class DinoVisitorCantidadPorEspecie implements DinoVisitor {

	private int cantTiranosaurioN;
	private int cantTiranosaurioS;

	private int cantTriceratopsN;
	private int cantTriceratopsS;

	private int cantVelociraptorN;
	private int cantVelociraptorS;

	private int cantBrachiosaurusN;
	private int cantBrachiosaurusS;
	
	@Override
	public void visit(Tiranosaurio d) {
		
		switch (d.getRegion()) {
		case "Norte":
			cantTiranosaurioN++;
			break;
			
		case "Sur":
			cantTiranosaurioS++;
			break;
		}
		
	}

	@Override
	public void visit(Triceratops d) {
		
		switch (d.getRegion()) {
		case "Norte":
			cantTriceratopsN++;
			break;
			
		case "Sur":
			cantTriceratopsS++;
			break;
		}
	}

	@Override
	public void visit(Velociraptor d) {
		
		switch (d.getRegion()) {
		case "Norte":
			cantVelociraptorN++;
			break;
			
		case "Sur":
			cantVelociraptorS++;
			break;
		}
		
	}

	@Override
	public void visit(Brachiosaurus d) {
		
		switch (d.getRegion()) {
		case "Norte":
			cantBrachiosaurusN++;
			break;
			
		case "Sur":
			cantBrachiosaurusS++;
			break;
		}
		
	}

	@Override
	public String ShowInfo() {
		String message = "En el hemisferio norte hay: \n";
		
		message += "Brachiosaurus: " + cantBrachiosaurusN + "\n";
		message += "TRex: " + cantTiranosaurioN + "\n";
		message += "Triceratops: " + cantTriceratopsN + "\n";
		message += "Velociraptor: " + cantVelociraptorN + "\n";
		
		message += "\nEn el hemisferio sur hay: \n";
		
		message += "Brachiosaurus: " + cantBrachiosaurusS + "\n";
		message += "TRex: " + cantTiranosaurioS + "\n";
		message += "Triceratops: " + cantTriceratopsS + "\n";
		message += "Velociraptor: " + cantVelociraptorS + "\n";
		return message;
	}

}