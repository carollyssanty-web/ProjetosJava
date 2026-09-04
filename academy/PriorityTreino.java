package academy;

import java.util.PriorityQueue;

public class PriorityTreino {
    public static void main(String[] args) {

        //Reorganiza para deixar o menor número na frente (no topo)
        //Elimina a processo de rodar Collections.sort o tempo todo
        PriorityQueue<Integer> listaint = new PriorityQueue<>();

        listaint.add(5);
        listaint.add(10);
        listaint.add(5);
        listaint.add(1);
        listaint.add(12);

        //.peek() olha quem está na frente sem remover
        System.out.println("O menor número é: " + listaint.peek());

        //.poll remove quem está na frente
        System.out.println("Primeiro número removido: " + listaint.poll());

        //5 agora é o novo menor número
        System.out.println("Novo menor número: " + listaint.peek());

        //Ordem real da saída
        System.out.println("\n--- Na ordem crescente: ---");

        //! é a negação, ou seja, enquanto a listaint não estiver vazia,
        //imprima listint sem o número 1
        while (!listaint.isEmpty()){
            System.out.println(listaint.poll());
        }
    }
}