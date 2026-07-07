package Logica;

import javax.swing.*;
import java.awt.*;

import java.io.*;
import java.util.*;

public class App {
	
	private static Sistema sistema = SistemaImpl.getSistema();

	public static void main(String[] args) {
		
		try {
			LeerArchivos();
		} catch (FileNotFoundException e) { 
			System.out.println("Error al leer los archivos: " + e.getMessage());
		}
		
		/* Por consola */
		MostrarListadoMicros();
		MostrarIngresoTotal();
		MostrarKilometrajeTotal();
		
		/* JFRAME */
		JFrame frame = new JFrame("Del West");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		frame.add(CrearBotonera(panel), BorderLayout.SOUTH);
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		
	}

	private static Component CrearBotonera(JPanel panel) {
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
		
		JButton boton1 = new JButton("Listado Micros");
		JButton boton2 = new JButton("Ingreso Total");
		JButton boton3 = new JButton("Kilometraje Total");
		
		panelBotones.add(boton1);
		panelBotones.add(boton2);
		panelBotones.add(boton3);
		
		JLabel etiqueta = new JLabel();
		
		boton1.addActionListener(e -> {
			String mensaje = sistema.ListadoMicrosGUI();
			etiqueta.removeAll();
			panel.removeAll();
			
			etiqueta.setText(mensaje);
			panel.add(etiqueta, BorderLayout.CENTER);
			panel.revalidate();
			panel.repaint();
		}
		);
		
		boton2.addActionListener(e -> {
			String mensaje = sistema.IngresoTotal();
			
			etiqueta.removeAll();
			
			panel.removeAll();
			
			etiqueta.setText(mensaje);
			panel.add(etiqueta, BorderLayout.NORTH);
			panel.revalidate();
			panel.repaint();
		}
		);
		
		boton3.addActionListener(e -> {
			String mensaje = sistema.KilometrajeTotal();
			
			etiqueta.removeAll();
			
			panel.removeAll();
			
			etiqueta.setText(mensaje);
			panel.add(etiqueta, BorderLayout.NORTH);
			panel.revalidate();
			panel.repaint();
		}
		);
		
		return panelBotones;
	}

	
	public static void LeerArchivos() throws FileNotFoundException {
		LeerColectivos();
		LeerViajes();
	}

	public static void MostrarListadoMicros() {
		System.out.println(sistema.ListadoMicros());
	}

	public static void MostrarIngresoTotal() {
		System.out.println(sistema.IngresoTotal());
	}

	public static void MostrarKilometrajeTotal() {
		System.out.println(sistema.KilometrajeTotal());
	}

	public static void LeerColectivos() throws FileNotFoundException {

		File arch = new File("colectivos.txt");
		Scanner lector = new Scanner(arch);
		
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(",");
			sistema.AgregarColectivo(partes);
		}
		
		lector.close();
		
	}

	public static void LeerViajes() throws FileNotFoundException {
		File arch = new File("viajes.txt");
		Scanner lector = new Scanner(arch);
		
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(",");
			sistema.AnalizarViaje(partes);
		}
		
		lector.close();
	}
}
