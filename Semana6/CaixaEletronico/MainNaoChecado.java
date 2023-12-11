package Semana6.CaixaEletronico;

// MainNaoChecado.java
import java.util.Scanner;

public class MainNaoChecado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o saldo inicial do caixa eletrônico: ");
        int saldoInicial = scanner.nextInt();

        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);

        System.out.print("Digite o valor a ser sacado: ");
        int valor = scanner.nextInt();
        scanner.close();

        try {
            caixa.sacarNaoChecado(valor);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

