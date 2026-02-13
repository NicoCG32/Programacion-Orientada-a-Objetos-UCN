package RentACar.Strategy;

public class ModoEco implements Strategy {

	private static ModoEco modoEco;
	private ModoEco() {}
	
	public static Strategy getModoEco() {
		if (modoEco == null) {
			modoEco = new ModoEco();
		} 
		return modoEco;
	}

	@Override
	public double calcularConsumo(double eficiencia, int distancia) {
		double newEficiencia = eficiencia * 1.111111; // 1/0.8
		return (double) distancia / newEficiencia;
	}

}
