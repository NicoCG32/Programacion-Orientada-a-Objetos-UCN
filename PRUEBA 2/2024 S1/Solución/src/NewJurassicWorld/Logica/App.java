package NewJurassicWorld.Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	private static Sistema sistema = SistemaImpl.getInstance();
	
	public static void main(String[] args) {
		try {
			LeerDinosaurios();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo fauna.txt. Copialo a la carpeta del proyecto.");
			return;
		}
		MostrarCantXEspecie();
		
		MostrarMasPesadoMasAltoMasVeloz();
		
		MostrarDinoMayorTasa();
	}

	public static void MostrarCantXEspecie() {
		System.out.println(sistema.CantidadPorEspecie());
	}

	public static void MostrarMasPesadoMasAltoMasVeloz() {
		System.out.println(sistema.MasAtributo());
	}

	public static void MostrarDinoMayorTasa() {
		System.out.println(sistema.MayorTasa());
	}
	
	public static void LeerDinosaurios() throws FileNotFoundException {
		File arch = new File("fauna.txt");
		Scanner lector = new Scanner(arch);
		
		while (lector.hasNextLine()) {
			
			String line = lector.nextLine();
			String[] parts = line.split(",");
			
			String id = parts[0];
			
			String especie = parts[1];
			
			int peso = Integer.valueOf(parts[2]);
			double altura = Double.valueOf(parts[3]);
			int velocidad = Integer.valueOf(parts[4]);
			String region = parts[5];
			
			String atributo = parts[6];
			
			sistema.AgregarDinosaurio(especie, id, peso, altura, velocidad, region, atributo);
			
		}
		
		lector.close();
	}
	
}