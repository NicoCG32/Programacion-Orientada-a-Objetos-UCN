package RentACar.Visitor;

import RentACar.Dominio.Auto;
import RentACar.Dominio.Camioneta;
import RentACar.Dominio.SUV;

public class VisitorMayorConsumo implements Visitor {

	private SUV SConsumo;
	private double SuvConsumoMayor;
	
	private Camioneta CConsumo;
	private double CamionetaConsumoMayor;

	private Auto AConsumo;
	private double AutoConsumoMayor;
	
	@Override
	public void visit(SUV v) {
		if (v.getConsumo() > SuvConsumoMayor) {
			SuvConsumoMayor = v.getConsumo();
			SConsumo = v;
		}
	}

	@Override
	public void visit(Camioneta v) {
		if (v.getConsumo() > CamionetaConsumoMayor) {
			CamionetaConsumoMayor = v.getConsumo();
			CConsumo = v;
		}
	}

	@Override
	public void visit(Auto v) {
		if (v.getConsumo() > AutoConsumoMayor) {
			AutoConsumoMayor = v.getConsumo();
			AConsumo = v;
		}
	}

	@Override
	public String ShowInfo() {
		String message = "";
		message += "Camioneta: " + CConsumo.getVIN() + " (" + CamionetaConsumoMayor + " litros)\n";
		message += "SUV: " + SConsumo.getVIN() + " (" + SuvConsumoMayor + " litros)\n";
		message += "Auto: " + AConsumo.getVIN() + " (" + AutoConsumoMayor + " litros)\n";
		return message;
	}

}
