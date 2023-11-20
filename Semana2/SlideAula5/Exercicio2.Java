import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, peso1, peso2, peso3;

        try {
            nota1 = lerNota(scanner, "Digite a primeira nota: ");
            peso1 = lerPeso(scanner, "Digite o peso da nota: ");

            nota2 = lerNota(scanner, "Digite a segunda nota: ");
            peso2 = lerPeso(scanner, "Digite o peso da nota: ");

            nota3 = lerNota(scanner, "Digite a terceira nota: ");
            peso3 = lerPeso(scanner, "Digite o peso da nota: ");

            float mediaPonderada = calcularMediaPonderada(nota1, peso1, nota2, peso2, nota3, peso3);

            System.out.println("Resultado: " + mediaPonderada);
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite números válidos.");
        } finally {
            scanner.close();
        }
    }

    private static float lerNota(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextFloat();
    }

    private static float lerPeso(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextFloat();
    }

    private static float calcularMediaPonderada(float nota1, float peso1, float nota2, float peso2, float nota3, float peso3) {
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }
}
