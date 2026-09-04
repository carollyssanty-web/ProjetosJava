package academy;

import java.util.ArrayList;

public class ArrayListTreino {
    public static void main(String[] args) {
        ArrayList<Integer> intvalue = new ArrayList<>();

        // intvalue.size() retorna o tamanho da lista após adicionar um número
        intvalue.add(5);
        System.out.println(intvalue.size() + "; container state" + intvalue);
        intvalue.add(10);
        System.out.println(intvalue.size() + "; container state" + intvalue);
        intvalue.add(5);
        System.out.println(intvalue.size() + "; container state" + intvalue);

        //para remover por valor em uma lista de números é usado 'Interger.valueOf'
        //para ele não confundir com o índice/index (posição)
        boolean deletou10 = intvalue.remove(Integer.valueOf(10));
        System.out.println(deletou10 + "; container state: " + intvalue);

        boolean deletou1 = intvalue.remove(Integer.valueOf(1));
        System.out.println(deletou1 + "; container state: " + intvalue);

        intvalue.add(1);
        System.out.println(intvalue.size() + "; container state" + intvalue);
    }
}
