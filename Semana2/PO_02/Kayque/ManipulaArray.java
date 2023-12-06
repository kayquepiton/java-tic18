import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo array do usuário
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] arrayUsuario = criarArrayUsuario(tamanho);

        // Criando array aleatório
        int[] arrayAleatorio = criarArrayAleatorio(tamanho);

        // Exibindo arrays
        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        // Calculando soma, maior e menor
        System.out.println("Soma do array do usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Maior valor do array do usuário: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor do array do usuário: " + encontrarMenorValor(arrayUsuario));
    }

    public static int[] criarArrayUsuario(int tamanho) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Números aleatórios entre 0 e 99
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;

        for (int elemento : array) {
            soma += elemento;
        }

        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];

        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }

        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];

        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        return menor;
    }
}
