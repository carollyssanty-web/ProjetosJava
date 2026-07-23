package academy.devdojo.estruturascondicionais.ifselse;

public class CalculadoraImposto2 {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        String porcentagem = "";

        if (4500 < salario){ //escopo if
            resultado = salario * 0.3F;
            porcentagem = "30%";

        } else { //escopo else
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
        System.out.println("O valor final em porcentagem de "+porcentagem+"é de "+resultado);
    }
}