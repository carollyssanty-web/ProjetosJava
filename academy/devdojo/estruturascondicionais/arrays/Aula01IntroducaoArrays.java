package academy.devdojo.estruturascondicionais.arrays;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 9;
        double nota2 = 10.0;
        double nota3 = 8;
        double nota4 = 5;
        double nota5 = 7;
        double nota6 = 6;
        double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;
        System.out.println(media);
        double[] notas = new double[6];
        System.out.println("------------------------------------------");
        notas[0] = 9;
        notas[1] = 10.0;
        notas[2] = 8;
        notas[3] = 5;
        notas[4] = 7;
        notas[5] = 6;
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
        System.out.println(notas[4]);
        System.out.println(notas[5]);
    }
}
