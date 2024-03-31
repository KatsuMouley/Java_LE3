package exercise24;

public class Nota {
    double notaLabo, exameFin, avaliaSemes;
    public Nota(double notaLabo, double avaliaSemes, double exameFin){
        this.notaLabo = notaLabo;
        this.exameFin = exameFin;
        this.avaliaSemes = avaliaSemes;
    }

    public double media(){
        double media = ((notaLabo*2+exameFin*3+avaliaSemes*5))/(2+3+5);
        return media;
    }
}
