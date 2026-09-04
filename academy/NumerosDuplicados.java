package academy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class NumerosDuplicados {
    public static void main(String[] args) {

        //Segunda alternativa caso a lista tenha números duplicados
        //Tratando já na entrada
        PriorityQueue<Integer> ordemNumerica = new PriorityQueue<>();
        int[] seguirOrdem = {5,10,5,1,12};

        //Para sair o número inteiro ele precisa estar na lista seguirORDEM
        //SE ondemNumerica NÃO CONTER o némero, ordemNumerica deve ADICIONAR número
        for (int num: seguirOrdem) {
            if (!ordemNumerica.contains(num)) {
                ordemNumerica.add(num);
            }
        }
        //Enquanto ordemNumerica NÃO ESTIVER VAZIA, imprima ordemNumeria
        while (!ordemNumerica.isEmpty()) {
            System.out.println(ordemNumerica.poll());
        }
    }
}
