public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "Joao",
                "123456789",
                20,
                "joao@email.com"
        );

        Filme filme = new Filme(
                "Homem Aranha",
                120,
                "Filme de ação",
                20.0
        );

        Sessao sessao = new Sessao(filme, "18:00 - 20:00");

        Sala sala = new Sala(5);
        sala.adicionarSessao(0, sessao);

        sessao.ocuparCadeira(2,3);

        Bilhete bilhete = new Bilhete(
                usuario,
                sala,
                sessao,
                filme,
                2,
                3,
                filme.getValor()
        );

        Compra compra = new Compra();
        compra.adicionarBilhete(bilhete);

System.out.println("      INGRESSO     ");
System.out.println("Usuario: " + usuario.getNome());
System.out.println("Filme: " + filme.getNome());
System.out.println("Horario: " + bilhete.getSessao().getHorario());
System.out.println("Sala: 1");
System.out.println("Cadeira: Linha " + bilhete.getLinha() +
                   " Coluna " + bilhete.getColuna());
System.out.println("Valor: R$ " + compra.calcularTotal());
    }
}