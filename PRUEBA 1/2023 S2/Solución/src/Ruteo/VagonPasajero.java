public class VagonPasajeros {

    public String codigo;
    public int cantidadP;
    public static int capacidadMax;

    public VagonPasajeros(String codigo, int cantidad) {
        this.codigo = codigo;
        this.cantidadP = cantidad;
    }

    @Override
    public String toString() {
        return "[Vagon: " + codigo + ", Pasajeros: " + cantidadP + "]";
    }

    public int getCantidad() {
        return cantidadP;
    }

    public void bajar(int c) {
        if (cantidadP >= c) {
            this.cantidadP -= c;
        } else {
            cantidadP = 0;
        }
    }

    public void subir(int c) {
        if (cantidadP + c <= capacidadMax) {
            this.cantidadP += c;
        } else {
            cantidadP = capacidadMax;
        }
    }

    public static void setCapacidadMax(int capacidad) {
        capacidadMax = capacidad;
    }
}