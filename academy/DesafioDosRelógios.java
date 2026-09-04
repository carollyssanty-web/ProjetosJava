package academy;

import java.util.ArrayList;

//O Cenário: Em testes técnicos, é muito comum pedirem para você simular históricos.
// Você tem uma lista de alarmes ativos e uma lista que serve como "Lixeira" (Histórico de Exclusão).
// Quando um alarme é deletado da lista principal, ele deve ir automaticamente para a lixeira.
// Se o usuário se arrepender, você deve tirar o alarme da lixeira e devolver para a lista principal.
class DesafioTesteTecnico {
    public static void main(String[] args) {
        ArrayList<String> alarmesAtivos = new ArrayList<>();
        ArrayList<String> lixeira = new ArrayList<>();

        alarmesAtivos.add("08:00");// indice 0
        alarmesAtivos.add("08:30");// indice 1
        alarmesAtivos.add("10:00");// indice 2
        alarmesAtivos.add("17:00");// indice 3
        System.out.println("Alarmes Ativos: " + alarmesAtivos);
        System.out.println("---------------------------------------------------------------");

        lixeira.add("08:30");

        boolean deletou0830 = alarmesAtivos.remove("08:30");
        System.out.println("Movido para lixeira: " + lixeira + deletou0830);
        System.out.println("---------------------------------------------------------------");

        System.out.println("Alarmes Ativos: " + alarmesAtivos);
        System.out.println("---------------------------------------------------------------");

        System.out.println("Desfazer exclusão: " + lixeira);
        lixeira.remove("08:30");
        System.out.println("---------------------------------------------------------------");

        alarmesAtivos.add(1,"08:30");
        System.out.println("Restaurado para Alarmes Ativos: " + alarmesAtivos);
    }
}
