package Strategy;

public class RecB implements Strategy {
	
	private double distancia;
	
	private static RecB instancia;
	private RecB() {
		distancia = 27.6;
	}
	
	public static Strategy getRecorrido() {
		if (instancia == null) {
			instancia = new RecB();
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
		
		sumaGanancia += (adultos * 900);
		sumaGanancia += (mayores * 700);
		sumaGanancia += (estudiantes * 650);
		
		return sumaGanancia;
	}
}
