package exercise25;

public class Nota {
    double notaLabo, exameFin, avaliaSemes, media;
    char classificacao;
    public Nota(double notaLabo, double avaliaSemes, double exameFin){
        this.notaLabo = notaLabo;
        this.exameFin = exameFin;
        this.avaliaSemes = avaliaSemes;
    }

    public void media(){
        media = ((notaLabo*2+exameFin*3+avaliaSemes*5))/(2+3+5);
        if (media >= 8.1) {
            classificacao = 'A';
        } else if (media >= 7.8) {
            classificacao = 'B';
        } else if (media >= 6.7) {
            classificacao = 'C';
        } else if (media >= 5.6) {
            classificacao = 'D';
        } else {
            classificacao = 'R';
        }
    }
}
