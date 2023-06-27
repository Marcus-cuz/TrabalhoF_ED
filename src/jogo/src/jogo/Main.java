package src.jogo;

public class Main {
    
    public static void main(String[] args) {



        Cidade ubud = new Cidade("Ubud", null, null);
        Cidade cidade2 = new Cidade("Cidade 2", null, null);
        
        Grafo grafo = new Grafo();

        grafo.adicionarVertice(ubud);
        grafo.adicionarVertice(cidade2);

        grafo.adicionarAresta(ubud, cidade2);
        grafo.adicionarAresta(cidade2, ubud);

        
        Vertice currentCity = grafo.get(ubud);

        for (int x = 0; x < grafo.getVerticeSize(); x++) {
            System.out.println(currentCity.get(x).getDestino().getCidade().getNome());
        }




    }
}
