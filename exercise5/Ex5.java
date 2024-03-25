package exercise5;
import java.util.Scanner;
public class Ex5{
    public static void run(){
        Scanner input = new Scanner(System.in);
        double money;
        System.out.println("Qual o valor da compra?(R$)?");
        money = input.nextDouble();
        input.nextLine();
        MamaoAcucar prestacao = new MamaoAcucar(money);
        System.out.println("Você realizou uma compra na loja Mamão com açucar, e o pagamento será realizado em 5 prestações sem juros, sendo cada uma no valor de "+ prestacao.parcela(5)+"R$");
    }
}