public class Bilhete {

    private Usuario usuario;
    private Sala sala;
    private Sessao sessao;
    private Filme filme;
    private int linha;
    private int coluna;
    private double valor;

    public Bilhete(Usuario usuario, Sala sala, Sessao sessao,
                   Filme filme, int linha, int coluna, double valor) {

        this.usuario = usuario;
        this.sala = sala;
        this.sessao = sessao;
        this.filme = filme;
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public double getValor() {
        return valor;
    }
}