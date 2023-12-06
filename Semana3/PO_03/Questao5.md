## 5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.

É apropriado criar exceções personalizadas quando você encontra situações específicas em seu programa que não são adequadamente representadas pelas exceções existentes. Isso ajuda a criar um código mais claro e a fornecer informações mais significativas sobre o erro.

Exemplo de criação de uma exceção personalizada:

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}


No contexto da Calculadora de Divisão mencionada:

public class Calculadora {
    public static int dividirInteiros(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    public static float dividirFloats(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
}


Ao usar essa exceção personalizada, você pode sinalizar claramente que a divisão por zero não é permitida, e quem estiver usando a calculadora pode capturar e lidar com essa exceção de maneira apropriada.