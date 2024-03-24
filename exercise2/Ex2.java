package exercise2;
import java.util.Scanner;
public class Ex2{
    public static void run(){
        Scanner input = new Scanner(System.in);
        double combus; 
        int kmPercorridos;
        System.out.println("Quanto de combustivel o veículo tinha na reserva?");
        combus = input.nextDouble();
        System.out.println("Quantos km/h foram percorridos?");
        kmPercorridos = input.nextInt();
        Automovel veiculo = new Automovel(combus, kmPercorridos);
        System.out.println("O Consumo médio do veículo é de "+ veiculo.consuMedio() + " km/L");
    }
}