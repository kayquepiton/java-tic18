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
        QuizQuestion questao1 = new QuizQuestion("Quem é conhecido como 'Pai da Computação'?", new String[]{"a) Bill Gates", "b) Alan Turing", "c) Steve Jobs", "d) Mark Zuckerberg"}, "b");
        QuizQuestion questao2 = new QuizQuestion("Quanto é a raiz quadrada de 144?", new String[]{"a) 10", "b) 12", "c) 14", "d) 16"}, "b");
        QuizQuestion questao3 = new QuizQuestion("Quem pintou a Mona Lisa?", new String[]{"a) Vincent van Gogh", "b) Pablo Picasso", "c) Leonardo da Vinci", "d) Claude Monet"}, "c");
        QuizQuestion questao4 = new QuizQuestion("Qual é a capital do Japão?", new String[]{"a) Pequim", "b) Seul", "c) Tóquio", "d) Bangkok"}, "c");

        // Criando uma instância do Quiz
        Quiz quiz = new Quiz(new QuizQuestion[]{questao1, questao2, questao3, questao4});

        // Obtendo as respostas do usuário
        Scanner scanner = new Scanner(System.in);
        String[] respostasUsuario = new String[10];

        for (int i = 0; i < 10; i++) {
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
