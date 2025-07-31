package NivelIntermediario4;

public class Hatake extends Ninja implements SharingaInterface,AnbuInterface{

    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoes, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    public void BoasVindas(){
        System.out.println("Meu nome é " + nome + ". Estou lendo meu livro educativo, eu sou do clã Hatake!");
    }

    @Override
    public void NinjaDeElite() {
        System.out.println("Eu sou " + nome +" e ja fui um Ninja de Elite da Anbu!");
    }

    @Override
    public void SharingaAtivado() {
        System.out.println(nome + " ativou o Sharingan!");
    }
}
