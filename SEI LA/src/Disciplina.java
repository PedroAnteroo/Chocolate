public class Disciplina {
    String matricula ;
    String nome;
    double prova1;
    double prova2;
    double notatrabalho;
    double media;

    void calculaMediaFinal (double prova1,double prova2,double notatrabalho){
        this.prova1 = prova1 + 2.5;
        this.prova2 = prova2 + 2.5;
        this.notatrabalho = notatrabalho + 2;
        media = ((this.prova1 + this.prova2 + this.notatrabalho)/3);
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println("Media é " + media);
    }
    void calculaFaltaNotaFinal (){
        if (this.media < 60){
        double notaFinal = 60 - media;
        System.out.println("Falta " + notaFinal + " Para passar de ano");
        }
        else {
            System.out.println("Falta 0");
        }
    }
}
