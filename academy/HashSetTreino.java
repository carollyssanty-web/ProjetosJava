package academy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class HashSetTreino {
    public static void main(String[] args) {

        //Primeira alternativa caso a lista receba números duplicados
        //Prioriza a ordem automáticamente
        PriorityQueue<Integer> duplicados = new PriorityQueue<>();

        duplicados.add(5);//REPETIDO
        duplicados.add(10);
        duplicados.add(5);//REPETIDO
        duplicados.add(1);
        duplicados.add(12);

        System.out.println("Antes: " + duplicados);

        //Elimina números duplicados
        HashSet<Integer> naoDuplicados = new HashSet<>(duplicados);

        ArrayList<Integer> novaLista = new ArrayList<>(naoDuplicados);

        System.out.println("Depois: " + novaLista);
    }
}

