package src.jogo;


public class Aresta {
    private int id;
    private Vertice destino;
    private Vertice origem;

    public Aresta (int id, Vertice destino, Vertice origem){
        this.destino = destino;
        this.origem = origem;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Vertice getDestino() {
        return destino;
    }

    public Vertice getOrigem() {
        return origem;
    }

}
