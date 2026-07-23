package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = input.next();

        if(nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) { //na String é usado equals
            System.out.println("Usuário inválido");
        }else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
