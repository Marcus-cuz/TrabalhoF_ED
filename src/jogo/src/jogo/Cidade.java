package src.jogo;

public class Cidade {
    private String nome;
    private LimiarPedra pesoPedra;
    private MissaoRecompensa quest;

    public  Cidade(String nome, LimiarPedra pesoPedra, MissaoRecompensa quest) {
        this.nome = nome;
        this.pesoPedra = pesoPedra;
        this.quest = quest;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LimiarPedra getPesoPedra() {
        return pesoPedra;
    }

    public void setPesoPedra(LimiarPedra pesoPedra) {
        this.pesoPedra = pesoPedra;
    }

    public MissaoRecompensa getQuest() {
        return quest;
    }

    public void setQuest(MissaoRecompensa quest) {
        this.quest = quest;
    }

}
