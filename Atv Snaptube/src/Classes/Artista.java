package Classes;

public class Artista {

    private String nome;
    private String lancamentos;
    private int dataLancamento;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(String lancamentos) {
        this.lancamentos = lancamentos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void infoArtista(){
        System.out.println("nome do Artista: " + nome);
        System.out.println("Idade do Artista: " + idade);
        System.out.println("lançamentos do Artista: " + lancamentos);
        System.out.println("Data de lançamento: " + dataLancamento);

    }
}
