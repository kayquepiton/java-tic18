package Semana6.IdadeExecoes;

// Cliente.java
import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;

    public Cliente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}



