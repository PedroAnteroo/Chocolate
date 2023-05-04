public class Main {

    public static void main(String[] args) {
        Filme filme = new Filme(); //("Barbie",2023,90,"Drama");//O que tem no construtor isso vai dentro do ()

        filme.setNomeDoFilme("Barbie");
        filme.setAnoFilme(2023);
        filme.setDuracao(90);
        filme.setGenero("Drama"); //Com Get e Set

//        filme.nomeDoFilme = "Barbie";
//        filme.anoFilme = 2023;
//        filme.duracao = 90;
//        filme.descreverFilme();
//        filme.avaliarFilme(9);
//        filme.avaliarFilme(8);
        filme.descreverFilme(); // Tem q liberar o metodo para exibir o construtor
        System.out.println();
//        System.out.println(filme.mediaDasNotas());


    }
}