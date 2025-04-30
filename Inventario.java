import java.util.ArrayList;

public class Inventario{
    private ArrayList<Inventariable> items = new ArrayList<>();

    public ArrayList<Inventariable> getItems() {
        return items;
    }

    public void setItems(ArrayList<Inventariable> items) {
        this.items = items;
    }

    public void agregarItem(Inventariable item) {
        items.add(item);
    }

    public void borrarItem(Inventariable item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "items=" + items +
                '}';
    }
}