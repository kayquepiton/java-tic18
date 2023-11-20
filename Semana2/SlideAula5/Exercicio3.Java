import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome, sobrenome, nomeCompleto;
		
		try {
			nome = lerString(scanner, "Digite o nome: ");
			
			sobrenome = lerString(scanner, "Digite o sobrenome: ");
			
			nomeCompleto = concatenaString(nome, sobrenome);;
			
			System.out.println("Nome completo: " + nomeCompleto);
            
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite nomes válidos.");
        } finally {
            scanner.close();
        }
		
	}
	
	private static String lerString(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
	
	private static String concatenaString(String nome, String sobrenome) {
        return (nome + ' ' + sobrenome);
    }

}
