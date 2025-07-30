package NivelIntermediario4;

import NivelIntermediario4.Ninja;

public class Uchiha extends Ninja implements SharingaInterface{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    @Override
    public void HablidadeEspecial(){
        System.out.println("Meu nome é " + nome +" e esse é meu ataque Uchiha, jutsu bola de fogo. Eu ja completei " +numeroDeMissoes+" missões!" );
    }

    @Override
    public void SharingaAtivado() {
        System.out.println(nome + " ativou o Sharinga!");
    }
}
