import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        	// Versão 1 - Solicitando a idade
            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }

            // Versão 2 - Solicitando data de nascimento e data atual
            System.out.print("Digite o dia do seu nascimento: ");
            int diaNascimento = scanner.nextInt();
            System.out.print("Digite o mês do seu nascimento: ");
            int mesNascimento = scanner.nextInt();
            System.out.print("Digite o ano do seu nascimento: ");
            int anoNascimento = scanner.nextInt();

            System.out.print("Digite o dia atual: ");
            int diaAtual = scanner.nextInt();
            System.out.print("Digite o mês atual: ");
            int mesAtual = scanner.nextInt();
            System.out.print("Digite o ano atual: ");
            int anoAtual = scanner.nextInt();

            int idadeCalculada = anoAtual - anoNascimento;

            if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
                idadeCalculada--;
            }

            if (idadeCalculada >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }
            
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite números válidos.");
        } finally {
            scanner.close();
        }
    }
}
