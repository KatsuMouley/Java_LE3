package exercise3;

public class Vendedor {
    String nome;
    int totalVendas;
    double salarioFixo;

    public Vendedor(){}
    public Vendedor(String name, int totalSells, double salary){
        this.nome = name;
        this.totalVendas = totalSells;
        this.salarioFixo = salary;
    }
    public double salarioMes(){
        return (totalVendas*0.15)+salarioFixo;
    }
    
}
