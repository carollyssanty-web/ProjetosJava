package academy.devdojo.estruturascondicionais.arrays;

import java.util.Scanner;

public class Aula03ExercicioArraysMelhorado {
    public static void main(String[] args) {
        int[] arrays1 = new int[3];
        int[] arrays2 = new int[3];
        int[] arrays3 = new int[3];

        Scanner scanner = new Scanner(System.in);

        String array3Multiplicado = "";

        for (int i = 0; i < arrays1.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            arrays1[i] = scanner.nextInt();

            System.out.println("Vetor 2, posição " + i + ": ");
            arrays2[i] = scanner.nextInt();

            arrays3[i] = arrays1[i] * arrays2[i];
            array3Multiplicado = array3Multiplicado + arrays3[i]+" ";
        }
        System.out.println(array3Multiplicado);
    }
}
