public class Utileria implements ElementoDinamico {
    private float x;
    private float y;
    private float z;

    @Override
    public void mover(float x, float y, float z) {
        this.x += x;
        this.y += y;
        this.z += z;
        System.out.println("Utileria se ha movido a la posicion: (" + this.x + ", " + this.y + ", " + this.z + ")");
    }
}