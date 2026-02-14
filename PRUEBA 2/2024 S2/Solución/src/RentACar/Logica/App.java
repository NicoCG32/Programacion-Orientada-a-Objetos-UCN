package RentACar.Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	
	private static Sistema sistema = new SistemaImpl();
	
	public static void main(String[] args) throws FileNotFoundException {
		CargarArchivo();
		CalcularKilometrajeYConsumo();
		MayorConsumo();
	}

	public static void CalcularKilometrajeYConsumo() {
		System.out.println(sistema.CalcularKilometrajeYConsumo());
	}

	public static void MayorConsumo() {
		System.out.println(sistema.MayoresConsumidores());
	}

	public static void CargarArchivo() throws FileNotFoundException {

		File archivo = new File("Txt/fleet.txt");
		Scanner lector = new Scanner(archivo);
		
		int valor = Integer.valueOf(lector.nextLine());
		
		for (int i = 0; i < valor; i++) {
			String line = lector.nextLine();
			String[] p = line.split(",");
			
			String VIN = p[0];
			String marca = p[1];
			String modelo = p[2];
			
			String tipo = p[3];
			
			double eficiencia = Double.valueOf(p[4]);
			
			sistema.agregarVehiculo(tipo, VIN, marca, modelo, eficiencia);
		}
		
		while (lector.hasNextLine()) {
			String line = lector.nextLine();
			String[] p = line.split(",");

			String VIN = p[0];
			String modo = p[1];
			
			for (int i = 2; i < p.length; i++) {
				 int distancia = Integer.valueOf(p[i]);
				 sistema.registrarConsumo(VIN, modo, distancia);
			}
		}
		
		lector.close();
	}
	
}
