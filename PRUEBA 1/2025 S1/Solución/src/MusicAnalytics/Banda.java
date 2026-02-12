package MusicAnalytics;

import java.util.ArrayList;

public class Banda {

	private int id;
	private String nombre;
	private int añoFundacion;
	
	private ArrayList<Album> albumes;
	
	public Banda(int id, String nombre, int añoFundacion) {
		
		this.id = id;
		this.nombre = nombre;
		this.añoFundacion = añoFundacion;
		
		albumes = new ArrayList<Album>();
		
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAñoFundacion() {
		return añoFundacion;
	}

	public ArrayList<Album> getAlbumes() {
		return albumes;
	}

	public void AgregarAlbum(Album a) {
		albumes.add(a);
		a.setBanda(this);
	}

	public void MostrarComposicion() {
		// Listas Paralelas
		ArrayList<String> generosUnicos = new ArrayList<String>();
		int totalCanciones = 0;
		
		for (Album a : albumes) {
			
			ArrayList<Cancion> canciones = a.getCanciones();
			for (Cancion c : canciones) {
				
				String genero = c.getGenero();
				if (!generosUnicos.contains(genero)) {
					generosUnicos.add(genero);
				}
				
			}
			totalCanciones += canciones.size();
		}
		
		if (totalCanciones == 0) {
			System.out.println("No hay canciones en la banda.");
			return;
		}
		
		System.out.println("Composición de estilos:");
		
		int[] contador = new int[generosUnicos.size()];
		
		for (int i = 0; i < generosUnicos.size(); i++) {
			for (Album a : albumes) {
				for (Cancion c : a.getCanciones()) {
					
					if (c.getGenero().equals(generosUnicos.get(i))) {
						contador[i] += 1;
					}
					
				}
			}
		}
		
		for (int i = 0; i < generosUnicos.size(); i++) {
			String genero = generosUnicos.get(i);
			double porc = contador[i]*100/totalCanciones;
			System.out.println(genero + ": " + porc + "%");	
		}
	}

	public double calcularRating() {
		double acumulador = 0;
		for (int i = 0; i < albumes.size(); i++) {
			acumulador += albumes.get(i).getRating();
		}
		
		if (albumes.size() == 0) {
			return 0;
		}
		
		double ratingBanda = acumulador/albumes.size();
		return ratingBanda;
	}

}