package exercise11;
import java.util.Scanner;
public class Ex11{
    public static void run(){
        Scanner enter = new Scanner(System.in);
        boolean verifica=false;
        Pessoa[] pessoa = new Pessoa[56];
        for (int i = 0; i < 56; i++) {
            do {
                System.out.printf("Please Insert the sex of the person[%d]\n(1)Female\n(2)Male", (i+1));
                int sex = enter.nextInt();
                switch (sex) {
                    case 1:
                        pessoa[i] = new Pessoa(sex);
                        verifica = true;
                        break;
                    case 2:
                        pessoa[i] = new Pessoa(sex);
                        verifica = true;
                        break;
                    default:
                        verifica = false;
                        break;
            } while (verifica);
                }
        }
        enter.close();
    }
}
