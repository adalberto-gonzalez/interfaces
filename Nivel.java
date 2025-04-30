import java.util.ArrayList;

public class Nivel {
    private ArrayList<ElementoDinamico> elementosDinamicos;
    private ArrayList<Checkpoint> checkpoints;
    private Inventario inventario;

    public Nivel() {
        this.elementosDinamicos = new ArrayList<>();
        this.checkpoints = new ArrayList<>();
        this.inventario = new Inventario();
    }
    
    public void agregarElementoDinamico(ElementoDinamico elemento) {
        this.elementosDinamicos.add(elemento);
    }
    public void eliminarElementoDinamico(ElementoDinamico elemento) {
        this.elementosDinamicos.remove(elemento);
    }

    public void agregarCheckpoint(Checkpoint checkpoint) {
        this.checkpoints.add(checkpoint);
    }

    public void eliminarCheckpoint(Checkpoint checkpoint) {
        this.checkpoints.remove(checkpoint);
    }

    public ArrayList<ElementoDinamico> getElementosDinamicos() {
        return this.elementosDinamicos;
    }

    public ArrayList<Checkpoint> getCheckpoints() {
        return this.checkpoints;
    }
}