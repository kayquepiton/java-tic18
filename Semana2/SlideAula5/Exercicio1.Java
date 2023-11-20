import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int a = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = scanner.nextInt();

            int c = a + b;

            System.out.println("Resultado: " + c);
        } catch (java.util.InputMismatchException e) {
            System.err.println("Por favor, digite números inteiros válidos.");
        } finally {
            // Fecha o objeto Scanner no bloco finally para garantir que seja fechado, mesmo em caso de exceção
            scanner.close();
        }
    }
}
