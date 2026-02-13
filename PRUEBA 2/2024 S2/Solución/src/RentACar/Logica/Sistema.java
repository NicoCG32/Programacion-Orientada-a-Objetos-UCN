package RentACar.Logica;

public interface Sistema {

	void agregarVehiculo(String tipo, String vIN, String marca, String modelo, double eficiencia);

	void registrarConsumo(String vIN, String modo, int distancia);

	String CalcularKilometrajeYConsumo();

	String MayoresConsumidores();

}
