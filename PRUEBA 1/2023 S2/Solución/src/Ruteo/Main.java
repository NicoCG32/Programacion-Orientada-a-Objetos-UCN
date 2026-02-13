public class Main {

    public static void main(String[] args) {

        VagonCarga vc1 = new VagonCarga("V1", 2500);
        VagonCarga vc2 = new VagonCarga("V3", 3000);
        VagonCarga vc3 = new VagonCarga("V2", 1500);

        Tren<VagonPasajeros> metro = new Tren<>();
        Tren<VagonCarga> cap = new Tren<>();

        for (int i = 1; i < 5; i++) {
            metro.agregarVagones(new VagonPasajeros("X" + i, 0));
            cap.agregarVagones(vc1);
            System.out.println(metro.getVagon(i - 1));
            System.out.println(cap.getVagon(i - 1));
        }

        int[] personas = {30, 19, 15, 5};

        VagonPasajeros.setCapacidadMax(20);

        for (int i = 0; i < metro.cantidadVagones(); i++) {
            metro.getVagon(i).subir(personas[i]);
        }

        metro.getVagon(2).bajar(5);
        cap.eliminarVagones(1);
        metro.getVagon(1).subir(8);
        metro.getVagon(0).bajar(3);
        metro.getVagon(3).bajar(6);
        cap.agregarVagones(vc2);
        metro.getVagon(2).bajar(3);
        cap.eliminarVagones(1);
        cap.agregarVagones(vc3);

        for (int i = 0; i < metro.cantidadVagones(); i++) {
            System.out.println(metro.getVagon(i));
        }

        for (int i = 0; i < cap.cantidadVagones(); i++) {
            System.out.println(cap.getVagon(i));
        }
    }
}