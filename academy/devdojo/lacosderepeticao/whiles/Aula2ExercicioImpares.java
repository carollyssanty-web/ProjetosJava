package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula2ExercicioImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int valorFinal = teclado.nextInt();
        int i = 0;
        while (i <= valorFinal) {
            //SE o RESTO DA DIVISÃO de i por 2 for DIFERENTE de 0, o número é ímpar
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}
