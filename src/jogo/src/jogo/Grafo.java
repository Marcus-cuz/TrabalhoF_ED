package src.jogo;
import java.util.ArrayList;
import java.util.List;

class Grafo {
    private ArrayList<Aresta> arestas;
    private ArrayList <Vertice> vertices;

    public void Grafo(<Aresta>arestas, <Vertice>vertices){
        this.arestas = arestas;
        this.vertices = vertices;
    }

    public void adicionarVertice (Vertice vertice){
        vertices.add(vertice);
    }

    public void adicionarAresta(int id, Vertice destino, Vertice origem){
       Aresta arestas = new Aresta(id, destino, origem);
    }

}
