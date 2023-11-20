import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
        	System.out.println("Calculadora Simples");
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            System.out.print("Digite o número da operação desejada: ");
            int escolha = scanner.nextInt();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.println("O resultado da operação é: " + resultado);
            
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite números válidos.");
        } finally {
            scanner.close();
        }
    }
}