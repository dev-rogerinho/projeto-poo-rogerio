public enum Produto {
    PIPOCA(10.0),
    REFRIGERANTE(8.0),
    CHOCOLATE(5.0),
    NACHOS(12.0),
    AGUA(4.0);

    private double valor;

    Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}