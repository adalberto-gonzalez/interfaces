public class Arma implements Inventariable{
    private String nombre;
    private int ataque;

    public Arma (String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public void registrar(Inventario inv, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            inv.agregarItem(this);
        }
        System.out.println("Agregado al inventario.");
    }

    @Override
    public void borrar(Inventario inv) {
        inv.borrarItem(this);
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