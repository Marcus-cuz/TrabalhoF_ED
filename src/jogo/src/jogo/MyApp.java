package src.jogo;

public class MyApp {
    public static void main(String[] args) {
        
        City ubud = new City("Ubud");
        City cidade2 = new City("kingdom of legmond");
        City cidade3 = new City("Principality of Nekikh");
        City cidade4 = new City("Principality of Gritesthr");
        City cidade5 = new City("Protectorate of Dogrove");
        City cidade5 = new City("Kingdom of Lastwatch");
        City cidade6 = new City("Grand Duchy of Smalia");
        City cidade7 = new City("Kingdom of Oldcalia");
        City cidade8 = new City("Kingdom of Kalb");
        City cidade9 = new City("Aymar League");
        City cidade10 = new City("Defalsia");
        City cidade11 = new City("Vunese of Empire");
        City cidade12 = new City("Principality of Karhora");
        City cidade13 = new City("Chandir Sultanate");
        City cidade14 = new City("Bun ");
        City cidade15 = new City("Principality of Kasya");
        City cidade16 = new City("Nargumun");

        Graph grafo = new Graph();

        grafo.insertVertice(ubud);
        grafo.insertVertice(cidade2);
        grafo.insertVertice(cidade3);
        grafo.insertVertice(cidade4);
        grafo.insertVertice(cidade5);
        grafo.insertVertice(cidade6);
        grafo.insertVertice(cidade7);
        grafo.insertVertice(cidade8);
        grafo.insertVertice(cidade9);
        grafo.insertVertice(cidade10);
        grafo.insertVertice(cidade11);
        grafo.insertVertice(cidade12);
        grafo.insertVertice(cidade13);
        grafo.insertVertice(cidade14);
        grafo.insertVertice(cidade15);
        grafo.insertVertice(cidade16);

        grafo.insertAresta(ubud, cidade2);
        grafo.insertAresta(ubud, cidade3);
        grafo.insertAresta(cidade2, cidade7);

        Vertice currentCity = grafo.get(ubud);

        for (int x = 0; x < currentCity.getSize(); x++) {
            System.out.println(x + "\t" + currentCity.getVertice(x).getEnd().getCity().getName());
        }



    }
}
