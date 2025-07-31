package NivelIntermediario4;

public class Uzumaki extends Ninja {

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, RankNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
        this.biju = biju;
    }

    public void Modosabio(){
        System.out.println("Meu nome é " + nome + ". Modo sabio ativado, eu sou do clã Uzumaki!");
    }


    @Override
    public void HablidadeEspecial() {
        System.out.println("Meu nome é " + nome +" e esse é meu ataque Uzumaki, rasengan. E eu tenho  "+ numeroDeMissoes+" missões concluidas!");
    }

    @Override
    public void inteligenciaEmCombate(){
        System.out.println("Meu nome é " + nome +" e esse é minha estrategia de combate! ");
    }

    @Override
    public void inteligenciaEmCombate(int qi){
        System.out.println("Meu nome é " + nome +" e esse é minha estrategia de combate! ");
        if(qi>150){
            System.out.println("Seu QI é: " + qi +" e você é um gênio!");
        }else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi+" você é um ninja promissor!");
        }else{
            System.out.println("Seu QI é: " + qi+" você precisar treinar mais suas estrategias!");
        }
    }
}
