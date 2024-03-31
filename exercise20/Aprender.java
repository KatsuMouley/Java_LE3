package exercise20;

public class Aprender {
    int horas, nivel;
    public Aprender(int nivel, int horas){
        this.horas = horas;
        this.nivel = nivel;
    }

    public double pagamento(){
        if(nivel == 1)
        {return horas * 12;}
        else if(nivel == 2)
        {return horas * 17;}
        else if(nivel == 3)
        {return horas * 25;}
        else
        {return 0;}
    }
}
