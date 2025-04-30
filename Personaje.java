public class Personaje implements ElementoDinamico {
    private float x;
    private float y;
    private float z;
    private String nombre;

    public Personaje (String nombre) {
        this.nombre = nombre;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    @Override
    public void mover(float x, float y, float z) {
        this.x += x;
        this.y += y;
        this.z += z;
        System.out.println("Personaje " + nombre + " se ha movido a la posicion: (" + this.x + ", " + this.y + ", " + this.z + ")");
    }
}