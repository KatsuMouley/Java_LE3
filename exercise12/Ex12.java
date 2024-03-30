package exercise12;
import java.util.Scanner;

public class Ex12 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        double valor;
        int year;
        //2000 < x = 12%, 2000 > x = 7%
        System.out.println("Insira o ano do veículo;");
        year = input.nextInt();
        System.out.println("Insira o valor do veículo;");
        valor = input.nextDouble();
        CarangoVelho car = new CarangoVelho(year, valor);
        char I;
        do {
            if (year < 2000) {
                car.desconto(12);
            } else if (year > 2000){               
                car.desconto(7);
            }
            System.out.println("Deseja continuar a calcular o desconto? (n)não (y)sim");
            I = input.next().charAt(0);
        } while (I != 'n' && I != 'N');
        car.showDesconto();
        input.close();
    }
} 
