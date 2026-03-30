public class Sessao {
    private Filme filme;
    private boolean[][] cadeiras = new boolean[10][15]; 
    private int numeroSala; 
    private TipoSala tipoSala;

    public Sessao(Filme filme, int numeroSala, TipoSala tipoSala) {
        this.filme = filme;
        this.numeroSala = numeroSala;
        this.tipoSala = tipoSala;
    }

    public boolean reservarCadeira(int linha, int coluna) {
        if (!cadeiras[linha][coluna]) {
            cadeiras[linha][coluna] = true;
            return true;
        }
        return false;
    }

    public Filme getFilme() {
        return filme;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public TipoSala getTipoSala() {
    return tipoSala;
}
}