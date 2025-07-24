package NivelIntermediario2;

public abstract class Hogakes {

        String nome;
        int idade;
        Boolean VivoouNao;
        String Aldeia;
        int Missao;
        double Altura;

        public abstract void sabedoriaHokage();

        //Noargs (construtor vazio sem argumentos)
        public Hogakes(){
        }

        //construtor com argumentos
        public Hogakes(String nome){
            this.nome = nome;
        }

        public Hogakes (int idade){
            this.idade=idade;
        }

        //All args construtor com TODOS os argumentos
        public Hogakes(String nome, int idade, boolean vivoouNao){
            this.nome = nome;
            this.idade = idade;
            this.VivoouNao = vivoouNao;
        }

        public Hogakes(String nome, int idade, Boolean vivoouNao, String aldeia, int missao, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.VivoouNao = vivoouNao;
            this.Aldeia = aldeia;
            this.Missao = missao;
            this.Altura = altura;
        }
}
