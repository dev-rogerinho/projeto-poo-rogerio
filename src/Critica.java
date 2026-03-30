public class Critica {
    private String nome;
    private String origem;
    private String mensagem;

    public Critica(String nome, String origem, String mensagem) {
        this.nome = nome;
        this.origem = origem;
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}