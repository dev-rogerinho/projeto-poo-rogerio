public class Main {
    public static void main(String[] args) {

        // usuários

        Usuario u1 = new Usuario(
                "João",    
                "123",
                "senha",
                20,
                "M",
                "email",
                "Joao",
                "1111",
                "123");

        Estudante e1 = new Estudante(
                "Maria",
                "456",
                "programacao",
                18,
                "F",
                "email",
                "Maria",
                "2222",
                "456");

        Critico critico = new Critico(
                "Leo Dias",
                "555",
                "fofoca",
                45,
                "M",
                "email",
                "leo",
                "1234",
                "554",
                "Globo");

        // funcionário e administrador

        Funcionario funcionario = new Funcionario(
                "Carlos",
                30,
                "carlos@email",
                2500);

        Administrador admin = new Administrador(
                "Ana",
                40,
                "ana@email",
                5000,
                1);

        // filmes

        Filme f1 = new Filme(
                "Batman",
                20.0,
                120,
                "Filme do Batman",
                true);

        Filme f2 = new Filme(
                "Orgulho e Preconceito",
                20.0,
                130,
                "Romance clássico",
                true);

        Filme f3 = new Filme(
                "Titanic",
                18.0,
                180,
                "Drama clássico",
                false);

        // sessões

        Sessao s1 = new Sessao(
                f1,
                1,
                TipoSala.TRES_D,
                "18:00 - 20:00",
                false);

        Sessao s2 = new Sessao(
                f2,
                2,
                TipoSala.COMUM,
                "20:00 - 22:00",
                false);

        Sessao s3 = new Sessao(
                f3,
                3,
                TipoSala.XD,
                "22:00 - 01:00",
                false);

        // sala

        Sala sala = new Sala(5);

        sala.adicionarSessao(s1);
        sala.adicionarSessao(s2);
        sala.adicionarSessao(s3);

        // controller

        CinemaController controller =
                new CinemaController();

        // métodos funcionário/admin

        funcionario.adicionarUsuario(u1);
        funcionario.alterarUsuario(e1);

        admin.adicionarUsuario(u1);
        admin.alterarUsuario(e1);
        admin.excluirUsuario(e1);

        funcionario.incluirFilme(f1);

        admin.alterarFilme(f2);
        admin.excluirFilme(f1);

        // compra

        Compra c = controller.criarCompra();

        // compra de bilhetes

        try {

            Bilhete b1 =
                    controller.comprarBilhete(
                            u1,
                            s1,
                            2,
                            5);

            c.adicionarBilhete(b1);

        } catch (VendasException erro) {

            System.out.println(
                    "Erro: "
                    + erro.getMessage());
        }

        try {

            Bilhete b2 =
                    controller.comprarBilhete(
                            e1,
                            s1,
                            2,
                            6);

            c.adicionarBilhete(b2);

        } catch (VendasException erro) {

            System.out.println(
                    "Erro: "
                    + erro.getMessage());
        }

        try {

            Bilhete b3 =
                    controller.comprarBilhete(
                            critico,
                            s2,
                            3,
                            4);

            c.adicionarBilhete(b3);

        } catch (VendasException erro) {

            System.out.println(
                    "Erro: "
                    + erro.getMessage());
        }

        // produtos

        controller.adicionarProduto(
                c,
                Produto.PIPOCA);

        controller.adicionarProduto(
                c,
                Produto.REFRIGERANTE);

        // críticas

        critico.atribuirNota(10, f1);

        critico.atribuirCritica(
                "Filme muito bom.",
                f1);

        critico.atribuirNota(8, f1);

        critico.atribuirCritica(
                "Ótima atuação do protagonista.",
                f1);

        critico.atribuirNota(7, f2);

        critico.atribuirCritica(
                "Bom, mas um pouco lento.",
                f2);

        // sessões disponíveis

        System.out.println(
                "\n==============================");

        System.out.println(
                "===== SESSÕES DISPONÍVEIS =====");

        sala.mostrarSessoes();

        // compra

        System.out.println(
                "\n==============================");

        System.out.println(
                "===== COMPRA =====");

        c.mostrarCompra();

        // filmes

        System.out.println(
                "\n==============================");

        System.out.println(
                "===== FILME 1 =====");

        System.out.println(
                "Nome: "
                + f1.getNome());

        System.out.println(
                "Nota média: "
                + f1.getNota());

        System.out.println(
                "Quantidade de críticos: "
                + f1.getQuantidadeCriticos());

        System.out.println(
                "Críticas:");

        f1.mostrarCriticas();

        System.out.println(
                "\n===== FILME 2 =====");

        System.out.println(
                "Nome: "
                + f2.getNome());

        System.out.println(
                "Nota média: "
                + f2.getNota());

        System.out.println(
                "Quantidade de críticos: "
                + f2.getQuantidadeCriticos());

        System.out.println(
                "Críticas:");

        f2.mostrarCriticas();

        // total

        System.out.println(
                "\n==============================");

        System.out.println(
                "===== TOTAL =====");

        System.out.println(
                "Total normal: R$ "
                + c.calcularTotal());

        System.out.println(
                "Total com desconto: R$ "
                + c.calcularTotal(
                        CupomPromocional.DESCONTO10));

        // testes de exceção

        System.out.println(
                "\n==============================");

        System.out.println(
                "===== TESTES DE EXCEÇÃO =====");

        // cadeira ocupada

        try {

            controller.comprarBilhete(
                    u1,
                    s1,
                    2,
                    5);

        } catch (VendasException erro) {

            System.out.println(
                    "Erro cadeira ocupada: "
                    + erro.getMessage());
        }

        // filme fora de cartaz

        try {

            controller.comprarBilhete(
                    u1,
                    s3,
                    1,
                    1);

        } catch (VendasException erro) {

            System.out.println(
                    "Erro filme fora de cartaz: "
                    + erro.getMessage());
        }

        // sessão encerrada

        Sessao s4 = new Sessao(
                f1,
                4,
                TipoSala.COMUM,
                "23:00 - 01:00",
                true);

        try {

            controller.comprarBilhete(
                    u1,
                    s4,
                    1,
                    1);

        } catch (VendasException erro) {

            System.out.println(
                    "Erro sessão encerrada: "
                    + erro.getMessage());
        }
    }
}