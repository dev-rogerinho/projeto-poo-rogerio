public enum CupomPromocional {
    DESCONTO0(0.0),
    DESCONTO10(0.10),
    DESCONTO20(0.20),
    DESCONTO30(0.30);

    private double desconto;

    CupomPromocional(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}