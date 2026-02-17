package MapachesCelulares;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File posiciones = new File("mapaches_posiciones.txt");
		File mapaches = new File("mapaches.txt");

		try {
			Mapa mapa = CargarMapa(posiciones, mapaches);
			Menu(mapa);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Mapa CargarMapa(File posiciones, File mapaches) throws FileNotFoundException {
		Scanner lectorMapaches = new Scanner(mapaches);
		int cantMapaches = Integer.valueOf(lectorMapaches.nextLine());

		Scanner lectorPosiciones = new Scanner(posiciones);
		int orden = Integer.valueOf(lectorPosiciones.nextLine());

		Mapa mapa = new Mapa(orden, cantMapaches);

		while (lectorMapaches.hasNextLine()) {
			String linea = lectorMapaches.nextLine();
			String[] partes = linea.split(",");

			int rut = Integer.valueOf(partes[0]);
			String nombre = partes[1];
			int masa = Integer.valueOf(partes[2]);

			Mapache m = new Mapache(rut, nombre, masa);
			mapa.AgregarMapache(m);
		}

		for (int f = 0; f < orden; f++) {
			String linea = lectorPosiciones.nextLine();
			String[] partes = linea.split(",");

			for (int c = 0; c < partes.length; c++) {
				int valor = Integer.valueOf(partes[c]);
				if (valor != 0) {
					mapa.ColocarMapache(f, c, valor);
				}
			}
		}

		lectorMapaches.close();
		lectorPosiciones.close();
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