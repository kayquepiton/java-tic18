package Semana6.CalculadoraExecoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            exibirMenu();

            int escolha = scanner.nextInt();

            try {
                Calculadora calculadora = new Calculadora();

                switch (escolha) {
                    case 1:
                        realizarOperacao("soma", calculadora, scanner);
                        break;
                    case 2:
                        realizarOperacao("subtração", calculadora, scanner);
                        break;
                    case 3:
                        realizarOperacao("multiplicação", calculadora, scanner);
                        break;
                    case 4:
                        realizarOperacao("divisão", calculadora, scanner);
                        break;
                    case 5:
                        realizarOperacao("resto da divisão", calculadora, scanner);
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Programa encerrado. Obrigado por usar a calculadora!");
        scanner.close(); // Fechar o scanner para evitar vazamentos de recursos
    }

    private static void exibirMenu() {
        System.out.println("\n===== CALCULADORA =====");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto da Divisão");
        System.out.println("0 - Sair");
        System.out.print("Escolha a operação desejada: ");
    }

    private static void realizarOperacao(String operacao, Calculadora calculadora, Scanner scanner) {
        //System.out.print("\nQuantos números você deseja " + operacao + "? ");
        //int quantidadeNumeros = scanner.nextInt();
        int quantidadeNumeros = 2;

        try {
            switch (operacao) {
                case "soma":
                case "subtração":
                case "multiplicação":
                    realizarOperacaoNumeros(operacao, calculadora, scanner, quantidadeNumeros);
                    break;
                case "divisão":
                    realizarOperacaoDivisao(calculadora, scanner, quantidadeNumeros);
                    break;
                case "resto da divisão":
                    realizarOperacaoResto(calculadora, scanner, quantidadeNumeros);
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void realizarOperacaoNumeros(String operacao, Calculadora calculadora, Scanner scanner, int quantidadeNumeros) {
        double resultado = (operacao.equals("multiplicar")) ? 1 : 0;
    
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
    
            switch (operacao) {
                case "somar":
                    resultado = calculadora.somarPontoFlutuante(resultado, numero);
                    break;
                case "subtrair":
                    resultado = calculadora.subtrairPontoFlutuante(resultado, numero);
                    break;
                case "multiplicar":
                    resultado *= numero;
                    break;
            }
        }
    
        System.out.println("Resultado da operação " + operacao + ": " + resultado);
    }
    

    private static void realizarOperacaoDivisao(Calculadora calculadora, Scanner scanner, int quantidadeNumeros) {
        if (quantidadeNumeros < 2) {
            System.out.println("Operação de divisão requer pelo menos dois números.");
            return;
        }

        System.out.print("Digite o numerador: ");
        double resultado = scanner.nextDouble();

        for (int i = 1; i < quantidadeNumeros; i++) {
            System.out.print("Digite o denominador " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            try {
                resultado = calculadora.dividirPontoFlutuante(resultado, numero);
            } catch (DivisionByZeroException e) {
                System.out.println("Erro na divisão: " + e.getMessage());
                return;
            }
        }

        System.out.println("Resultado da divisão: " + resultado);
    }

    private static void realizarOperacaoResto(Calculadora calculadora, Scanner scanner, int quantidadeNumeros) {
        if (quantidadeNumeros < 2) {
            System.out.println("Operação de resto requer pelo menos dois números.");
            return;
        }

        System.out.print("Digite o numerador: ");
        double resultado = scanner.nextDouble();

        for (int i = 1; i < quantidadeNumeros; i++) {
            System.out.print("Digite o denominador " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            try {
                resultado = calculadora.obterRestoDivisaoPontoFlutuante(resultado, numero);
            } catch (DivisionByZeroException e) {
                System.out.println("Erro na divisão: " + e.getMessage());
                return;
            }
        }

        System.out.println("Resultado da operação de resto: " + resultado);
    }
}
