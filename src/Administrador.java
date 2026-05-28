public class Administrador extends Base implements GerenciaFilmes {

    private double salario;
    private int id;

    public Administrador(String nome, int idade, String email, double salario, int id) {
    super(nome, idade, email);
    this.salario = salario;
    this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void adicionarUsuario(Usuario usuario) { // // metodos abstratos
        System.out.println("Usuário adicionado pelo administrador.");
    }

    @Override
    public void alterarUsuario(Usuario usuario) {
        System.out.println("Usuário alterado pelo administrador.");
    }

    public void excluirUsuario(Usuario usuario) { // metodo da propria classe
        System.out.println("Usuário excluído.");
    }

    @Override
    public void incluirFilme(Filme filme) { // // metodo interface
        System.out.println("Filme incluído.");
    }

    @Override
    public void excluirFilme(Filme filme) {
        System.out.println("Filme excluído.");
    }

    @Override
    public void alterarFilme(Filme filme) {
        System.out.println("Filme alterado.");
    }
}