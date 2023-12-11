package Semana6.DivisaoPorZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("\nDigite o numerador: ");
            double numerador = scanner.nextDouble();

            System.out.print("Digite o denominador: ");
            double denominador = scanner.nextDouble();

            try {
                double resultado = dividir(numerador, denominador);
                System.out.println("Resultado da divisão: " + resultado);
            } catch (DivisionByZeroException e) {
                System.out.println("Erro na divisão: " + e.getMessage());
            }

            System.out.print("\nDeseja realizar outra divisão? (S/N): ");
            char resposta = scanner.next().charAt(0);
            continuar = (resposta == 'S' || resposta == 's');
        }

        System.out.println("Programa encerrado. Obrigado por usar a calculadora!");
        scanner.close();
    }

    private static double dividir(double numerador, double denominador) throws DivisionByZeroException {
        if (denominador == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }
}
