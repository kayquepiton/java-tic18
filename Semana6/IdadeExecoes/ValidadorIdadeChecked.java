package Semana6.IdadeExecoes;

// ValidadorIdadeChecked.java
import java.time.LocalDate;
import java.time.Period;

public class ValidadorIdadeChecked {
    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade inválida. A idade deve estar entre 0 e 150 anos.");
        }
    }

    public static int calcularIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }
}


