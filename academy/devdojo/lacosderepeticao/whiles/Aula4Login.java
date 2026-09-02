package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula4Login { //REVISAR ESTA AULA
    public static void main(String[] args) {
        final String login = "Toffin";
        final String password = "Aluno310";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite seu Login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (loginDigitado.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("Acesso concedido");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("Acesso negado");
        }
    }
}
