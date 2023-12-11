package Semana6.Arquivos;

// Persistencia.java
public class Persistencia {
    // Método checado
    public void lerDadosChecado(String nomeDoArquivo) throws ArquivoNaoEncontradoException {
        ManipulacaoArquivo.verificarArquivoChecado(nomeDoArquivo);

        // Lógica para ler dados do arquivo (não implementada no exemplo)
        System.out.println("Lendo dados do arquivo: " + nomeDoArquivo);
    }

    // Método não checado
    public void lerDadosNaoChecado(String nomeDoArquivo) {
        ManipulacaoArquivo.verificarArquivoNaoChecado(nomeDoArquivo);

        // Lógica para ler dados do arquivo (não implementada no exemplo)
        System.out.println("Lendo dados do arquivo: " + nomeDoArquivo);
    }
}



