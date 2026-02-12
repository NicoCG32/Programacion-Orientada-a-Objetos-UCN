package MusicAnalytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Banda> bandas = new ArrayList<>();
		ArrayList<Playlist> playlist = new ArrayList<>();
		
		try {
			CargarBandas(bandas);
			CargarMusica(bandas);
			CargarPlaylist(playlist, bandas);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Menu(bandas, playlist);
	}
	
	public static void Menu(ArrayList<Banda> bandas, ArrayList<Playlist> playlist) {
		
		Scanner lector = new Scanner(System.in);
		int ver = 0;
		
		while (ver == 0) {
			
			System.out.println("Menú de opciones:"
					+ "\n1. Composición de estilos de las bandas"
					+ "\n2. Composición de álbumes de las playlists"
					+ "\n3. Mostrar álbumes por década"
					+ "\n4. Mostrar el rating de todas las bandas"
					+ "\n-1. Salir");
			System.out.println("Ingrese una opción:");
			String opcion = lector.nextLine();
			
			switch (opcion) {
			
			case "1":
				MostrarGenerosXBandas(bandas);
				break;
				
			case "2":
				MostrarComposicionPlayList(playlist);
				break;
				
			case "3":
				MostrarAlbumesPorDécada(bandas);
				break;
				
			case "4":
				MostrarRatingBanda(bandas);
				break;
				
			case "-1":
				System.out.println("Saliendo del programa...");
				ver = 1;
				break;
				
			default:
				System.out.println("Error opción no válida");
			
			}
			System.out.println();
		}
		
		lector.close();
		
	}

	public static void CargarBandas(ArrayList<Banda> bandas) throws FileNotFoundException {
		File arch = new File("bandas.txt");
		Scanner lector = new Scanner(arch);
		
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] p = linea.split(",");
		
			int id = Integer.valueOf(p[0]);
			String nombre = p[1];
			int añoFundacion = Integer.valueOf(p[2]);
		
			Banda b = new Banda(id, nombre, añoFundacion);
			bandas.add(b);
		}
		
		lector.close();
	}

	public static void CargarMusica(ArrayList<Banda> bandas) throws FileNotFoundException {
		
		File arch = new File("musica.txt");
		Scanner lector = new Scanner(arch);
		
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] p = linea.split(",");
			
			int id = Integer.valueOf(p[0]);
			String nombre = p[1];
			
			int idBanda = Integer.valueOf(p[2]);
			Banda b = BuscarBanda(idBanda, bandas);
			
			if (b == null) {
				lector.close();
				throw new IllegalArgumentException("Banda no existe");
			}
			
			int añoLanzamiento = Integer.valueOf(p[3]);
			
			Album a = new Album(id, nombre, añoLanzamiento);
			
			b.AgregarAlbum(a);
			
			int nroCanciones = Integer.valueOf(p[4]);
			
			for (int i = 0; i < nroCanciones; i++) {
				
				linea = lector.nextLine();
				p = linea.split(",");
				
				int idCancion = Integer.valueOf(p[0]);
				String nombreCancion = p[1];
				
				String[] duracion = p[2].split(":");
				int segundos = (Integer.valueOf(duracion[0]) * 60) + Integer.valueOf(duracion[1]);
				
				String genero = p[3];
				int rating = Integer.valueOf(p[4]);
				
				Cancion c = new Cancion(idCancion, nombreCancion, segundos, genero, rating);
				a.AgregarCancion(c);
			}
		}
		
		lector.close();
	}

	public static Banda BuscarBanda(int idBanda, ArrayList<Banda> bandas) {
		for (Banda b : bandas) {
			if (b.getId() == idBanda) {
				return b;
			}
		}
		return null;
	}

	public static void CargarPlaylist(ArrayList<Playlist> playlist, ArrayList<Banda> bandas) throws FileNotFoundException {
		
		File arch = new File("playlists.txt");
		Scanner lector = new Scanner(arch);
		
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] p = linea.split(",");
		
			String motivo = p[0];
			int nroCanciones = Integer.valueOf(p[1]);
			
			Playlist pl = new Playlist(motivo);
			
			linea = lector.nextLine();
			p = linea.split(",");
			
			playlist.add(pl);
			
			for (int i = 0; i < nroCanciones; i++) {
				
				int idCancion = Integer.valueOf(p[i]);
				Cancion c = BuscarCancion(idCancion, bandas);
				
				if (c == null) {
					lector.close();
					throw new IllegalArgumentException("Cancion no existe");
				}
				
				pl.AgregarCancion(c);
				
			}	
			
			
		}
		
		lector.close();
	}

	public static Cancion BuscarCancion(int idCancion, ArrayList<Banda> bandas) {
		for (Banda b : bandas) {
			for (Album a : b.getAlbumes()) {
				for (Cancion c : a.getCanciones()) {
					if (c.getId() == idCancion) {
						return c;
					}
				}
			}
		}
		return null;
	}
	
	public static void MostrarGenerosXBandas(ArrayList<Banda> bandas) {
		for (Banda b : bandas) {
			System.out.println(b.getNombre());
			b.MostrarComposicion();
			System.out.println();
		}
	}

	public static void MostrarComposicionPlayList(ArrayList<Playlist> playlist) {
		for (Playlist pl : playlist) {
			System.out.println(pl.getMotivo());
			pl.MostrarComposicion();
			System.out.println();
		}
	}

	public static void MostrarAlbumesPorDécada(ArrayList<Banda> bandas) {
		ArrayList<Album> albumes = new ArrayList<>();
		
		for (Banda b : bandas) {
			for (Album a : b.getAlbumes()) {
				albumes.add(a);
			}
		}
		
		OrdenarAlbumes(albumes);
		
		int año = CalcularDecada(albumes.get(0).getAñoLanzamiento());
		System.out.println(año + " - " + (año + 9) + ":");
		
		for (Album a : albumes) {
			
			if (CalcularDecada(a.getAñoLanzamiento()) >= (año + 9)) {
				año = CalcularDecada(a.getAñoLanzamiento());
				System.out.println(año + " - " + (año + 9) + ":");
			}
			
			System.out.println("- " + a.getNombre() + " (" + a.getAñoLanzamiento() + ") - " + a.getBanda().getNombre());
		}
		
	}

	private static int CalcularDecada(int añoLanzamiento) {
		int decada = (int)(añoLanzamiento / 10);
		int periodo = decada * 10;
		return periodo;
	}

	private static void OrdenarAlbumes(ArrayList<Album> albumes) {
		for (int i = 0; i < albumes.size() - 1; i++) {
			for (int j = i + 1; j < albumes.size(); j++) {
				
				if (albumes.get(i).getAñoLanzamiento() >= albumes.get(j).getAñoLanzamiento()) {
					Album aux = albumes.get(i);
					albumes.set(i, albumes.get(j));
					albumes.set(j, aux);
				}
				
			}
		}
	}

	public static void MostrarRatingBanda(ArrayList<Banda> bandas) {
		System.out.println("Rating de bandas");
		for (Banda b : bandas) {
			double rating = b.calcularRating();
			System.out.println("-" + b.getNombre() + ": " + rating);
		}
	}
}
