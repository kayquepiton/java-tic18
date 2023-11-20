import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);

        int a, b, c;
    	
    	try {
        	System.out.print("Digite o primeiro número: ");
            a = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            b = scanner.nextInt();
            
            // Troca utilizando variável temporária
            c = a;
            a = b;
            b = c;

            System.out.println("Valores trocados com temp: a = " + a + ", b = " + b);
            
            
            // Troca utilizando soma/subtração
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("Valores após a troca com soma/subtração: a = " + a + ", b = " + b);
            
            
            // Troca usando XOR
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("Valores após a troca usando XOR: a = " + a + ", b = " + b);
            
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite números válidos.");
        } finally {
            scanner.close();
        }

        
    }
    
    
}
