import java.util.ArrayList;

public class Compra {
    private ArrayList<Bilhete> bilhetes = new ArrayList<>();

    public void adicionarBilhete(Bilhete b) {
        bilhetes.add(b);
    }

    public void mostrarCompra() {
    System.out.println("Total de bilhetes: " + bilhetes.size());

    for (Bilhete b : bilhetes) {
        System.out.println("Usuário: " + b.getUsuario().getUser());
        System.out.println("Filme: " + b.getSessao().getFilme().getNome());
        System.out.println("Sala: " + b.getSessao().getNumeroSala());
        System.out.println("Cadeira: Linha " + b.getLinha() + " Coluna " + b.getColuna());
        System.out.println("Valor: R$ " + b.getValor());
        System.out.println("----------------------");
    }
}
}