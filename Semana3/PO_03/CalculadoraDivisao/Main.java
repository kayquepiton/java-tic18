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
                        executarOperacao("somar", calculadora, scanner);
                        break;
                    case 2:
                        executarOperacao("subtrair", calculadora, scanner);
                        break;
                    case 3:
                        executarOperacao("multiplicar", calculadora, scanner);
                        break;
                    case 4:
                        executarOperacao("dividir", calculadora, scanner);
                        break;
                    case 0:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
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
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.print("Escolha a operação: ");
    }

    private static void executarOperacao(String operacao, Calculadora calculadora, Scanner scanner) {
        System.out.print("\nQuantos números você deseja " + operacao + "? ");
        int quantidadeNumeros = scanner.nextInt();

        try {
            switch (operacao) {
                case "somar":
                case "subtrair":
                case "multiplicar":
                    executarOperacaoNumeros(operacao, calculadora, scanner, quantidadeNumeros);
                    break;
                case "dividir":
                    executarOperacaoDivisao(calculadora, scanner, quantidadeNumeros);
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void executarOperacaoNumeros(String operacao, Calculadora calculadora, Scanner scanner, int quantidadeNumeros) {
        double resultado = (operacao.equals("multiplicar")) ? 1 : 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();

            switch (operacao) {
                case "somar":
                    resultado = calculadora.somar(resultado, numero);
                    break;
                case "subtrair":
                    resultado = calculadora.subtrair(resultado, numero);
                    break;
                case "multiplicar":
                    resultado *= numero;
                    break;
            }
        }

        System.out.println("Resultado da operação" + ": " + resultado);
    }

    private static void executarOperacaoDivisao(Calculadora calculadora, Scanner scanner, int quantidadeNumeros) {
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
                resultado = calculadora.dividir(resultado, numero);
            } catch (DivisionByZeroException e) {
                System.out.println("Erro na divisão: " + e.getMessage());
                return;
            }
        }

        System.out.println("Resultado da divisão: " + resultado);
    }
}
