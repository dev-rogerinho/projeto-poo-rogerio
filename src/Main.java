public class Main {
    public static void main(String[] args) {

        
        Usuario u = new Usuario("João", "123", "senha", 20, "M", "email",
                "Joao", "1111", "123");

        Estudante e = new Estudante("Maria", "456", "programaçao", 18, "F", "email",
                "Maria", "2222", "456");
             
        Critico critico = new Critico("Leo Dias", "555", "fofoca", 45, "M", "email","leo", "1234", "554", "Globo");

        Filme f = new Filme("Batman", 20.0);
        Filme f2 = new Filme("Orgulho e Preconceito", 20.0);

        Sessao s = new Sessao(f, 1, TipoSala.TRES_D);
        s.reservarCadeira(2, 5);
        Sessao s2 = new Sessao(f2, 2,TipoSala.COMUM);
        s2.reservarCadeira(4, 7);

        Bilhete b1 = new Bilhete(u, s, 2, 5);
        Bilhete b2 = new Bilhete(e, s, 2, 6);
        Bilhete b3 = new Bilhete(critico, s2, 3, 4);

        Compra c = new Compra();
        c.adicionarBilhete(b1);
        c.adicionarBilhete(b2);
        c.adicionarBilhete(b3);

        c.adicionarProduto(Produto.PIPOCA);
        c.adicionarProduto(Produto.REFRIGERANTE);

        double total = c.calcularTotal();

        double totalComDesconto = c.calcularTotal(CupomPromocional.DESCONTO30);

        c.mostrarCompra();

        System.out.println("Total normal: R$ " + total);
        System.out.println("Total com desconto: R$ " + totalComDesconto);
        
    }
}