package MusicAnalytics;

public class Cancion {

	private int id;
	private String nombre;
	private int segundos;
	private String genero;
	private int rating;
	
	private Album album;
	private ArrayList<Playlist> playlist;

	public Cancion(int id, String nombre, int segundos, String genero, int rating) {

		this.id = id;
		this.nombre = nombre;
		this.segundos = segundos;
		this.genero = genero;
		this.rating = rating;

		playlist = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getSegundos() {
		return segundos;
	}

	public String getGenero() {
		return genero;
	}

	public int getRating() {
		return rating;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album a) {
		album = a;
	}

	public ArrayList<Playlist> getPlaylist() {
		return playlist;
	}

}
