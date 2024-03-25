package exercise6;

public class Produto{
    String name;
    double cost, tax;

    public Produto(){}
    public Produto(String nameP, double costP){
        this.name = nameP;
        this.cost = costP;
    }
    public Produto(String nameP, double costP, double taxP){
        this.name = nameP;
        this.cost = costP;
        this.tax = taxP;
    }
    public double sumValue(){
    return cost+(cost*(tax/100));
    } 
    
}
