public class Recompensa implements Inventariable {
    private String nombre;
    private int valor;

    public Recompensa(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public void registrar(Inventario inv, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            inv.agregarItem(this);
        }
        System.out.println("Recompensa agregada.");
    }

    @Override
    public void borrar(Inventario inv) {
        inv.borrarItem(this);
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