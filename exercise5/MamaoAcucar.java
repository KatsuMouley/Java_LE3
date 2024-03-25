package exercise5;

public class MamaoAcucar {

    double money;
    public MamaoAcucar(double coins){
        this.money = coins;
    }
    public double parcela(int parcelado){
        return money/parcelado;
    }
    
}
