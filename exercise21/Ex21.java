package exercise21;
import java.util.Scanner;

public class Ex21 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a idade do nadador?");
        int age = input.nextInt();
        input.nextLine();
        Nadador swim = new Nadador(age);
        System.out.println("A categoria que o nadador cai é a de "+swim.categoria());
        input.close();
    }
}
