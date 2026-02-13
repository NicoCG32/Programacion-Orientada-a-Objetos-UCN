package GestionUCN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		ArrayList<Unidad> unidades = new ArrayList<>();
		ArrayList<Contrato> contratos = new ArrayList<>();
	
		
		Menu(personas, unidades, contratos);
		System.out.println("Simulación terminada");
	}

	private static void Menu(ArrayList<Persona> personas, ArrayList<Unidad> unidades, ArrayList<Contrato> contratos) {
		
		System.out.println();
		int verificador = 0;
		
		Scanner lector = new Scanner(System.in);
		
		while (verificador == 0) {
			try {
				System.out.println("¿Qué desea realizar?" + "\n1) Agregar persona"
				+ "\n2) Agregar Unidad" + "\n3) Asociar Persona A Unidad" + "\n4) Reportabilidad"
						+ "\n5) Terminar simulación");
				String opción = lector.nextLine();
			
				switch(opción) {
				case "1":
					AgregarPersona(lector, personas);
					break;
				case "2":
					AgregarUnidad(lector, unidades);
					break;
				case "3":
					Asociar(lector, contratos, personas, unidades);
					break;
				case "4":
					Reportabilidad(lector, personas, unidades, contratos);
					break;
				case "5":
					verificador = 1;
					break;
				default:
					System.out.println("Error, opción no válida");
				}
				
			} catch (IllegalArgumentException e) {
				System.out.println("Error, " + e.getMessage());
			} catch (NullPointerException e) {
				System.out.println("Error, " + "no existen datos para analizar");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Error, " + e.getMessage());
			}
		}

}

	private static void AgregarPersona(Scanner lector, ArrayList<Persona> personas) {
		System.out.println("Ingrese el rut de la persona: ");
		String rut = lector.nextLine();

		if (rut == "") {
			throw new IllegalArgumentException("RUT invalido");
		}
		if (BuscarPersona(rut, personas) != null) {
			throw new IllegalArgumentException("Persona ya existe");
		}
		
		Persona p = new Persona(rut);
		personas.add(p);
	}

	private static void AgregarUnidad(Scanner lector, ArrayList<Unidad> unidades) {
		System.out.println("Ingrese el nombre de la unidad: ");
		String nombre = lector.nextLine();

		if (nombre == "") {
			throw new IllegalArgumentException("Nombre de unidad invalido");
		}
		if (BuscarUnidad(nombre, unidades) != null) {
			throw new IllegalArgumentException("Unidad ya existe");
		}
		
		Unidad u = new Unidad(nombre);
		unidades.add(u);
	}

	private static void Asociar(Scanner lector, ArrayList<Contrato> contratos, ArrayList<Persona> personas, ArrayList<Unidad> unidades) {
		System.out.println("Ingrese el nombre de la unidad: ");
		String nombre = lector.nextLine();
		
		Unidad u = BuscarUnidad(nombre, unidades);

		if (u == null) {
			throw new IllegalArgumentException("Unidad no existe");
		}
		
		System.out.println("Ingrese el rut de la persona: ");
		String rut = lector.nextLine();
		
		Persona p = BuscarPersona(rut, personas);
		
		if (p == null) {
			throw new IllegalArgumentException("Persona no existe");
		}
		
		System.out.println("Ingrese el rol de la persona: ");
		String rol = lector.nextLine();
		
		Fecha fechaInicio = leerFecha(lector, "Ingrese la fecha de inicio (DD/MM/AAAA): ");
		Fecha fechaFinal = leerFecha(lector, "Ingrese la fecha final (DD/MM/AAAA): ");
		if (fechaFinal.estaAntesEstricto(fechaInicio)) {
			throw new IllegalArgumentException("La fecha final no puede ser anterior a la fecha de inicio");
		}
		
		Contrato c = new Contrato(rol, fechaInicio, fechaFinal, u, p);
		contratos.add(c);
		
		p.AgregarContrato(c);
		u.AgregarContrato(c);
		
	}

	private static Persona BuscarPersona(String rut, ArrayList<Persona> personas) {
		
		for (Persona p : personas) {
			if (p.getRut().equals(rut)) {
				return p;
			}
		}
		return null;
	}

	private static Unidad BuscarUnidad(String nombre, ArrayList<Unidad> unidades) {
		
		for (Unidad u : unidades) {
			if (u.getNombre().equals(nombre)) {
				return u;
			}
		}
		return null;
	}

	private static void Reportabilidad(Scanner lector, ArrayList<Persona> personas, ArrayList<Unidad> unidades,
			ArrayList<Contrato> contratos) {
		
		int verificador = 0;
		
		while (verificador == 0) {
			
			System.out.println("¿Qué desea reportar?" + "\n1) Cargos por persona según fecha"
			+ "\n2) Personas en cada unidad según fecha" + "\n3) Historial de una persona por RUT" + "\n4) Roles cumplidos por unidad"
			+ "\n5) Estadísticas generales" + "\n6) Salir");
			String opción = lector.nextLine();
			
			switch(opción) {
			case "1":
				CargosSegunFecha(lector, personas);
				break;
			case "2":
				PersonasPorUnidad(lector, unidades);
				break;
			case "3":
				Historial(lector, personas);
				break;
			case "4":
				RolesCumplidos(lector, unidades);
				break;
			case "5":
				Estadisticas(lector, contratos, personas);
				break;
			case "6":
				verificador = 1;
				break;
			default:
				System.out.println("Error, opción no válida");
			}
		}
	}

	private static void CargosSegunFecha(Scanner lector, ArrayList<Persona> personas) {
		
		Fecha fecha = leerFecha(lector, "Ingrese la fecha a analizar (DD/MM/AAAA): ");
		
		for (Persona p : personas) {
			ArrayList<Contrato> contratos = p.getContratos();
			for (Contrato c : contratos) {
				if ((fecha.estaDespues(c.getFechaInicio())) && (fecha.estaAntes(c.getFechaTermino()))) {
					System.out.println(c);
				}
			}
		}
		
	}

	private static void PersonasPorUnidad(Scanner lector, ArrayList<Unidad> unidades) {
		
		Fecha fecha = leerFecha(lector, "Ingrese la fecha a analizar (DD/MM/AAAA): ");
		
		for (Unidad u : unidades) {
			
			int contadorPersonas = 0;
			ArrayList<Contrato> contratos = u.getContratos();
			
			ArrayList<Persona> personasContadas = new ArrayList<>();
			for (Contrato c : contratos) {
					
				if ( (fecha.estaDespues(c.getFechaInicio()) ) && ( fecha.estaAntes(c.getFechaTermino()) ) ) {
					
					if (!personasContadas.contains(c.getP())) {
						contadorPersonas++;
						personasContadas.add(c.getP());
					}
					
				}
				
			}
			
			System.out.println("La unidad " + u.getNombre() + " tiene un total de " + contadorPersonas);
			
		}
		
	}

	private static void Historial(Scanner lector, ArrayList<Persona> personas) {
		
		System.out.println("Ingrese el rut a analizar: ");
		String rut = lector.nextLine();
		
		Persona p = BuscarPersona(rut, personas);
		
		if (p == null) throw new IllegalArgumentException("Persona no existe");
		
		p.ordenarContratos();

		ArrayList<Contrato> contratos = p.getContratos();

		System.out.println(p);
		for (Contrato c : contratos) {
			System.out.println("- " + c);
		}
		
	}

	private static void RolesCumplidos(Scanner lector, ArrayList<Unidad> unidades) {

		System.out.println("Ingrese la unidad a analizar: ");
		String nombre_unidad = lector.nextLine();
		
		Unidad u = BuscarUnidad(nombre_unidad, unidades);
	
		if (u == null) throw new IllegalArgumentException("Unidad no existe");
		
		ArrayList<Contrato> contratos = u.getContratos();
		for (Contrato c : contratos) {
			System.out.println(c);
		}
		
	}

	private static void Estadisticas(Scanner lector, ArrayList<Contrato> contratos, ArrayList<Persona> personas) {
		if (contratos.isEmpty() || personas.isEmpty()) {
			System.out.println("No hay datos suficientes para generar estadisticas.");
			return;
		}

		Contrato masAntiguo = contratos.get(0);
		for (Contrato c : contratos) {
			if (c.getFechaInicio().estaAntes(masAntiguo.getFechaInicio())) {
				masAntiguo = c;
			}
		}
		Persona pMasAntigua = masAntiguo.getP();


		int maximoRoles = -1;
		Persona pMayor = null;
		
		for (Persona p : personas) {
			
			int cantRoles = p.getContratos().size();
			if (cantRoles > maximoRoles) {
				maximoRoles = cantRoles;
				pMayor = p;
			}
		}

		System.out.println("Persona con mas antiguedad: " + pMasAntigua);
		System.out.println("Persona con mas roles: " + pMayor + " (" + maximoRoles + ")");
	}

	private static Fecha leerFecha(Scanner lector, String mensaje) {
		int verificador = 0;
		while (verificador == 0) {
			System.out.println(mensaje);
			String fechaAux = lector.nextLine();
			String[] aux = fechaAux.split("/");
			if (aux.length != 3) {
				System.out.println("Error, formato de fecha invalido. Use DD/MM/AAAA.");
				continue; // Siguiente iteración del ciclo, se vuelve a pedir la fecha
			}
			try {
				int dia = Integer.valueOf(aux[0]);
				int mes = Integer.valueOf(aux[1]);
				int año = Integer.valueOf(aux[2]);
				if (!Fecha.esFechaValida(año, mes, dia)) {
					System.out.println("Error, fecha invalida. Verifique dia y mes.");
					continue; // Siguiente iteración del ciclo, se vuelve a pedir la fecha
				}
				return new Fecha(año, mes, dia); // Sale del ciclo si la fecha es valida
			} catch (NumberFormatException e) {
				System.out.println("Error, fecha invalida. Use numeros en DD/MM/AAAA.");
			}
		}
	}
}