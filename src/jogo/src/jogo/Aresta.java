package src.jogo;


public class Aresta {
    private Vertice destino;
    private Vertice origem;

    public Aresta (Vertice destino, Vertice origem){
        this.destino = destino;
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public Vertice getOrigem() {
        return origem;
    }

}
