package Desafio_2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNinjas = 0;
        // Método para escolher quantidade de ninjas
        quantidadeNinjas = quantidade(scanner);

        String[] nomes = new String[quantidadeNinjas];
        int[] idades = new int[quantidadeNinjas];
        String[] nivelninja = new String[quantidadeNinjas];
        int[] quantidadeMissoes = new int[quantidadeNinjas];
        int opcoes;

        do {
            // Método do menu
            opcoes = menu(scanner);

            switch (opcoes) {
                case 1:
                    for (int i = 0; i < quantidadeNinjas; i++) {
                        System.out.println((i + 1) + "° Ninja ");
                        System.out.print("Nome: ");
                        nomes[i] = scanner.next();
                        System.out.print("Idade: ");
                        idades[i] = scanner.nextInt();
                        scanner.nextLine(); // Consumir a quebra de linha
                        System.out.print("Nível do ninja (os níveis são: Genin, Chūnin, Jōnin e Kage): ");
                        nivelninja[i] = scanner.nextLine();
                        System.out.print("Quantidade de missões concluídas: ");
                        quantidadeMissoes[i] = scanner.nextInt();
                        System.out.println("---------------------------");
                    }
                    break;

                case 2:
                    if (quantidadeNinjas < 10) {
                        for (int i = 0; i < quantidadeNinjas; i++) {
                            System.out.println((i + 1) + "° Ninja ");
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Idade: " + idades[i]);
                            System.out.println("Nível do ninja: " + nivelninja[i]);
                            System.out.println("Quantidade de missões concluídas: " + quantidadeMissoes[i]);
                            System.out.println("---------------------------");
                        }
                    } else {
                        for (int i = 0; i < quantidadeNinjas; i++) {
                            System.out.println((i + 1) + "° Ninja || Nome: " + nomes[i] + " || Idade: " + idades[i] + " || Nível do ninja: " + nivelninja[i] + " || Quantidade de missões realizadas: " + quantidadeMissoes[i] +" .");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcoes != 3);

        scanner.close();
    }

    // Método para escolher quantidade de ninjas
    public static int quantidade(Scanner scanner) {
        int quantidadeNinjas = 0;
        while (true) {
            try {
                System.out.print("Digite a quantidade de ninjas que quer cadastrar: ");
                quantidadeNinjas = scanner.nextInt();
                if (quantidadeNinjas > 0) {
                    break;
                } else {
                    System.out.println("A quantidade deve ser um número inteiro positivo!");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }
        return quantidadeNinjas;
    }

    // Método do menu
    public static int menu(Scanner scanner) {
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma das opções acima: ");
        int opcoes = scanner.nextInt();
        return opcoes;
    }
}