package Semana6.IdadeExecoes;

// ValidadorIdadeUnchecked.java
import java.time.LocalDate;

public class ValidadorIdadeUnchecked {
    public static void validarIdade(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade inválida. A idade deve estar entre 0 e 150 anos.");
        }
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNascimento.getYear();
    }
}


