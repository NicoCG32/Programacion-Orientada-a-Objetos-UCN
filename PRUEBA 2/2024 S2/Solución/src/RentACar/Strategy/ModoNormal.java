package RentACar.Strategy;

public class ModoNormal implements Strategy {

	private static ModoNormal modoNormal;
	private ModoNormal() {}
	
	public static Strategy getModoNormal() {
		if (modoNormal == null) {
			modoNormal = new ModoNormal();
		} 
		return modoNormal;
	}

	@Override
	public double calcularConsumo(double eficiencia, int distancia) {
		return (double) distancia / eficiencia;
	}

}