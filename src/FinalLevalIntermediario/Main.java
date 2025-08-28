package FinalLevalIntermediario;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> listaDeNinja = new LinkedList<>();
        listaDeNinja.add(new Ninja("Naruto", 17, "folha"));
        listaDeNinja.add(new Ninja("Sasuke", 18, "folha"));
        listaDeNinja.add(new Ninja("Hinata", 14, "folha"));
        listaDeNinja.add(new Ninja("Sakura", 15, "folha"));
        listaDeNinja.add(new Ninja("Gaara", 16, "Areia"));
        listaDeNinja.add(new Ninja("Kakashi", 23, "folha"));
        listaDeNinja.add(new Ninja("Tobi", 23, "null"));
        listaDeNinja.add(new Ninja("Minato", 30, "folha"));

        System.out.println(" ***************** Lista de ninja ***************** ");

        for(Ninja ninja : listaDeNinja){
            System.out.println(ninja);
        }

        System.out.println("================Novo ninja adicionado================");

        listaDeNinja.addFirst(new Ninja("Teamari", 17,"Areia" ));
        for(Ninja ninja : listaDeNinja){
            System.out.println(ninja);
        }

        System.out.println("================Ninja removido================");
        Ninja removido = listaDeNinja.removeFirst();
        System.out.println("Ninja removido" + removido);

        System.out.println("================Lista Modifica================");
        for(Ninja listaAtualizada : listaDeNinja){
            System.out.println(listaAtualizada);
        }

        System.out.println("================Procurar Ninja================");

        Ninja procurarNinja = listaDeNinja.get(3);
        System.out.println("O ninja que você procura é: " + procurarNinja);

        System.out.println("================Realizando missão Ninja================");
        Ninja missão = listaDeNinja.poll();
        Ninja missão1 = listaDeNinja.poll();
        System.out.println("Os dados do ninja que foi pra missão é: " + missão);
        System.out.println("Os dados do ninja que foi pra missão é: " + missão1);

        System.out.println("================Ninjas na Lista================");
        int quantidadeDeNinja = listaDeNinja.size();
        System.out.println(quantidadeDeNinja + " ninjas encontrado na lista:");
        for(Ninja ninja : listaDeNinja){
            System.out.println(ninja);
        }
    }

}
