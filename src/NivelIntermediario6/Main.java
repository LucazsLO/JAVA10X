package NivelIntermediario6;

import NivelIntermediario5.Ninja;

import java.util.*;

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

        NinjaRecord cadastro = new NinjaRecord("Naruto", "naruto@gmail.com", 11111111);
        System.out.println(cadastro.caixaAlta());

        System.out.println("-----------Stack-----------");

        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naturo");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        ninjaStack.push("Orochimaru");
        System.out.println(ninjaStack);
        ninjaStack.pop();
        System.out.println("Stack com pop: " + ninjaStack);
        System.out.println("Stack com peek: " + ninjaStack.peek());
        System.out.println("Tamanho Stcak: " + ninjaStack.size());

        System.out.println("-----------Queue-----------");
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naturo");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        System.out.println(ninjaQueue);
        ninjaQueue.poll();
        System.out.println(ninjaQueue);
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        if(ninjaQueue.isEmpty()){
            System.out.println("Fila Vazia");
        }



    }
}
