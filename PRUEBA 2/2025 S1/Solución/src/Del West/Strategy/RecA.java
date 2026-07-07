package Strategy;

public class RecA implements Strategy {
	
	private double distancia;
	private int tarifaAdulto; 
	
	private static RecA instancia;
	private RecA() {
		distancia = 25;
		tarifaAdulto = 850;
	}
	
	public static Strategy getRecorrido() {
		if (instancia == null) {
			instancia = new RecA();
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

		if (dia.equals("D") || dia.equals("S")) { //Fin de semana
			
			sumaGanancia += (mayores * tarifaAdulto * 0.5);
			sumaGanancia += (estudiantes * tarifaAdulto);
		
		} else {
			
			sumaGanancia += (mayores * tarifaAdulto);
			sumaGanancia += (estudiantes * tarifaAdulto * 0.3);
		}
		
		return sumaGanancia;
	}

}
