public class VagonCarga {

    public String codigo;
    public int peso;

    public VagonCarga(String codigo, int peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "[Vagon: " + codigo + ", Carga: " + peso + " kg]";
    }
}