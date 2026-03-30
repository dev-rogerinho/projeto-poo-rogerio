public class Critico extends Usuario {
    private String origem;

    public Critico(String user, String cpf, String senha, int idade, String sexo, String email,
                   String nomeCartao, String numeroCartao, String codigoCartao, String origem) {

        super(user, cpf, senha, idade, sexo, email, nomeCartao, numeroCartao, codigoCartao);
        this.origem = origem;
    }

    public double calcularValor(double valor) {
        return 0; 
    }
}