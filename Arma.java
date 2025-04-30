public class Arma implements Inventariable{
    private String nombre;
    private int ataque;

    public Arma (String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    @Override
    public void agregar(Inventario inv, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            inv.items.add(this);
        }
        System.out.println("Agregado al inventario.");
    }

    @Override
    public void eliminar(Inventario inv) {
        inv.items.remove(this);
        System.out.println("Eliminado del inventario.");
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                ", ataque=" + ataque +
                '}';
    }
}