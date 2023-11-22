import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gerando número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa, palpite;

        System.out.println("Jogo de Adivinhação");
        tentativa = 1;

        // Loop principal do jogo
        do {
            // Solicitação do palpite ao usuário
            System.out.print("Tentativa #" + tentativa + ": Insira seu palpite (entre 1 e 100): ");
            palpite = scanner.nextInt();

            // Fornecendo dicas ao usuário
            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto. Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo. Tente novamente.");
            }

            // Incrementando o número de tentativas
            tentativa++;
        } while (palpite != numeroAleatorio);

        // Mensagem de parabéns ao acertar o número
        System.out.println("Parabéns! Você acertou em " + (tentativa - 1) + " tentativas.");
    }
}
