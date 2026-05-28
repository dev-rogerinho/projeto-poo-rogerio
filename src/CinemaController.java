public class CinemaController {

    public Bilhete comprarBilhete(Usuario usuario, Sessao sessao, int linha, int coluna)    
        throws VendasException {

        sessao.reservarCadeira(linha, coluna);

        Bilhete bilhete = new Bilhete(
                usuario,
                sessao,
                linha,
                coluna);

        return bilhete;
    }

    public Compra criarCompra() {

        return new Compra();
    }

    public void adicionarProduto(
            Compra compra,
            Produto produto) {

        compra.adicionarProduto(produto);
    }
}