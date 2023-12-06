#  2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.

Exceções Verificadas (Checked Exceptions): São exceções que o compilador verifica durante a compilação, garantindo que o programador as trate ou as declare na assinatura do método usando a cláusula throws. Exemplos incluem IOException, SQLException, etc.

Exemplo: 

import java.io.IOException;

public class ExemploCheckedException {
    public static void main(String[] args) throws IOException {
        // Código que pode lançar IOException
    }
}


Exceções Não Verificadas (Unchecked Exceptions): São exceções que o compilador não exige que sejam tratadas ou declaradas. Geralmente, são subclasses de RuntimeException. Exemplos incluem NullPointerException, ArrayIndexOutOfBoundsException, etc.

public class ExemploUncheckedException {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(array[10]);  // Isso lançará ArrayIndexOutOfBoundsException
    }
}

