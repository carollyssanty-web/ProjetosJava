package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula4Login {
    public static void main(String[] args) {
        final String login = "Toffin";
        final String password = "Aluno310";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin); {
            System.out.println("Digite seu Login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Dentro do While");
            String passwordDigitado = scanner.nextLine();
        }
    }
}
