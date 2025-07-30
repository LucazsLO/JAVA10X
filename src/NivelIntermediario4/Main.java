package NivelIntermediario4;

public class Main {

    public static void main(String[] args) {



        // Object 1: Naruto
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17,20,RankNinja.GENIN );
        Naruto.HablidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();


        // Object 2: Sasuke
        Uchiha Sasuke = new Uchiha("Sasuke uchiha","Aldeia da Folha", 18, 22, RankNinja.GENIN);
        Sasuke.HablidadeEspecial();
        Sasuke.SharingaAtivado();

        //Object 3: Itachi
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "aldeia da folha", 27);
        Itachi.HablidadeEspecial();

        //Object 4: Kakashi
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 30;
        Kakashi.BoasVindas();
        Kakashi.SharingaAtivado();
        Kakashi.NinjaDeElite();

        //Object 5: Madara
        Uchiha Madara = new Uchiha("Uchiha Madara","aldeia da folha",40, 900, RankNinja.KAGE );
        Madara.HablidadeEspecial();
        Madara.SharingaAtivado();
    }
}
