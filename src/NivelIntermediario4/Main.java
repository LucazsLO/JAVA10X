package NivelIntermediario4;

public class Main {

    public static void main(String[] args) {



        // Object 1: Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.HablidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();

        // Object 2: Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.HablidadeEspecial();

        //Object 3: Itachi
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "aldeia da folha", 27);
        Itachi.HablidadeEspecial();
    }
}
