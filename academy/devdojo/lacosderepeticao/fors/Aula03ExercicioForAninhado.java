package academy.devdojo.lacosderepeticao.fors;

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fazendo tabuada do número: " + i);
            /* Enquanto essa condição for true (10) ela será executada. Quando for false (11), vai retomar a partir de for i*/
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + " = " +(i*j));
            }
        }
    }
}
