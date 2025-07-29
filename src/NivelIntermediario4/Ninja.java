package NivelIntermediario4;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;

    public Ninja(){
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    public void HablidadeEspecial(){
        System.out.println("Meu nome é " + nome +" e esse é meu ataque especial! ");
    }

    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("HEHEHE");
    }
}
