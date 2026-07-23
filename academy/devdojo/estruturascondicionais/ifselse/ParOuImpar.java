package academy.devdojo.estruturascondicionais.ifselse;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 10;
        if( (numero % 2) == 0) {
            System.out.println("PAR: " + (numero % 2));
        } else {
            System.out.println("IMPAR: " + (numero % 2));
        }
    }
}
