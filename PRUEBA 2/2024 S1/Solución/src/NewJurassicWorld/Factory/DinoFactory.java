package NewJurassicWorld.Factory;

import NewJurassicWorld.Dominio.Brachiosaurus;
import NewJurassicWorld.Dominio.Dinosaurio;
import NewJurassicWorld.Dominio.Tiranosaurio;
import NewJurassicWorld.Dominio.Triceratops;
import NewJurassicWorld.Dominio.Velociraptor;

public class DinoFactory {

	private static DinoFactory factory;
	
	public static DinoFactory getInstance() {
		if (factory == null) {
			factory = new DinoFactory();
		} 
		return factory;
	}
	
	public Dinosaurio getDinosaurio(String especie, String id, int peso,
			double altura, int velocidad, String region, String atributo) {
		
		Dinosaurio d;
		switch (especie) {
		
		case "Tiranosaurio":
			int cicatrices = Integer.valueOf(atributo);
			d = new Tiranosaurio(id, peso, altura, velocidad, region, cicatrices);
			return d;
			
		case "Triceratops":
			String PlantaFav = atributo;
			d = new Triceratops(id, peso, altura, velocidad, region, PlantaFav);
			return d;
			
		case "Velociraptor":
			int DistanciaRec = Integer.valueOf(atributo);
			d = new Velociraptor(id, peso, altura, velocidad, region, DistanciaRec);
			return d;
		
		case "Brachiosaurus":
			double LargoCuello = Double.valueOf(atributo);
			d = new Brachiosaurus(id, peso, altura, velocidad, region, LargoCuello);
			return d;
		}

		return null;
	}

}