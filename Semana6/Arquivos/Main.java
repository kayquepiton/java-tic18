package Semana6.Arquivos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Ler arquivo com exceção checada");
        System.out.println("2. Ler arquivo com exceção não checada");
        System.out.print("Sua opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        System.out.print("\nDigite o nome do arquivo: ");
        String nomeDoArquivo = scanner.nextLine();
        scanner.close();

        Persistencia persistencia = new Persistencia();

        switch (opcao) {
            case 1:
                try {
                    persistencia.lerDadosChecado(nomeDoArquivo);
                } catch (ArquivoNaoEncontradoException e) {
                    System.err.println("Erro (Checado): " + e.getMessage());
                }
                break;

            case 2:
                try {
                    persistencia.lerDadosNaoChecado(nomeDoArquivo);
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro (Não Checado): " + e.getMessage());
                }
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}

