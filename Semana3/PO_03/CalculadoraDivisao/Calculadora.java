// Calculadora.java
public class Calculadora {
    // Métodos para inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int numerador, int denominador) throws DivisionByZeroException {
        if (denominador == 0) {
            throw new DivisionByZeroException();
        }
        return numerador / denominador;
    }

    // Métodos para ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double numerador, double denominador) throws DivisionByZeroException {
        if (denominador == 0.0) {
            throw new DivisionByZeroException();
        }
        return numerador / denominador;
    }

    // Método genérico para suportar Number
    public double somar(Number a, Number b) {
        return a.doubleValue() + b.doubleValue();
    }
}
