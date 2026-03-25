public class Usuario {
    private String user;
    private String cpf;
    private String senha;
    private int idade;
    private String sexo;
    private String email;
    private String nomeCartao;
    private String numeroCartao;
    private String codigoCartao;

    public Usuario(String user, String cpf, String senha, int idade, String sexo, String email,
                   String nomeCartao, String numeroCartao, String codigoCartao) {
        this.user = user;
        this.cpf = cpf;
        this.senha = senha;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.nomeCartao = nomeCartao;
        this.numeroCartao = numeroCartao;
        this.codigoCartao = codigoCartao;
    }

    public String getUser() { return user; }
    public String getCpf() { return cpf; }
}