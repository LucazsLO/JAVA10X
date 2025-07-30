package NivelIntermediario4;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir 2 novos atributos numeroDeMissoes e Rank

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    RankNinja rank;




    public Ninja(){
    }






    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: SOBRECARGA DO CONSTRUTOR CHAMANDO OS NOVOS ATRIBUTOS

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, RankNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }




    public void HablidadeEspecial(){
        System.out.println("Meu nome é " + nome +" e esse é meu ataque especial! ");
    }

    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("HEHEHE");
    }
}
