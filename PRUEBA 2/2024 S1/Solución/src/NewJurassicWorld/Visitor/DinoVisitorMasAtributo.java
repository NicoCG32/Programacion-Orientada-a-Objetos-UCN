package NewJurassicWorld.Visitor;

import NewJurassicWorld.Dominio.Brachiosaurus;
import NewJurassicWorld.Dominio.Dinosaurio;
import NewJurassicWorld.Dominio.Tiranosaurio;
import NewJurassicWorld.Dominio.Triceratops;
import NewJurassicWorld.Dominio.Velociraptor;

public class DinoVisitorMasAtributo implements DinoVisitor {

	private Dinosaurio pesado;
	private int peso;
	
	private Dinosaurio rapido;
	private int velocidad;

	private Dinosaurio alto;
	private double altura;
	
	@Override
	public void visit(Tiranosaurio d) {
		
		if (d.getPeso() > peso) {
			peso = d.getPeso();
			pesado = d;
		}
		
		if (d.getVelocidad() > velocidad) {
			velocidad = d.getVelocidad();
			rapido = d;
		}
		
		if (d.getAltura() > altura) {
			altura = d.getAltura();
			alto = d;
		}
		
	}

	@Override
	public void visit(Triceratops d) {

		if (d.getPeso() > peso) {
			peso = d.getPeso();
			pesado = d;
		}
		
		if (d.getVelocidad() > velocidad) {
			velocidad = d.getVelocidad();
			rapido = d;
		}
		
		if (d.getAltura() > altura) {
			altura = d.getAltura();
			alto = d;
		}
		
	}

	@Override
	public void visit(Velociraptor d) {
		
		if (d.getPeso() > peso) {
			peso = d.getPeso();
			pesado = d;
		}
		
		if (d.getVelocidad() > velocidad) {
			velocidad = d.getVelocidad();
			rapido = d;
		}
		
		if (d.getAltura() > altura) {
			altura = d.getAltura();
			alto = d;
		}
		
	}

	@Override
	public void visit(Brachiosaurus d) {
		
		if (d.getPeso() > peso) {
			peso = d.getPeso();
			pesado = d;
		}
		
		if (d.getVelocidad() > velocidad) {
			velocidad = d.getVelocidad();
			rapido = d;
		}
		
		if (d.getAltura() > altura) {
			altura = d.getAltura();
			alto = d;
		}
		
	}

	@Override
	public String ShowInfo() {
		if (pesado == null || alto == null || rapido == null) {
			return "No hay dinosaurios cargados.\n";
		}
		
		String message = "";
		message += "El más pesado es: " + pesado.getId() + " (" + peso + " kg)" + "\n";
		message += "El más alto es: " + alto.getId() + " (" + altura + " m)" + "\n";
		message += "El más rápido es: " + rapido.getId() + " (" + velocidad + " km/h)" + "\n";
		
		return message;
	}

}