public class Compra {
    private Bilhete[] bilhetes = new Bilhete[100];
    private Produto[] produtos = new Produto[100];

    private int qtdBilhetes = 0;
    private int qtdProdutos = 0;

    // adiciona bilhete
    public void adicionarBilhete(Bilhete b) {
        bilhetes[qtdBilhetes] = b;
        qtdBilhetes++;
    }

    // adiciona produto
    public void adicionarProduto(Produto p) {
        produtos[qtdProdutos] = p;
        qtdProdutos++;
    }

    // mostra compra
    public void mostrarCompra() {
        System.out.println("Total de bilhetes: " + qtdBilhetes);

        for (int i = 0; i < qtdBilhetes; i++) {
            Bilhete b = bilhetes[i];

            System.out.println("Usuário: " + b.getUsuario().getUser());
            System.out.println("Filme: " + b.getSessao().getFilme().getNome());
            System.out.println("Sala: " + b.getSessao().getNumeroSala());
            System.out.println("Tipo de sala: " + b.getSessao().getTipoSala());
            System.out.println("Horário: " + b.getSessao().getHorario());
            System.out.println("Cadeira: Linha " + b.getLinha() + " Coluna " + b.getColuna());
            System.out.println("Valor: R$ " + b.getValor());
            System.out.println("----------------------");
        }

        System.out.println("Total de produtos: " + qtdProdutos);

        for (int i = 0; i < qtdProdutos; i++) {
            Produto p = produtos[i];

            System.out.println("Produto: " + p);
            System.out.println("Preço: R$ " + p.getValor());
            System.out.println("----------------------");
        }
    }

    // total normal
    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < qtdBilhetes; i++) {
            total += bilhetes[i].getValor();
        }

        for (int i = 0; i < qtdProdutos; i++) {
            total += produtos[i].getValor();
        }

        return total;
    }

    // total com cupom
    public double calcularTotal(CupomPromocional cupom) {
        double total = calcularTotal();
        return total - (total * cupom.getDesconto());
    }
}