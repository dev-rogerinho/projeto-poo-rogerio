public class Filme {
    private String nome;
    private int duracao;
    private String sinopse;
    private double valor;

    public Filme(String nome, int duracao, String sinopse, double valor) {
        this.nome = nome;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.valor = valor;
    }

    public String getNome() { return nome; }
    public double getValor() { return valor; }
}