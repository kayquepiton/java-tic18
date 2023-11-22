import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação da taxa de câmbio ao usuário
        System.out.println("Conversor de Moedas");
        System.out.print("Insira a taxa de câmbio: ");
        double taxaCambio = scanner.nextDouble();

        // Solicitação da quantidade em dólares ao usuário
        System.out.print("Insira a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        // Chamada da função para converter a moeda e exibição do resultado
        double valorConvertido = converterMoeda(quantidadeDolares, taxaCambio);
        System.out.println("Valor convertido: " + valorConvertido);
    }

    // Função para converter a moeda
    public static double converterMoeda(double quantidadeDolares, double taxaCambio) {
        return quantidadeDolares * taxaCambio;
    }
}
