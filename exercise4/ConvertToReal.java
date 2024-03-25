package exercise4; 

public class ConvertToReal {
    double cotacaoDoDolar, money;

    public ConvertToReal(double cDol, double myMoney){
        this.cotacaoDoDolar = cDol;
        this.money = myMoney;
    }
    
    public double toReal(){
        return cotacaoDoDolar * money;
    }

}
