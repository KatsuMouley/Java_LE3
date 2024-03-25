package exercise8;

public class Aluno {
    String name;
    double notas[] = new double[3];
    double media;
    
    public Aluno(){}
    public Aluno(String nameP){
        this.name = nameP;
    }
    public Aluno( double notasP1, double notasP2, double notasP3){
        this.notas[0] = notasP1;
        this.notas[1] = notasP2;
        this.notas[2] = notasP3;
    }
    public Aluno(String nameP, double notasP1, double notasP2, double notasP3){
        this.name = nameP;
        this.notas[0] = notasP1;
        this.notas[1] = notasP2;
        this.notas[2] = notasP3;
    }
    public void media(){
        for (int i = 0; i < notas.length ; i++) {
         media += notas[i];   
        }
        media = media / 3;
        System.out.printf("A média de notas do aluno %s é igual a %.1f", name, media);
        if (media<=5) {
            System.out.println("O aluno foi reprovado");
        } else if(media>=6){
            System.out.println("O aluno foi aprovado");
        } else{
            System.out.println("O aluno está em recuperação");
        }
    }
}
