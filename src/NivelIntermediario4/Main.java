package NivelIntermediario4;

public class Main {

    public static void main(String[] args) {

        // Object 1: Naruto
        System.out.println("-----------Naruto-----------");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17,20,RankNinja.GENIN, Biju.KURAMA);
        Naruto.HablidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();
        System.out.println(Naruto.biju);

        // Object 2: Sasuke
        System.out.println("-----------Sasuke-----------");
        Uchiha Sasuke = new Uchiha("Sasuke uchiha","Aldeia da Folha", 18, 22, RankNinja.GENIN);
        Sasuke.HablidadeEspecial();
        Sasuke.SharingaAtivado();

        //Object 3: Itachi
        System.out.println("-----------Itachi-----------");
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "aldeia da folha", 27);
        Itachi.HablidadeEspecial();

        //Object 4: Kakashi
        System.out.println("-----------Kakashi-----------");
        Hatake Kakashi = new Hatake("Kakashi Hatake","Aldeia da Folha",30,100,RankNinja.JOUNIN);
        Kakashi.SharingaAtivado();
        Kakashi.NinjaDeElite();

        //Object 5: Madara
        System.out.println("-----------Madara-----------");
        Uchiha Madara = new Uchiha("Uchiha Madara","aldeia da folha",40, 900, RankNinja.KAGE );
        Madara.HablidadeEspecial();
        Madara.SharingaAtivado();
        Madara.inteligenciaEmCombate(190);
    }
}
