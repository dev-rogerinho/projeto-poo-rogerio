public class Sessao {

    private Filme filme;
    private String horario;
    private boolean[][] cadeiras;

    public Sessao(Filme filme, String horario) {
        this.filme = filme;
        this.horario = horario;
        cadeiras = new boolean[10][15];
    }

    public Filme getFilme() {
        return filme;
    }

    public String getHorario() {
        return horario;
    }

    public boolean ocuparCadeira(int linha, int coluna) {

        if (linha >= 0 && linha < 10 && coluna >= 0 && coluna < 15) {

            if (!cadeiras[linha][coluna]) {
                cadeiras[linha][coluna] = true;
                return true;
            }
        }

        return false;
    }
}