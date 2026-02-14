package NewJurassicWorld.Logica;

public interface Sistema {

	void AgregarDinosaurio(String especie, String id, int peso, 
	double altura, int velocidad, String region, String atributo);

	String CantidadPorEspecie();

	String MasAtributo();

	String MayorTasa();

}