import java.util.ArrayList;

public class Nivel {
    private ArrayList<ElementoDinamico> elementosDinamicos;
    private ArrayList<Checkpoint> checkpoints;
    private Inventario inventario;

    public Nivel() {
        this.elementosDinamicos = new ArrayList<>();
        this.checkpoints = new ArrayList<>();
        this.inventario = new Inventario();

        Checkpoint checkpoint = new Checkpoint();
        this.checkpoints.add(checkpoint);
        Checkpoint checkpoint2 = new Checkpoint();
        this.checkpoints.add(checkpoint2);

        Inventario inventario = new Inventario();
        Arma espada = new Arma("Espada", 10);
        Recompensa oro = new Recompensa("Diamante", 100);
        Recompensa pocion = new Recompensa("Pocion", 50);
        
        Personaje jugador = new Personaje("Curandero");
        elementosDinamicos.add(jugador);
        Utileria utileria = new Utileria();
        elementosDinamicos.add(utileria);
        
        espada.agregar(inventario, 1);
        oro.agregar(inventario, 1);
        pocion.agregar(inventario, 2);

        System.out.println(inventario);

        jugador.mover(5, 12, 0);
        for (ElementoDinamico elemento : elementosDinamicos) {
            elemento.mover(2, 5, 0);
        }
    }
    
    public void agregarElementoDinamico(ElementoDinamico elemento) {
        this.elementosDinamicos.add(elemento);
    }
    public void eliminarElementoDinamico(ElementoDinamico elemento) {
        this.elementosDinamicos.remove(elemento);
    }

}