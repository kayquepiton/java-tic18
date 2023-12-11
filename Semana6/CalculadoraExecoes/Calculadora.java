package Semana6.CalculadoraExecoes;

public class Calculadora {
    // Métodos para inteiros
    public int somarInteiros(int a, int b) {
        return a + b;
    }

    public int subtrairInteiros(int a, int b) {
        return a - b;
    }

    public int multiplicarInteiros(int a, int b) {
        return a * b;
    }

    public int dividirInteiros(int numerador, int denominador) throws DivisionByZeroException {
        validarDenominador(denominador);
        return numerador / denominador;
    }

    public int obterRestoDivisaoInteiros(int numerador, int denominador) throws DivisionByZeroException {
        validarDenominador(denominador);
        return numerador % denominador;
    }
    

    // Métodos para ponto flutuante
    public double somarPontoFlutuante(double a, double b) {
        return a + b;
    }

    public double subtrairPontoFlutuante(double a, double b) {
        return a - b;
    }

    public double multiplicarPontoFlutuante(double a, double b) {
        return a * b;
    }

    public double dividirPontoFlutuante(double numerador, double denominador) throws DivisionByZeroException {
        validarDenominador(denominador);
        return numerador / denominador;
    }

    public double obterRestoDivisaoPontoFlutuante(double numerador, double denominador) throws DivisionByZeroException {
        validarDenominador(denominador);
        return numerador % denominador;
    }

    // Método genérico para suportar Number
    public double somar(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }

    private void validarDenominador(double denominador) throws DivisionByZeroException {
        if (denominador == 0.0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
    }
}
