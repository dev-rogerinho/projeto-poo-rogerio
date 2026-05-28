public class Main {
    public static void main(String[] args) {

        // usuários

        Usuario u = new Usuario("João", "123", "senha", 20, "M", "email", "Joao", "1111", "123");

        Estudante e = new Estudante("Maria", "456", "programacao", 18, "F", "email", "Maria", "2222", "456");

        Critico critico = new Critico("Leo Dias", "555", "fofoca", 45, "M", "email", "leo", "1234", "554", "Globo");

        // funcionário e administrador

        Funcionario funcionario = new Funcionario("Carlos", 30, "carlos@email", 2500);

        Administrador admin = new Administrador("Ana", 40, "ana@email", 5000, 1);

        // filmes

        Filme f = new Filme("Batman", 20.0, 120, "Filme do Batman", true);

        Filme f2 = new Filme("Orgulho e Preconceito", 20.0, 130, "Romance clássico", false);

        // sessões

        Sessao s = new Sessao(f, 1, TipoSala.TRES_D, "18:00 - 20:00", false);

        Sessao s2 = new Sessao(f2, 2, TipoSala.COMUM, "20:00 - 22:00", false);

        // sala

        Sala sala = new Sala(5);

        sala.adicionarSessao(0, s);
        sala.adicionarSessao(1, s2);

        // métodos funcionário/admin

        funcionario.adicionarUsuario(u);
        funcionario.alterarUsuario(e);

        admin.adicionarUsuario(u);
        admin.alterarUsuario(e);
        admin.excluirUsuario(e);

        funcionario.incluirFilme(f);

        admin.alterarFilme(f2);
        admin.excluirFilme(f);

        // bilhetes

        Bilhete b1 = null;
        Bilhete b2 = null;
        Bilhete b3 = null;

        try {

            b1 = new Bilhete(u, s, 2, 5);

        } catch (VendasException erro) {

            System.out.println("Erro: " + erro.getMessage());
        }

        try {

            b2 = new Bilhete(e, s, 2, 6);

        } catch (VendasException erro) {

            System.out.println("Erro: " + erro.getMessage());
        }

        try {

            b3 = new Bilhete(critico, s2, 3, 4);

        } catch (VendasException erro) {

            System.out.println("Erro: " + erro.getMessage());
        }

        // compra

        Compra c = new Compra();

        if (b1 != null) {
            c.adicionarBilhete(b1);
        }

        if (b2 != null) {
            c.adicionarBilhete(b2);
        }

        if (b3 != null) {
            c.adicionarBilhete(b3);
        }

        // produtos

        c.adicionarProduto(Produto.PIPOCA);
        c.adicionarProduto(Produto.REFRIGERANTE);

        // críticas

        critico.atribuirNota(10, f);
        critico.atribuirCritica("Filme muito bom.", f);

        critico.atribuirNota(8, f);
        critico.atribuirCritica("Ótima atuação do protagonista.", f);

        critico.atribuirNota(7, f2);
        critico.atribuirCritica("Bom, mas um pouco lento.", f2);

        // sessões disponíveis

        System.out.println("\n===== SESSÕES DISPONÍVEIS =====");

        sala.mostrarSessoes();

        // compra

        System.out.println("\n===== COMPRA =====");

        c.mostrarCompra();

        // teste cadeira ocupada

        System.out.println("\n===== TESTE DE EXCEÇÃO =====");

        try {

            s.reservarCadeira(2, 5);

            s.reservarCadeira(2, 5);

        } catch (VendasException erro) {

            System.out.println("Erro: " + erro.getMessage());
        }

        // filmes

        System.out.println("\n===== FILME 1 =====");

        System.out.println("Nome: " + f.getNome());
        System.out.println("Nota média: " + f.getNota());
        System.out.println("Quantidade de críticos: " + f.getQuantidadeCriticos());

        System.out.println("Críticas:");

        f.mostrarCriticas();

        System.out.println("\n===== FILME 2 =====");

        System.out.println("Nome: " + f2.getNome());
        System.out.println("Nota média: " + f2.getNota());
        System.out.println("Quantidade de críticos: " + f2.getQuantidadeCriticos());

        System.out.println("Críticas:");

        f2.mostrarCriticas();

        // total

        System.out.println("\n===== TOTAL =====");

        System.out.println("Total normal: R$ " + c.calcularTotal());

        System.out.println("Total com desconto: R$ " + c.calcularTotal(CupomPromocional.DESCONTO10));
    }
}