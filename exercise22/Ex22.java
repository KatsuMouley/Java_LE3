package exercise22;
import java.util.Scanner;

public class Ex22 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tipo do cliente?\n(1)Residência\n(2)Comércio\n(3)Indústria");
        int clientType = input.nextInt();
        System.out.println("Quantas horas o cliente usou de energia naquele mês?");
        int horas = input.nextInt();
        input.nextLine();
        Serasa luz = new Serasa(clientType, horas);
        System.out.println("Neste mês, a conta de luz do cliente sairá em torno dê "+luz.conta());
        input.close();
    }
}
