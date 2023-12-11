package Semana6.CaixaEletronico;

// CaixaEletronico.java
public class CaixaEletronico {
    private int saldoDisponivel;

    public CaixaEletronico(int saldoInicial) {
        this.saldoDisponivel = saldoInicial;
    }

    public int getSaldoDisponivel() {
        return saldoDisponivel;
    }

    // Método de saque checado
    public void sacarChecado(int valor) throws ValorInvalidoException {
        if (valor % 10 != 0) {
            throw new ValorInvalidoException("Valor inválido. O valor deve ser múltiplo de 10.");
        }

        if (valor > saldoDisponivel) {
            throw new ValorInvalidoException("Saldo insuficiente no caixa eletrônico.");
        }

        // Lógica para processar o saque (não implementada no exemplo)
        saldoDisponivel -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.\n");
        System.out.println("Saldo restante: R$" + saldoDisponivel);
    }

    // Método de saque não checado
    public void sacarNaoChecado(int valor) {
        if (valor % 10 != 0 || valor > saldoDisponivel) {
            throw new IllegalArgumentException("Operação inválida. Verifique o valor do saque e o saldo disponível.");
        }

        // Lógica para processar o saque (não implementada no exemplo)
        saldoDisponivel -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.\n");
        System.out.println("Saldo restante: R$" + saldoDisponivel);
    }
}
