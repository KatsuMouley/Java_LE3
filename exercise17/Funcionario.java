package exercise17;

public class Funcionario {
    String name;
    double salarioFun;
    double salarioMin;
    int reajuste;
    public Funcionario(String name, double salarioFun, double salarioMin){
        this.name = name;
        this.salarioFun = salarioFun;
        this.salarioMin = salarioMin;
        if (salarioFun < salarioMin*3) {
            this.reajuste = 50;
        } else if (salarioFun > salarioMin*3 && salarioFun <= salarioMin*10) {
            this.reajuste = 20;
        } else if (salarioFun > salarioMin*10 && salarioFun <= salarioMin*20) {
            this.reajuste = 15;
        } else {
            this.reajuste = 10;
        }
    }

    
    public double reajuste(){
        if (salarioFun < salarioMin*3) {
            this.reajuste = 50;
            return (salarioFun+(salarioFun*0.50)/*reajuste de 50%*/);
        } else if (salarioFun > salarioMin*3 && salarioFun <= salarioMin*10) {
            this.reajuste = 20;
            return (salarioFun+(salarioFun*0.20));
        } else if (salarioFun > salarioMin*10 && salarioFun <= salarioMin*20) {
            this.reajuste = 15;
            return salarioFun = salarioFun + (salarioFun*0.15);
        } else {
            this.reajuste = 10;
            return salarioFun = salarioFun + (salarioFun/0.1);
        }
    }
    
}
