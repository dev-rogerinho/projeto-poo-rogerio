public class Sala {
    private Sessao[] sessoes;

    public Sala(int tamanho) {
        sessoes = new Sessao[tamanho];
    }

    public void adicionarSessao(int index, Sessao sessao) {
        sessoes[index] = sessao;
    }

    public Sessao getSessao(int index) {
        return sessoes[index];
    }
}