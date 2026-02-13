import java.util.ArrayList;
import java.util.List;

public class Tren<T> {

    private List<T> vagones = new ArrayList<>();

    public T getVagon(int index) {
        return vagones.get(index);
    }

    public void agregarVagones(T vagon) {
        this.vagones.add(vagon);
    }

    public void eliminarVagones(int index) {
        this.vagones.remove(index);
    }

    public int cantidadVagones() {
        return this.vagones.size();
    }
}