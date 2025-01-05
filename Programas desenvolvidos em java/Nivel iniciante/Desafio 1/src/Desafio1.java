import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];
        int[] idades = new int[3];
        String[] missoes = new String[3];
        String[] niveisDificuldade = new String[3];
        String[] statusConclusao = new String[3];

        System.out.println("Insira os dados dos ninjas:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "° Ninja ");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Missão: ");
            missoes[i] = scanner.nextLine();
            System.out.print("Nível de Dificuldade (A, B, C, D, E, F): ");
            niveisDificuldade[i] = scanner.nextLine();
            statusConclusao[i] = "Pendente";
            System.out.println("---------------------------");
        }
        //Verificando se os ninjas podem concluir as missões
        analises(idades, niveisDificuldade, statusConclusao);

        //Imprimindo os resultados finais
        resultados(nomes, idades, missoes, niveisDificuldade, statusConclusao);

        scanner.close();
    }

    //Método para analisar se os ninjas podem concluir as missões
    public static void analises(int[] idades, String[] niveisDificuldade, String[] statusConclusao) {
        for (int i = 0; i < 3; i++) {
            if (idades[i] < 15) {
                if (niveisDificuldade[i].equalsIgnoreCase("C") || niveisDificuldade[i].equalsIgnoreCase("D")) {
                    statusConclusao[i] = "concluída";
                } else {
                    statusConclusao[i] = "não concluída";
                }
            } else {
                statusConclusao[i] = "concluída";
            }
        }
    }
    //Método para imprimir os resultados finais
    public static void resultados(String[] nomes, int[] idades, String[] missoes, String[] niveisDificuldade, String[] statusConclusao) {
        System.out.println("Resultados após a verificação:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ninja: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Missão: " + missoes[i]);
            System.out.println("Nível de Dificuldade: " + niveisDificuldade[i]);
            System.out.println("Status: " + statusConclusao[i]);
            System.out.println("---------------------------");
        }
    }
}