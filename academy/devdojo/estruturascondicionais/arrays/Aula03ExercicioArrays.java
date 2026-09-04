package academy.devdojo.estruturascondicionais.arrays;

import java.util.Scanner;

public class Aula03ExercicioArrays {
    public static void main(String[] args) {
        int[] arrays1 = new int[3];
        int[] arrays2 = new int[3];
        int[] arrays3 = new int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrays1.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            arrays1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrays2.length; i++) {
            System.out.println("Vetor 2, posição " + i + ": ");
            arrays2[i] = scanner.nextInt();
        }
        System.out.println("Vetor 3 multiplicado");
        for (int i = 0; i < arrays3.length; i++) {
            arrays3[i] = arrays1[i] * arrays2[i];
            System.out.print(arrays3[i] + " ");
        }
    }
}