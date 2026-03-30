public class Estudante extends Usuario {

    public Estudante(String user, String cpf, String senha, int idade, String sexo, String email,
                     String nomeCartao, String numeroCartao, String codigoCartao) {
        super(user, cpf, senha, idade, sexo, email, nomeCartao, numeroCartao, codigoCartao);
    }

    public double calcularValor(double valor) {
        return valor / 2;
    }
}