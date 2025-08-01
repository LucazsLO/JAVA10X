package NivelIntermediario1;

public class Main {
    public static void main(String[] args) {
        // Object 1: Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade=   17;
        Naruto.HablidadeEspecial();
        //Naruto.Modosabio();

        // Object 2: Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome= "Sasuke uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.HablidadeEspecial();
        //Sasuke.SharinganAtivado();


        // Object 3: Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade= 18;
        Sakura.HablidadeEspecial();
        //Sakura.ModoHaruno();

        // Object 4: Hinata
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade= 16;
        Hinata.HablidadeEspecial();
        //Hinata.modoHyuga();

        //Object 5:Boruto
        Boruto Boruto = new Boruto();
        Boruto.nome= "Boruto Hyuga Uzumaki";
        Boruto.aldeia="Aldeia da folha";
        Boruto.idade= 9;
        Boruto.Modosabio();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();
    }
}
