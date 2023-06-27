package src.jogo;

public class IniciarMapa {
    static Grafo grafo = new Grafo();

    private static Vertice criarCidades(String nome, int pesoPedra, boolean quest) {
        return null;
    }

    public static void adicionarCidade(Cidade nome, Cidade pesoPedra , Cidade quest){
        grafo.adicionarVertice(criarCidades("abud", 0 , false));
        grafo.adicionarVertice(criarCidades("Kingdom of Legmod", 2 , false));
        grafo.adicionarVertice(criarCidades("Principality of Nekikh", 1 , false));
        grafo.adicionarVertice(criarCidades("Principality of Gritesthr", 5 , false));
        grafo.adicionarVertice(criarCidades("Protectorate of Dogrove", 3 , false));
        grafo.adicionarVertice(criarCidades("Kingdom of Lastwatch", -2 , false));
        grafo.adicionarVertice(criarCidades("Grand Duchy of Smalia", 1 , false));
        grafo.adicionarVertice(criarCidades("Kingdom of Oldcalia ", 4 , false));
        grafo.adicionarVertice(criarCidades("Kingdom of Kalb", 2 , true));
        grafo.adicionarVertice(criarCidades("Aymar League", 1 , false));
        grafo.adicionarVertice(criarCidades("Defalsia", -3 , true));
        grafo.adicionarVertice(criarCidades("Vunese of Empire", 0 , true));
        grafo.adicionarVertice(criarCidades("Principality of Karhora", -2 , false));
        grafo.adicionarVertice(criarCidades("Chandir Sultanate ", 1 , false));
        grafo.adicionarVertice(criarCidades("Bun", 5 , false));
        grafo.adicionarVertice(criarCidades("Principality of Kasya", 7 , false));
        grafo.adicionarVertice(criarCidades("Nargumun", 0 , false));
    }


    public static Aresta criarCaminhos(int id,Vertice origem , Vertice destino){
        return null;
    }


    public static void adicionarCaminho(Aresta id,Aresta origem, Aresta destino){
        grafo.adicionarAresta(0,null , null);
        grafo.adicionarAresta(0, null, null);

    }





}