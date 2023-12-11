package Semana6.IdadeExecoes;

// CadastroClienteUnchecked.java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroClienteUnchecked {
    public static void main(String[] args) {
        try {
            // Leitura dos dados do cliente
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a data de nascimento (dd-MM-yyyy): ");
            String dataNascimentoStr = scanner.nextLine();
            scanner.close();

            // Formatar a entrada de data
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

            // Criar objeto Cliente
            Cliente cliente = new Cliente(nome, dataNascimento);

            // Cálculo da idade
            int idade = ValidadorIdadeUnchecked.calcularIdade(cliente.getDataNascimento());

            // Validação da idade
            ValidadorIdadeUnchecked.validarIdade(idade);

            // Continuar com o cadastro do cliente se a idade for válida
            System.out.println("Cadastro realizado com sucesso para " + cliente.getNome() + "!");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}


