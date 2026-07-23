package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {

        char sexo = 'F';

        Scanner input = new Scanner(System.in);

        System.out.println("Sexo: ");
        String nome = input.next();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatóro");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar?");
        }
    }
}
