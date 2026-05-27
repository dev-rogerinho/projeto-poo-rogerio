public class Critico extends Usuario {
    private String origem;

    public Critico(String user, String cpf, String senha, int idade, String sexo, String email,
                   String nomeCartao, String numeroCartao, String codigoCartao, String origem) {

        super(user, cpf, senha, idade, sexo, email, nomeCartao, numeroCartao, codigoCartao);
        this.origem = origem;
    }

    // critico não paga ingresso
    public double calcularValor(double valor) {
        return 0;
    }

    public String getOrigem() {
        return origem;
    }

    // excessao
    public void atribuirNota(double nota, Filme filme) {
        if (nota < 0 || nota > 10){
            throw new IllegalArgumentException("Nota inválida.");
        }
          filme.adicionarNota(nota);
    }

    // adiciona crítica ao filme
    public void atribuirCritica(String mensagem, Filme filme) {
        Critica critica = new Critica(getUser(), origem, mensagem);
        filme.adicionarCritica(critica);
    }
}