package academy;

public class ContagemRegressivaDoFoguete {
    public static void main(String[] args) {
        System.out.println("Lançamento em...");
        int i = 10;
        while (i >= 0) {
            if (i == 5) {
                System.out.println("Metade do caminho!");
            } else if (i == 0) {
                System.out.println("Lançar");
            } else {
                System.out.println(i);
            }
            i = i - 1;
        }
    }
}
