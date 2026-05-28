public class Sala { // alterar
    private Sessao[] sessoes; // array vetor que guarda varios objetos da sessao

    public Sala(int tamanho) {
        sessoes = new Sessao[tamanho]; // Instancia o array
    }

    public void adicionarSessao(Sessao s){
        for(int i = 0; i < sessoes.length; i++){
            if(sessoes[i] == null){
                sessoes[i] = s;
                return;
            }
        }
    }

    public Sessao getSessao(int index) {
        return sessoes[index];
    }

    public void mostrarSessoes() { // Mostrar sessões
        System.out.println("=== SESSÕES DISPONÍVEIS ===");

        for (int i = 0; i < sessoes.length; i++) {
            if (sessoes[i] != null) {
                System.out.println("Sala: " + sessoes[i].getNumeroSala());
                System.out.println("Filme: " + sessoes[i].getFilme().getNome());
                System.out.println("Tipo: " + sessoes[i].getTipoSala());
                System.out.println("Horário: " + sessoes[i].getHorario());
                System.out.println("----------------------");
            }
        }
    }
} 