import java.util.Scanner;

class QuizQuestion {
    String pergunta;
    String[] alternativas;
    String respostaCorreta;

    public QuizQuestion(String pergunta, String[] alternativas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }
}

public class Exercicio10 {
    public static void main(String[] args) {
        // Criando instâncias das perguntas
        QuizQuestion questao1 = new QuizQuestion("Qual é a capital do Brasil?", new String[]{"a) São Paulo", "b) Brasília", "c) Rio de Janeiro", "d) Belo Horizonte"}, "b");
        QuizQuestion questao2 = new QuizQuestion("Qual é o maior planeta do sistema solar?", new String[]{"a) Terra", "b) Júpiter", "c) Marte", "d) Vênus"}, "b");
        QuizQuestion questao3 = new QuizQuestion("Quem escreveu 'Romeu e Julieta'?", new String[]{"a) Charles Dickens", "b) William Shakespeare", "c) Jane Austen", "d) Fyodor Dostoevsky"}, "b");
        QuizQuestion questao4 = new QuizQuestion("Qual é o símbolo químico para o ouro?", new String[]{"a) Au", "b) Ag", "c) Fe", "d) Hg"}, "a");

        // Criando uma instância do Quiz
        Quiz quiz = new Quiz(new QuizQuestion[]{questao1, questao2, questao3, questao4});

        // Obtendo as respostas do usuário
        Scanner scanner = new Scanner(System.in);
        String[] respostasUsuario = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + quiz.perguntas[i].pergunta);
            for (String alternativa : quiz.perguntas[i].alternativas) {
                System.out.println(alternativa);
            }
            System.out.print("Sua resposta: ");
            respostasUsuario[i] = scanner.nextLine();
        }

        // Verificando respostas e atribuindo pontuação
        int pontuacao = quiz.verificarRespostas(respostasUsuario);

        // Exibindo a pontuação
        System.out.println("Sua pontuação: " + pontuacao + " pontos");
    }
}

class Quiz {
    QuizQuestion[] perguntas;

    public Quiz(QuizQuestion[] perguntas) {
        this.perguntas = perguntas;
    }

    public int verificarRespostas(String[] respostasUsuario) {
        int pontuacao = 0;
        for (int i = 0; i < 4; i++) {
            if (respostasUsuario[i].equalsIgnoreCase(this.perguntas[i].respostaCorreta)) {
                pontuacao++;
            }
        }
        return pontuacao;
    }
}
