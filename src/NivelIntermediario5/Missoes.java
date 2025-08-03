package NivelIntermediario5;

public class Missoes {

    private String nome;
    private RankingDeMissoes rank;


    public void exibirMissao(){
        System.out.println("Missão " + nome + "Rank: "+rank + " Descrição: " + rank.getDescricao() + " Dificuldade " + rank.getDificuldade());
    }

    public Missoes(String nome, RankingDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankingDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankingDeMissoes rank) {
        this.rank = rank;
    }
}