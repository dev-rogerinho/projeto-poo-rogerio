public class Sala {

    private Sessao[] sessoes;

    public Sala(int quantidade) {
        sessoes = new Sessao[quantidade];
    }

    public void adicionarSessao(int posicao, Sessao sessao) {
        sessoes[posicao] = sessao;
    }

    public Sessao getSessao(int posicao) {
        return sessoes[posicao];
    }
}