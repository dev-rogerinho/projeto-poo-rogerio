import java.util.ArrayList;

public class Compra {
    private ArrayList<Bilhete> bilhetes = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarBilhete(Bilhete b) {
        bilhetes.add(b);
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void mostrarCompra() {
        System.out.println("Total de bilhetes: " + bilhetes.size());

        for (Bilhete b : bilhetes) {
            System.out.println("Usuário: " + b.getUsuario().getUser());
            System.out.println("Filme: " + b.getSessao().getFilme().getNome());
            System.out.println("Sala: " + b.getSessao().getNumeroSala());
            System.out.println("Tipo de sala: " + b.getSessao().getTipoSala());
            System.out.println("Cadeira: Linha " + b.getLinha() + " Coluna " + b.getColuna());
            System.out.println("Valor: R$ " + b.getValor());
            System.out.println("----------------------");
        }

        System.out.println("Total de produtos: " + produtos.size());

        for (Produto p : produtos) {
            System.out.println("Produto: " + p);
            System.out.println("Preço: R$ " + p.getValor());
            System.out.println("----------------------");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (Bilhete b : bilhetes) {
            total += b.getValor();
        }

        for (Produto p : produtos) {
            total += p.getValor();
        }

        return total;
    }

    public double calcularTotal(CupomPromocional cupom) {
        double total = calcularTotal();
        return total - (total * cupom.getDesconto());
    }
}