package AtvdSimulacao;

public class Sessao {
    private String dataHoraInicio;
    private String dataHoraFim;

    public Sessao(String dataHoraInicio, String dataHoraFim) {
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    public String getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(String dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public String getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(String dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public static void logar(Usuario usuario, ListaSessoes listaSessoes) {
        // Implemente o método de login de sessão aqui
        Sessao novaSessao = new Sessao("DataHoraInicio", "DataHoraFim");
        listaSessoes.adicionarSessao(novaSessao);
        usuario.getListaSessoes().add(novaSessao);
        System.out.println("Usuário " + usuario.getNome() + " logado com sucesso!");
    }

    public static void deslogar(Usuario usuario, ListaSessoes listaSessoes) {
        // Implemente o método de logout de sessão aqui
        if (!usuario.getListaSessoes().isEmpty()) {
            Sessao sessaoAtual = usuario.getListaSessoes().get(usuario.getListaSessoes().size() - 1);
            listaSessoes.getSessoes().remove(sessaoAtual);
            usuario.getListaSessoes().remove(sessaoAtual);
            System.out.println("Usuário " + usuario.getNome() + " deslogado com sucesso!");
        } else {
            System.out.println("Usuário " + usuario.getNome() + " não está logado.");
        }
    }

    public static void solicitarAutenticacao(Usuario usuario) {
        // Implemente o método de solicitação de autenticação aqui
        System.out.println("Solicitação de autenticação para o usuário " + usuario.getNome());
    }

    public static void criarAmizade(Usuario usuario1, Usuario usuario2) {
        // Implemente o método para criar amizade entre dois usuários
        usuario1.getAmigos().add(usuario2);
        usuario2.getAmigos().add(usuario1);
        System.out.println(usuario1.getNome() + " e " + usuario2.getNome() + " são agora amigos!");
    }

    public static void desfazerAmizade(Usuario usuario1, Usuario usuario2) {
        // Implemente o método para desfazer amizade entre dois usuários
        usuario1.getAmigos().remove(usuario2);
        usuario2.getAmigos().remove(usuario1);
        System.out.println(usuario1.getNome() + " e " + usuario2.getNome() + " não são mais amigos.");
    }

    public static void criarPostagem(Usuario usuario, String conteudo) {
        // Implemente o método para criar uma postagem
        usuario.getListaPostagens().add(conteudo);
        System.out.println("Postagem criada por " + usuario.getNome() + ": " + conteudo);
    }

    public static void listarPostagens(Usuario usuario) {
        // Implemente o método para listar postagens de um usuário
        System.out.println("Postagens de " + usuario.getNome() + ": ");
        for (String postagem : usuario.getListaPostagens()) {
            System.out.println(postagem);
        }
    }
}
