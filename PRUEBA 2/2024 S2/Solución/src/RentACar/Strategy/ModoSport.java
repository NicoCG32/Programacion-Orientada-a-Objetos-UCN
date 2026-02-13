package RentACar.Strategy;

public class ModoSport implements Strategy {

	private static ModoSport modoSport;
	private ModoSport() {}
	
	public static Strategy getModoSport() {
		if (modoSport == null) {
			modoSport = new ModoSport();
		} 
		return modoSport;
	}

	@Override
	public double calcularConsumo(double eficiencia, int distancia) {
		//double newEficiencia = eficiencia * 1.25; // NOTESE QUE ASÍ NO ES
		double newEficiencia = eficiencia * 0.8;
		return (double) distancia / newEficiencia;
	}
}
