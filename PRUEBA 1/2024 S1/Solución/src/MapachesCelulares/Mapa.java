package MapachesCelulares;

import java.util.Scanner;

public class Mapa {
	
	private Mapache[][] mapa;
	
	private int cantMapaches;
	private Mapache[] mapaches;
	
	public Mapa(int n, int cantMapaches) {
		mapa = new Mapache[n][n];
		mapaches = new Mapache[cantMapaches];
		this.cantMapaches = 0; // Indice para agregar mapaches, no es la cantidad total de mapaches
	}

	public void ColocarMapache(int fila, int columna, int rut) {
		Mapache m = BuscarMapache(rut);
		if (m == null) {
			throw new IllegalArgumentException("Rut no encontrado en mapaches: " + rut);
		}
		mapa[fila][columna] = m;
		m.setFila(fila);
		m.setColumna(columna);
	}

	private Mapache BuscarMapache(int rut) {
		Mapache m = null;
		for (int i = 0; i < cantMapaches; i++) {
			if (mapaches[i].getRut() == rut) {
				return mapaches[i];
			}
		}
		return m;
	}

	public void AgregarMapache(Mapache m) {
		if (cantMapaches < mapaches.length) {
			mapaches[cantMapaches] = m;
			cantMapaches++;
		}
	}

	private void EliminarMapache(Mapache m) {
		for (int i = 0; i < cantMapaches; i++) {
			if (mapaches[i] == m) {
				for (int j = i; j < cantMapaches - 1; j++) {
					mapaches[j] = mapaches[j + 1];
				}
				mapaches[cantMapaches - 1] = null;
				cantMapaches--;
				return;
			}
		}
	}

	public boolean ComprobarMapa() {
		if (cantMapaches == 1) {
			return true;
		}
		return false;
	}

	public void VerInformaciónDeMapache(Scanner lector) {
		int ver = 0;
		while (ver == 0) {
			try {
				System.out.print("Que mapache quieres ver? ");
				int rut = Integer.valueOf(lector.nextLine());
				
				Mapache m = BuscarMapache(rut);
				m.MostrarInfo();
				
				ver = 1;
			} catch (IllegalArgumentException e) {
				System.out.println("Error, rut no válido");
			} catch (NullPointerException e) {
				System.out.println("Error, rut no válido");
			}
		}
	}

	public void AlimentarMapache(Scanner lector) {
		
		int ver = 0;
		while (ver == 0) {
			try {
				System.out.print("Que mapache quieres alimentar? ");
				int rut = Integer.valueOf(lector.nextLine());
				
				Mapache m = BuscarMapache(rut);
				
				m.aumentarMasa();
				System.out.println(m.getNombre() + " ahora tiene una masa de " + m.getMasa());
				ver = 1;
			} catch (IllegalArgumentException e) {
				System.out.println("Error, rut no válido");
			} catch (NullPointerException e) {
				System.out.println("Error, rut no válido");
			}
		}
		
	}

	public void MoverMapache(Scanner lector) {
		
		int ver = 0;
		while (ver == 0) {
			try {
				System.out.print("Que mapache quieres mover? ");
				int rut = Integer.valueOf(lector.nextLine());
				
				Mapache m = BuscarMapache(rut);
				
				System.out.print("Hacia donde quieres moverlo? (N/S/E/O) ");
				String mov = lector.nextLine().toUpperCase();
				
				this.MoverMapache(mov, m);
				
				ver = 1;
			} catch (IllegalArgumentException e) {
				System.out.println("Error, rut no válido");
			} catch (NullPointerException e) {
				System.out.println("Error, rut no válido");
			}
		}
	}

	private void MoverMapache(String mov, Mapache m) {
		
		if (mov.equals("N")) {
			this.MoverEnFila(-1, m);
			return;
		}
		if (mov.equals("S")) {
			this.MoverEnFila(1, m);
			return;
		}
		if (mov.equals("O")) {
			this.MoverEnColumna(-1, m);
			return;
		}
		if (mov.equals("E")) {
			this.MoverEnColumna(1, m);
			return;
		}
		System.out.println("No se puede mover en esa direccion!");
	}

	private void MoverEnFila(int n, Mapache m) {
		int fila = m.getFila() + n;
		int columna = m.getColumna();
		
		if (!(fila >= mapa.length || fila < 0)) {
			if (mapa[fila][columna] != null) {
				Mapache rival = mapa[fila][columna];
				Mapache ganador = this.BatallaMapaches(m, rival);
				Mapache perdedor = (ganador == m) ? rival : m;
				System.out.println("Compiten " + m.getRut() + "/" + m.getNombre() + " con "
						+ rival.getRut() + "/" + rival.getNombre() + ": gana " + ganador.getNombre());
				
				mapa[m.getFila()][m.getColumna()] = null;
				
				mapa[fila][columna] = ganador;
				ganador.setFila(fila);
				ganador.setColumna(columna);
				EliminarMapache(perdedor);
			} else {
				
				mapa[m.getFila()][m.getColumna()] = null;
				mapa[fila][columna] = m;
				m.setFila(fila);
				m.setColumna(columna);
				
			}
		} else {
			System.out.println("No se puede mover en esa direccion!");
		}
	}
	
	private void MoverEnColumna(int n, Mapache m) {
		int fila = m.getFila();
		int columna = m.getColumna() + n;
		
		if (!(columna >= mapa.length || columna < 0)) {
			if (mapa[fila][columna] != null) {
				Mapache rival = mapa[fila][columna];
				Mapache ganador = this.BatallaMapaches(m, rival);
				Mapache perdedor = (ganador == m) ? rival : m;
				System.out.println("Compiten " + m.getRut() + "/" + m.getNombre() + " con "
						+ rival.getRut() + "/" + rival.getNombre() + ": gana " + ganador.getNombre());
				
				mapa[m.getFila()][m.getColumna()] = null;
				
				mapa[fila][columna] = ganador;
				ganador.setFila(fila);
				ganador.setColumna(columna);
				EliminarMapache(perdedor);
			} else {
				
				mapa[m.getFila()][m.getColumna()] = null;
				mapa[fila][columna] = m;
				m.setFila(fila);
				m.setColumna(columna);
				
			}
		} else {
			System.out.println("No se puede mover en esa direccion!");
		}
		
	}

	private Mapache BatallaMapaches(Mapache m1, Mapache m2) {
		if (m2.getMasa() > m1.getMasa()) {
			return m2;
		}
		return m1;
	}

	public void ImprimirMapa() {
		
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				
				if (mapa[i][j] != null) {
					System.out.print(mapa[i][j].getRut() + " ");
				} else {
					System.out.print("_ ");
				}

			}
			System.out.println();
		}
	}

}