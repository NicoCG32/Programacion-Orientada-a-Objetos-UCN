package MusicAnalytics;

import java.util.ArrayList;

public class Playlist {

	private String motivo;
	private ArrayList<Cancion> canciones;
	
	public Playlist(String motivo) {
		this.motivo = motivo;
		
		this.canciones = new ArrayList<Cancion>();
	}

	public String getMotivo() {
		return motivo;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void AgregarCancion(Cancion c) {
		canciones.add(c);
	}

	public void MostrarComposicion() {
		System.out.println("Composición de álbumes:");
		
		ArrayList<Album> albumesUnicos = new ArrayList<>();
		
		for (Cancion c : canciones) {
			Album a = c.getAlbum();
			
			if (!albumesUnicos.contains(a)) {
				albumesUnicos.add(a);
			}

		}
		
		int[] contador = new int[albumesUnicos.size()];
		
		for (int i = 0; i < albumesUnicos.size(); i++) {
			Album unico = albumesUnicos.get(i);
			
			for (Cancion c : canciones) {
				if (c.getAlbum().equals(unico)) {
					contador[i] += 1;
				}
			}
		
		}
		
		for (int i = 0; i < albumesUnicos.size(); i++) {
			Album unico = albumesUnicos.get(i);
			double porc = contador[i] * 100 / canciones.size();
			System.out.println(unico.getNombre() + " (" + unico.getBanda().getNombre() + "): " + porc + "%");
		}
	}
	
}
