package exercise7;

public class Carro {
    double fabriPrice;
    public Carro(){}
    public Carro(double fabriPriceP){
        this.fabriPrice = fabriPriceP;
    }
    public double imposto(){
        return (fabriPrice + (fabriPrice*0.45))+(fabriPrice*0.28);
    }
    
}
