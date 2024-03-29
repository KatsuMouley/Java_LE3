package exercise14;

public class Mercado {
    double custo, venda;
    public Mercado(double venda, double custo){
        this.venda = venda;
        this.custo = custo;
    }
    

    public double lucro(){
        double lucro;
        lucro = custo - venda;
        return lucro;
    }
}
