import java.util.ArrayList;

public class Inventario{
    public ArrayList<Inventariable> items = new ArrayList<>();

    @Override
    public String toString() {
        return "Inventario{" +
                "items=" + items +
                '}';
    }
}