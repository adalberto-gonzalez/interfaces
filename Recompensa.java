public class Recompensa implements Inventariable {
    private String nombre;
    private int valor;

    public Recompensa(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public void agregar(Inventario inv, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            inv.items.add(this);
        }
        System.out.println("Recompensa agregada.");
    }

    @Override
    public void eliminar(Inventario inv) {
        inv.items.remove(this);
        System.out.println("Recompensa eliminada.");
    }

    @Override
    public String toString() {
        return "Recompensa{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}