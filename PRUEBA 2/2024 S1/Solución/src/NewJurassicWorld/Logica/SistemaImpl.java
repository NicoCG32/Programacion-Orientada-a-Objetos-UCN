package NewJurassicWorld.Logica;

import java.util.ArrayList;

import NewJurassicWorld.Dominio.Dinosaurio;
import NewJurassicWorld.Factory.DinoFactory;
import NewJurassicWorld.Visitor.DinoVisitor;
import NewJurassicWorld.Visitor.DinoVisitorCantidadPorEspecie;
import NewJurassicWorld.Visitor.DinoVisitorMasAtributo;
import NewJurassicWorld.Visitor.DinoVisitorMayorTasa;

public class SistemaImpl implements Sistema {

	private static SistemaImpl sistemaImpl;
	
	private ArrayList<Dinosaurio> dinosaurios;
	
	private SistemaImpl() {
		dinosaurios = new ArrayList<>();
	}
	
	public static SistemaImpl getInstance() {
		if (sistemaImpl == null) {
			sistemaImpl = new SistemaImpl();
		}
		return sistemaImpl;
	}
	
	@Override
	public void AgregarDinosaurio(String especie, String id, int peso, 
	double altura, int velocidad, String region, String atributo) {
		DinoFactory factory = DinoFactory.getInstance();
		
		Dinosaurio d = factory.getDinosaurio(especie, id, peso, altura, velocidad, region, atributo);
		if (d != null) {
			dinosaurios.add(d);
		}
	}

	@Override
	public String CantidadPorEspecie() {
		DinoVisitor v = new DinoVisitorCantidadPorEspecie();
		
		for (int i = 0; i < dinosaurios.size(); i++) {
			dinosaurios.get(i).accept(v);
		}
		
		String message = v.ShowInfo();
		
		return message;
	}

	@Override
	public String MasAtributo() {
		DinoVisitor v = new DinoVisitorMasAtributo();
		
		for (int i = 0; i < dinosaurios.size(); i++) {
			dinosaurios.get(i).accept(v);
		}
		
		String message = v.ShowInfo();
		
		return message;
	}

	@Override
	public String MayorTasa() {
		DinoVisitor v = new DinoVisitorMayorTasa();
		
		for (int i = 0; i < dinosaurios.size(); i++) {
			dinosaurios.get(i).accept(v);
		}
		
		String message = v.ShowInfo();
		
		return message;
	}

}