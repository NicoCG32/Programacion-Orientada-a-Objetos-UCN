package RentACar.Factory;

import RentACar.Dominio.Vehiculo;

public interface IVehiculoFactory {

    Vehiculo crearVehiculo(String tipo, String VIN, String marca, String modelo, double eficiencia);
}
