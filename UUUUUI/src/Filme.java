public class Filme {

        // OBJETOS OU "VARIAVEIS"
        private String nomeDoFilme;
        private int anoFilme;
        private int duracao;
        private String genero;
        private int avaliacao;
        private double notasAvaliacoes; // ESSE OBJETO ESTA PRIVADO A ESSA CLASSE ENTAO ELA N APARECE NA CLASSE MAIN.
        private int totalAvaliacoes; // ESSA TMB ESTA PRIVADA

//    public Filme(String nomeDoFilme, int anoFilme, int duracao, String genero) { // Construtor = (Botao direito/Generate/Constructor.
//        this.nomeDoFilme = nomeDoFilme;
//        this.anoFilme = anoFilme;
//        this.duracao = duracao;
//        this.genero = genero;
//    }

    //Get e set
    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public int getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public double getNotasAvaliacoes() {
        return notasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
    // Fim get e set


    void descreverFilme(){ // INFORMA AS INFOMAÇOES DO FILME
            System.out.println("nome do filme: "+ nomeDoFilme);
            System.out.println("Ano de Lançamento: "+ anoFilme);
            System.out.println("Duraçao Filme: "+ duracao);

        }
        private void avaliarFilme(int nota){ // NOTAS
            //notasAvaliacoes = nota + notasAvaliacoes mesma coisa que:
            notasAvaliacoes += nota;
            totalAvaliacoes++;

        }
        double mediaDasNotas(){ // FAZ A MEDIA DAS AVALIAÇOES DO FILME
            return notasAvaliacoes/totalAvaliacoes;

        }
}

