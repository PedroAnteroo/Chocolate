package Classes;

public class PodCast {

    private String nome;
    private String participantes;
    private int duarcao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public int getDuarcao() {
        return duarcao;
    }

    public void setDuarcao(int duarcao) {
        this.duarcao = duarcao;
    }

    public void infoPod(){
        System.out.println("nome do PodCast: " + nome);
        System.out.println("participantes do PodCast: " + participantes);
        System.out.println("duraçao do PodCast: " + duarcao);
        System.out.println("");
    }
}
