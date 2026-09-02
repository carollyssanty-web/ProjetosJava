package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class Atividade07CadastroDeLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = input.next();
        /*.equalsIgnoreCase não faz distinção entre letras maiúsculas e minúsculas. EX: JAVA ou Java são o mesmo que java*/
        //.equals faz a distinção de letras maiúsculas e minúsculas
        if(nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        }else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
