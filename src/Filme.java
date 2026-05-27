public class Filme {
    private String nome;
    private double valor;
    private int duracao;
    private String sinopse;
    private double nota;
    private int quantidadeCriticos;
    private Critica[] criticas = new Critica[100];
    private int qtdCriticas = 0;
    private boolean emCartaz;

    public Filme(String nome, double valor, int duracao, String sinopse, boolean emCartaz) {
        this.nome = nome;
        this.valor = valor;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.nota = 0;
        this.quantidadeCriticos = 0;
        this.emCartaz = emCartaz;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public double getNota() {
        return nota;
    }

    public int getQuantidadeCriticos() {
        return quantidadeCriticos;
    }

    public boolean isEmCartaz() {
    return emCartaz;
}

    // adicionar nota e recalcula a média
    public void adicionarNota(double novaNota) {
        nota = (nota * quantidadeCriticos + novaNota) / (quantidadeCriticos + 1);
        quantidadeCriticos++;
    }

    // adicionar crítica no vetor
    public void adicionarCritica(Critica critica) {
        criticas[qtdCriticas] = critica;
        qtdCriticas++;
    }

    // mostrar críticas
    public void mostrarCriticas() {
        for (int i = 0; i < qtdCriticas; i++) {
            System.out.println(criticas[i].getNome() + " (" + criticas[i].getOrigem() + "): " + criticas[i].getMensagem());;
    }
    }
}