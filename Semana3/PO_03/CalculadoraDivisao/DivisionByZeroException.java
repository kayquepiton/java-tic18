// DivisionByZeroException.java
public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Divisão por zero não é permitida.");
    }
}
