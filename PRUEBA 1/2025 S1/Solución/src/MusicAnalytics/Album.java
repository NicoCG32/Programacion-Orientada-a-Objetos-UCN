package MusicAnalytics;

import java.util.ArrayList;

public class Album {

	private int id;
	private String nombre;
	private int añoLanzamiento;

	private ArrayList<Cancion> canciones;
	private Banda banda;
	
	public Album(int id, String nombre, int añoLanzamiento) {
		
		this.id = id;
		this.nombre = nombre;
		this.añoLanzamiento = añoLanzamiento;
		
		canciones = new ArrayList<>();
		
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAñoLanzamiento() {
		return añoLanzamiento;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public Banda getBanda() {
		return banda;
	}

	public void AgregarCancion(Cancion c) {
		canciones.add(c);
		c.setAlbum(this);
	}

	public void setBanda(Banda b) {
		banda = b;
	}

	public double getRating() {
		double acumulador = 0;
		for (int i = 0; i < canciones.size(); i++) {
			acumulador += canciones.get(i).getRating();
		}
		
		double ratingAlbum = acumulador/canciones.size();
		return ratingAlbum;
	}
	
}