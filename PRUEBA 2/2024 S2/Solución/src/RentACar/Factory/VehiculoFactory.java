package RentACar.Factory;

import RentACar.Dominio.Auto;
import RentACar.Dominio.Camioneta;
import RentACar.Dominio.SUV;
import RentACar.Dominio.Vehiculo;

public class VehiculoFactory implements IVehiculoFactory {

    public static Vehiculo getVehiculo(String tipo, String VIN, String marca, 
            String modelo, double eficiencia) {
        
        Vehiculo v = null;
        
        switch (tipo) {
            case "P": // Camioneta (Pickup)
                v = new Camioneta(VIN, marca, modelo, eficiencia);
                break;
            case "S": // SUV
                v = new SUV(VIN, marca, modelo, eficiencia);
                break;
            case "C": // Auto (Car)
                v = new Auto(VIN, marca, modelo, eficiencia);
                break;
        }
        return v;
    }

    @Override
    public Vehiculo crearVehiculo(String tipo, String VIN, String marca, String modelo, double eficiencia) {
        return getVehiculo(tipo, VIN, marca, modelo, eficiencia);
    }
}