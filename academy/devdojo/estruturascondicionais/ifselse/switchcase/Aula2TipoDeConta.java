package academy.devdojo.estruturascondicionais.ifselse.switchcase;

import java.sql.SQLOutput;

public class Aula2TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA INVESTIMENTO";
        switch (conta) {
            case "CONTA POUPANÇA":
                System.out.println("0.05%");
                break;
            case "CONTA CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA INVESTIMENTO":
                System.out.println("0.01%");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");
        }
    }
}
