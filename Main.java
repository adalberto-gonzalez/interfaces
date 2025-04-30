public class Main {
    public static void main(String[] args) {
        Nivel nivel = new Nivel();
        Checkpoint checkpoint = new Checkpoint();
        nivel.agregarCheckpoint(checkpoint);
        Checkpoint checkpoint2 = new Checkpoint();
        nivel.agregarCheckpoint(checkpoint);

        Inventario inventario = new Inventario();
        Arma espada = new Arma("Espada", 10);
        Recompensa oro = new Recompensa("Diamante", 100);
        Recompensa pocion = new Recompensa("Pocion", 50);
        
        Personaje jugador = new Personaje("Curandero");
        nivel.agregarElementoDinamico(jugador);
        Utileria utileria = new Utileria();
        nivel.agregarElementoDinamico(utileria);
        
        espada.registrar(inventario, 1);
        oro.registrar(inventario, 1);
        pocion.registrar(inventario, 2);

        System.out.println(inventario);

        jugador.mover(5, 12, 0);
        for (ElementoDinamico elemento : nivel.getElementosDinamicos()) {
            elemento.mover(2, 5, 0);
        }
    }
}