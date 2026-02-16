package MapachesCelulares;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File posiciones = new File("TxtMapache/mapaches_posiciones.txt");
		File mapaches = new File("TxtMapache/mapaches.txt");

		try {
			Mapa mapa = CargarMapa(posiciones, mapaches);
			Menu(mapa);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public static Mapa CargarMapa(File posiciones, File mapaches) throws FileNotFoundException {
		
		Scanner lector = new Scanner(posiciones);
		Scanner lector2 = new Scanner(mapaches);
		
		int orden = Integer.valueOf(lector.nextLine());
		int cantMapaches = Integer.valueOf(lector2.nextLine());
		
		int[][] matriz = new int[orden][orden];
		
		for (int f = 0; f < orden; f++) {
			String linea = lector.nextLine();
			String[] partes = linea.split(",");
			for (int c = 0; c < partes.length; c++) {
				int valor = Integer.valueOf(partes[c]);
				matriz[f][c] = valor;
			}
		}
		
		Mapa mapa = new Mapa(orden, cantMapaches, matriz);
		
		while (lector2.hasNextLine()) {
			String linea = lector2.nextLine();
			String[] partes = linea.split(",");
			
			int rut = Integer.valueOf(partes[0]);
			String nombre = partes[1];
			int masa = Integer.valueOf(partes[2]);
			
			Mapache m = new Mapache(rut, nombre, masa);
			mapa.AgregarMapache(m);
		}
		
		mapa.ConstruirMapa(matriz);
		
		lector.close();
		lector2.close();
		return mapa;
	}
	
	private static void Menu(Mapa mapa) {
		Scanner lector = new Scanner(System.in);
		int verificador = 0;
		int turno = 0;
		while (verificador == 0) {
			try {
				int jugadorActual = turno % 2;
				System.out.println("Esta es la situacion actual:");
				mapa.ImprimirMapa();
				
				System.out.println("Jugador " + jugadorActual + ", que quieres hacer?");
				System.out.println("0. Rendirte");
				System.out.println("1. Mover un mapache");
				System.out.println("2. Alimentar un mapache");
				System.out.println("3. Ver informacion de un mapache");
				System.out.print("> ");
				String accion = lector.nextLine();
				
				switch (accion) {
					case "0":
						verificador = 1;
						System.out.println("El jugador " + (1 - jugadorActual) + " ha ganado!");
						break;
					case "1":
						mapa.MoverMapache(lector);
						turno++;
						break;
					case "2":
						mapa.AlimentarMapache(lector);
						turno++;
						break;
					case "3":
						mapa.VerInformaciónDeMapache(lector);
						break;
					default:
						System.out.println("Accion no valida");
				}
				
				if (mapa.ComprobarMapa() && verificador == 0) {
					verificador = 1;
					System.out.println("El jugador " + jugadorActual + " ha ganado!");
				}
				
			} catch (IllegalArgumentException e) {
				System.out.println("Entrada no valida");
			}
		}
	}
}
