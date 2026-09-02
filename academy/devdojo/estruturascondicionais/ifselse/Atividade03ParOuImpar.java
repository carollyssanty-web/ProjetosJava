package academy.devdojo.estruturascondicionais.ifselse;

public class Atividade03ParOuImpar {
    public static void main(String[] args) {
        int numero = 10;
        if( (numero % 2) == 0) {
            System.out.println("PAR: " + (numero % 2));//qualquer número par dividido por 2 vai dar 0.
        } else {
            System.out.println("IMPAR: " + (numero % 2)); //qualquer número ímpar dividido por 2 vai dar 1.
        }
    }
}
