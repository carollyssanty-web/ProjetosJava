public class TorneioDeNatação {
    public static void main(String[] args) {
        String nome = "Luffy"; //String é para nomear

        int idade = 19; //número do tipo inteiro

        if (idade <= 10) {
            System.out.println(nome + " participará da categoria INFANTIL");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria JUVENIL");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria PRÉ-ADULTO");
        } else {
            System.out.println(nome + " participará da categoria ADULTO");
        }
    }
}
