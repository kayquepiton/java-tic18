package Semana6.CalculadoraExecoes;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Divisão por zero não é permitida.");
    }

    public DivisionByZeroException(String message) {
        super(message);
    }
}
