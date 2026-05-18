public class Sessao {
    private Filme filme;
    private boolean[][] cadeiras = new boolean[10][15]; 
    private int numeroSala; 
    private TipoSala tipoSala;
    private String horario;
    private boolean sessaoEncerrada;

    public Sessao(Filme filme, int numeroSala, TipoSala tipoSala, String horario, boolean sessaoEncerrada) {
    this.filme = filme;
    this.numeroSala = numeroSala;
    this.tipoSala = tipoSala;
    this.horario = horario;
    this.sessaoEncerrada = sessaoEncerrada;
}

    public boolean reservarCadeira(int linha, int coluna)
        throws VendasException {

    if (!cadeiras[linha][coluna]) {

        cadeiras[linha][coluna] = true;
        
        return true;
    }

    throw new VendasException(
            "Poltrona já selecionada.");
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
    public String getHorario() {
    return horario;
}
public boolean isSessaoEncerrada() {
    return sessaoEncerrada;
}
}