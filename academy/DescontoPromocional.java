package academy;

import java.util.Scanner;

public class DescontoPromocional {
    public static void main(String[] args) {
        int compras = 200;
        float porcentagem = 10;
        float descontoNasCompras = compras * (porcentagem / 100);

        Scanner input = new Scanner(System.in);

        while (compras != 0) {
            System.out.println("Valor da próxima compra: ");
            compras = input.nextInt();

            if (compras != 0) {

                if (compras >= 200) {
                    System.out.println("Preço final com desconto: R$" + (compras - descontoNasCompras));
                } else {
                    System.out.println("Sem Desconto");
                }
            }
        }
    }
}
