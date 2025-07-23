package NivelIntermediario2;

public class Main {
    public static void main(String[] args) {

        Hogakes Hashirama = new Hogakes();
        Hashirama.idade= 45;

        Hogakes Tobirama = new Hogakes( "Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hogakes Hiruzen = new Hogakes(77);
        System.out.println(Hiruzen.idade);

        Hogakes Minato = new Hogakes("minato",32,false );
        System.out.println(Minato.VivoouNao);
    }
}
