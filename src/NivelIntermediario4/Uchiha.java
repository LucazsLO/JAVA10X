package NivelIntermediario4;

import NivelIntermediario4.Ninja;

public class Uchiha extends Ninja implements SharingaInterface{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void HablidadeEspecial(){
        System.out.println("Meu nome é " + nome +" e esse é meu ataque Uchiha, jutsu bola de fogo! ");
    }

    @Override
    public void SharingaAtivado() {
        System.out.println(nome + " ativou o Sharinga!");
    }
}
