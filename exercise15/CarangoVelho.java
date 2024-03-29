package exercise15;

public class CarangoVelho {
    double valor;
    char gas;

    public CarangoVelho(char gas, double valor){
        this.gas = gas;
        this.valor = valor;
    }
    public double desconto(int A){ 
        return valor-((valor/100)*A);
    }
    
}