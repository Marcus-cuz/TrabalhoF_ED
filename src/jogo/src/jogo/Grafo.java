package src.jogo;
import java.util.ArrayList;
import java.util.List;

class Grafo {
    private ArrayList<Aresta> arestas = new ArrayList<>();
    private ArrayList <Vertice> vertices = new ArrayList<>();

    public void adicionarVertice (Cidade cidade){
        Vertice node = new Vertice(cidade);
        vertices.add(node);
    }

    public void adicionarAresta(Cidade inicio, Cidade fim){
       Vertice start = this.get(inicio);
       Vertice end = this.get(fim);

       Aresta aresta = new Aresta(start, end);

       end.insertSaida(aresta);

       arestas.add(aresta);


    }

    public Vertice get(Cidade cidade){
        Vertice data = null;

        for (int x = 0; x < vertices.size(); x++) {
            if (vertices.get(x).getCidade() == cidade) {
                data = vertices.get(x);
            }
        }

        return data;
    }

    public int getVerticeSize () {
        return this.vertices.size();
    }

    public Vertice getVertice (int position) {
        return this.vertices.get(position);
    }
}
