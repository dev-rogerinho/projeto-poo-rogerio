public class Sessao {
    private Filme filme;
    private boolean[][] cadeiras = new boolean[10][15];
    private int numeroSala; 

    public Sessao(Filme filme, int numeroSala) {
        this.filme = filme;
        this.numeroSala = numeroSala;
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
}