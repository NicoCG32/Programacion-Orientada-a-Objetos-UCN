package GestionUCN;

public class Fecha {
	
	private int año;
	private int mes;
	private int dia;
	
	public Fecha(int año, int mes, int dia) {
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}

	public boolean estaAntes(Fecha fechaFinal) {
		
		if (año < fechaFinal.año) return true;
		else if (año > fechaFinal.año) return false;
		
		if (mes < fechaFinal.mes) return true;
		else if (mes > fechaFinal.mes) return false; 
		
		if (dia < fechaFinal.dia) return true;
		else if (dia >  fechaFinal.dia) return false;
		
		return true; //Se incluye el día mismo
	}

	public boolean estaDespues(Fecha fechaInicio) {
		
		if (año > fechaInicio.año) return true;
		else if (año < fechaInicio.año) return false;
		
		if (mes > fechaInicio.mes) return true;
		else if (mes < fechaInicio.mes) return false; 
		
		if (dia > fechaInicio.dia) return true;
		else if (dia < fechaInicio.dia) return false;
		
		return true; //Se incluye el día mismo
	}

	public static boolean esFechaValida(int año, int mes, int dia) {
		if (año <= 1956 || mes < 1 || mes > 12 || dia < 1) return false;
		int diasMes;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2:
			if (esBisiesto(año)) {
				diasMes = 29;
			} else {
				diasMes = 28;
			}
			break;
		default:
			diasMes = 31;
			break;
		}
		return dia <= diasMes;
	}

	private static boolean esBisiesto(int año) {
		return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + año;
	}
	
}
