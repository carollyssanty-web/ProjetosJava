import java.util.Scanner;

public class TorneioDeNatacao2 {
    public static void main(String[] args) {
        String categoria = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Nome do participante: "+nome);
        System.out.println("Idade do participante: "+idade);
        System.out.println("Participará da categoria: "+categoria);

        if (idade <= 10) {
            System.out.println("INFANTIL");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("JUVENIL");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("PRÉ-ADULTO");
        } else {
            System.out.println("ADULTO");
        }
    }
}
