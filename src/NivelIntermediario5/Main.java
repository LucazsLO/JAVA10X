package NivelIntermediario5;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Naruto-----------");
        Uzumaki Naruto = new Uzumaki("Aldeia da folha", 18,"Naruto", 22);
        //System.out.println(Naruto.getNome());
        Naruto.setNome("Naruto Uzumaki");
        System.out.println(Naruto.getNome());
        System.out.println("-----------Sasuke-----------");
        Uchiha Sasuke = new Uchiha("Aldeia da folha", 18,"Sasuke Uchiha", 23);
        System.out.println(Sasuke.getNome());

        System.out.println("-----------Enums-----------");
        Missoes missoes1 = new Missoes("Resgatar cachorro", RankingDeMissoes.D );
        missoes1.exibirMissao();

        Missoes missoes2 = new Missoes("Derrotar Zabuza", RankingDeMissoes.A);
        missoes2.exibirMissao();

    }
}
