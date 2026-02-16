package MapachesCelulares;

public class Mapache {
	
	private int rut;
	private String nombre;
	private int masa;
	int fila;
	int columna;

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public Mapache(int rut, String nombre, int masa) {
		this.rut = rut;
		this.nombre = nombre;
		this.masa = masa;
	}

	public int getRut() {
		return rut;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMasa() {
		return masa;
	}

	public void aumentarMasa() {
		this.masa = (int) (masa * 1.1);
	}

	public void MostrarInfo() {
		System.out.println(rut + "/" + nombre + " tiene una masa de " + masa);
		System.out.println("y vive en la celda " + (fila + 1) + "x" + (columna + 1));
	}

}