package Semana6.Arquivos;

import java.io.File;

public class ManipulacaoArquivo {
    // Método checado
    public static void verificarArquivoChecado(String nomeDoArquivo) throws ArquivoNaoEncontradoException {
        File diretorioAtual = new File(System.getProperty("user.dir"));
        File diretorioArquivos = new File(diretorioAtual, "Semana6/Arquivos");

        File arquivo = new File(diretorioArquivos, nomeDoArquivo);

        if (!arquivo.exists()) {
            throw new ArquivoNaoEncontradoException("Arquivo não encontrado: " + nomeDoArquivo);
        }

        System.out.println("Arquivo encontrado: " + arquivo.getName());
    }

    // Método não checado
    public static void verificarArquivoNaoChecado(String nomeDoArquivo) {
        File diretorioAtual = new File(System.getProperty("user.dir"));
        File diretorioSemana6 = new File(diretorioAtual, "Semana6");

        System.out.println("Diretório atual: " + diretorioSemana6.getAbsolutePath());

        File diretorioArquivos = new File(diretorioSemana6, "Arquivos");

        File arquivo = new File(diretorioArquivos, nomeDoArquivo);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException("Arquivo não encontrado: " + nomeDoArquivo);
        }

        System.out.println("Arquivo encontrado: " + arquivo.getName());
    }
}
