package Strategy;

public class RecC implements Strategy {
	
	private double distancia;
	private int tarifaAdulto; 
	
	private static RecC instancia;
	private RecC() {
		distancia = 34.2;
		tarifaAdulto = 1000;
	}
	
	public static Strategy getRecorrido() {
		if (instancia == null) {
			instancia = new RecC();
		}
		return instancia;
	}


	@Override
	public double CalcularKilometraje(int cantVueltas) {
		double kilometros = cantVueltas * distancia;
		return kilometros;
	}

	@Override
	public int CalcularGanancia(int adultos, int mayores, int estudiantes, String dia) {
		int sumaGanancia = 0;
		
		sumaGanancia += (adultos * tarifaAdulto);
		sumaGanancia += (mayores * tarifaAdulto * 0.4);

		if (dia.equals("D") || dia.equals("S")) { //Fin de semana
			
			sumaGanancia += (estudiantes * tarifaAdulto * 0.8);
		
		} else {
			
			sumaGanancia += (estudiantes * tarifaAdulto * 0.5);
		}
		
		return sumaGanancia;
	}
}
