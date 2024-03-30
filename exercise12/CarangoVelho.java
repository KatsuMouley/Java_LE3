
package exercise12;
public class CarangoVelho {
    int year;
    double valor;
    double finalValue;

    public CarangoVelho(int year, double valor){
        this.year = year;
        this.valor = valor;
        this.finalValue = valor;
    }
    public void desconto(int A){
        this.finalValue -= ((valor/100)*A);
    }
    public void showDesconto(){
        System.out.println(finalValue);
    }
    
}