package src.jogo;
import java.util.ArrayList;

public class Vertice {
    private Cidade cidades;
    private ArrayList<Aresta> saida = new ArrayList<Aresta>();

    public Vertice (Cidade cidades){
        this.cidades = cidades;
    }

    public void insertSaida (Aresta aresta) {
        saida.add(aresta);
    }

    public Cidade getCidade () {
        return this.cidades;
    }

    public Aresta get (int position) {
        return saida.get(position);
    }
    
}
