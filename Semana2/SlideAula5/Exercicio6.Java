import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largura, altura;
        
        try {
        	System.out.print("Digite a largura do retângulo: ");
            largura = scanner.nextInt();

            System.out.print("Digite a altura do retângulo: ");
            altura = scanner.nextInt();

            int area = calcularArea(largura, altura);

            System.out.println("A área do retângulo é: " + area);
            
        } catch (InputMismatchException e) {
            System.err.println("Por favor, digite números válidos.");
        } finally {
            scanner.close();
        }
        
    }
    
    public static int calcularArea(int largura, int altura) {
        return largura * altura;
    }
}
