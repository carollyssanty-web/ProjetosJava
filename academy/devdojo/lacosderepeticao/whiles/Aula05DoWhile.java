package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: digite um número de 1 a 10");
            int num1 = scanner.nextInt();
            System.out.println("PLAYER 2: digite um número de 1 a 10");
            int num2 = scanner.nextInt();
            System.out.println("Acertou " + (num1 == num2));
            System.out.println("--------------------------------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1.SIM");
            System.out.println("2.NÃO");
            desejaContinuar = scanner.nextInt();
        } while (desejaContinuar == 1);
    }
}
