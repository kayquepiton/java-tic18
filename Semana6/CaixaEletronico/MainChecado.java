package Semana6.CaixaEletronico;

// MainChecado.java
import java.util.Scanner;

public class MainChecado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o saldo inicial do caixa eletrônico: ");
        int saldoInicial = scanner.nextInt();

        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);

        System.out.print("Digite o valor a ser sacado: ");
        int valor = scanner.nextInt();
        scanner.close();

        try {
            caixa.sacarChecado(valor);
        } catch (ValorInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}


