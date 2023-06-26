package src.jogo;

public class Cidade {
    private String nome;
    private LimiarPedra pesoPedra;
    private Boolean quest;

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
    public Boolean getQuest() {
        return quest;
    }
    public void setQuest(Boolean quest) {
        this.quest = quest;
    }

}
