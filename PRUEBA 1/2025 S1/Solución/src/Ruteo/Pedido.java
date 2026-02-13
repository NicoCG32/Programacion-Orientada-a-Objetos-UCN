public class Pedido {

    private int numeroPedido;
    private String descripcion;
    private double total;
    private Cliente cliente;
    private static boolean beep;

    public Pedido(int numeroPedido, String descripcion, double total, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.descripcion = descripcion;
        this.total = total;
        this.cliente = cliente;

        if (beep) System.out.println("VVS");
        beep = !beep;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public static boolean isBeep() {
        return beep;
    }

    @Override
    public String toString() {

        String nombreCliente;

        if (cliente != null) {
            nombreCliente = cliente.getNombre();
        } else {
            nombreCliente = "N/A";
        }

        return "Pedido [Número=" + numeroPedido
                + ", Descripción=" + descripcion
                + ", Total=$" + (int) total
                + ", Cliente=" + nombreCliente + "]";
    }
}