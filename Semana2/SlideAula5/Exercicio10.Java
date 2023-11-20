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
        QuizQuestion questao5 = new QuizQuestion("Qual é o símbolo químico para o ouro?", new String[]{"a) Au", "b) Ag", "c) Fe", "d) Hg"}, "a");
        QuizQuestion questao6 = new QuizQuestion("Quem escreveu 'Dom Quixote'?", new String[]{"a) Miguel de Cervantes", "b) William Shakespeare", "c) Jane Austen", "d) Fyodor Dostoevsky"}, "a");
        QuizQuestion questao7 = new QuizQuestion("Em que ano ocorreu a Independência do Brasil?", new String[]{"a) 1776", "b) 1822", "c) 1900", "d) 2001"}, "b");
        QuizQuestion questao8 = new QuizQuestion("Qual é a velocidade da luz?", new String[]{"a) 300,000 km/s", "b) 500,000 km/s", "c) 700,000 km/s", "d) 900,000 km/s"}, "a");
        QuizQuestion questao9 = new QuizQuestion("Quantos planetas existem no sistema solar?", new String[]{"a) 7", "b) 8", "c) 9", "d) 10"}, "b");
        QuizQuestion questao10 = new QuizQuestion("Quem propôs a teoria da relatividade?", new String[]{"a) Isaac Newton", "b) Albert Einstein", "c) Stephen Hawking", "d) Galileo Galilei"}, "b");

        // Criando uma instância do Quiz
        Quiz quiz = new Quiz(new QuizQuestion[]{questao1, questao2, questao3, questao4});

        // Obtendo as respostas do usuário
        Scanner scanner = new Scanner(System.in);
        String[] respostasUsuario = new String[4];

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
