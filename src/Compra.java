import java.util.ArrayList;

public class Compra {

    private ArrayList<Bilhete> bilhetes;

    public Compra() {
        bilhetes = new ArrayList<>();
    }

    public void adicionarBilhete(Bilhete b) {
        bilhetes.add(b);
    }

    public double calcularTotal() {

        double total = 0;

        for (Bilhete b : bilhetes) {
            total += b.getValor();
        }

        return total;
    }
}