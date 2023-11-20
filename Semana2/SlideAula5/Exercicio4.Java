import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		String resultado;
		
		try {
			numero = lerNumero(scanner, "Digite o número: ");
			
			resultado = verificaParImpar(numero);
			
			System.out.println("Resultado: " + resultado);
            
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite números válidos.");
        } finally {
            scanner.close();
        }
		
	}
	
	private static int lerNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }
	
	private static String verificaParImpar(int numero) {
		String resultado;
		if(numero % 2 == 0)
			resultado = "Par";
		else
			resultado = "Impar";
        return (resultado);
    }

}
