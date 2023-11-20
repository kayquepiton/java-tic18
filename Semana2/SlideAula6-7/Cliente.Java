import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;

    // Construtor
    public Cliente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método para mostrar os dados do cliente
    public void mostrarDadosCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    // Método para ler a data de nascimento do cliente
    public void lerDataNascimento() {
        Scanner scanner = new Scanner(System.in);
        boolean dataValida = false;

        while (!dataValida) {
            try {
                System.out.print("Digite a data de nascimento (AAAA-MM-DD): ");
                String dataNascimentoStr = scanner.nextLine();
                this.dataNascimento = LocalDate.parse(dataNascimentoStr);
                dataValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato de data inválido. Tente novamente.");
            }
        }
    }

    // Método para calcular a idade do cliente
    public int calculaIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }

    // Método para mostrar a idade do cliente
    public void mostrarIdadeCliente() {
        int idade = calculaIdade();
        System.out.println("Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe
        Cliente cliente = new Cliente("João", LocalDate.of(1990, 5, 15));

        // Mostrar dados do cliente
        cliente.mostrarDadosCliente();

        // Ler e mostrar a nova data de nascimento
        cliente.lerDataNascimento();
        cliente.mostrarDadosCliente();

        // Mostrar a idade do cliente
        cliente.mostrarIdadeCliente();
    }
}
