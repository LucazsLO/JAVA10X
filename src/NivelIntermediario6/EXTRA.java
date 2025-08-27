package NivelIntermediario6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EXTRA {
    public static void main(String[] args) {


        System.out.println("-----------Array-----------");
        String [] nomeNinjaArray = new String[4];
        nomeNinjaArray [0] ="Naruto";
        nomeNinjaArray [1] = "Sasuke";
        nomeNinjaArray [2] ="Hinata";
        System.out.println(nomeNinjaArray [3]);

        System.out.println("-----------List-----------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add ("Naruto");
        nomeNinjaList.add("Sasuke");
        nomeNinjaList.add ("Hinata");
        nomeNinjaList.add ("Kakashi");
        System.out.println(nomeNinjaList);


        System.out.println("-----------Stack-----------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push ("Naruto");
        nomeNinjaStack.push("Sasuke");
        nomeNinjaStack.push ("Hinata");
        nomeNinjaStack.push ("Kakashi");
        System.out.println(nomeNinjaStack.pop());
        System.out.println(nomeNinjaStack);
        System.out.println(nomeNinjaStack.pop());
        System.out.println(nomeNinjaStack.pop());
        System.out.println(nomeNinjaStack.pop());


    }
}
