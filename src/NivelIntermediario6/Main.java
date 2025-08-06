package NivelIntermediario6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //array
        String [] ninjaArray = new String[3];
        ninjaArray [0] = "Naruto";
        ninjaArray [1] = "Sasuke";
        ninjaArray [2] = "Sakura";

        for (String i : ninjaArray){
        System.out.println("Print array " + i);
        }

        //List
        List <String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Sasuke Uchiha");
        ninjaList.add("Gaara");
        ninjaList.add("Tobi");

        System.out.println("Print List" + ninjaList);

        ninjaList.set(3, "Kakashi");
        System.out.println("Print List" + ninjaList);


        System.out.println("-----------Generics-----------");

        EquipamentoNinja kunai= new EquipamentoNinja("Kunai de ferro");
        EquipamentoNinja espada = new EquipamentoNinja("espada de ferro");
        EquipamentoNinja bomba= new EquipamentoNinja("bomba de fumaça");

        BolsaGenerica <EquipamentoNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(bomba);
        bolsaGenerica.adicionarEquipamentos(espada);

        System.out.println(bolsaGenerica);
    }
}
