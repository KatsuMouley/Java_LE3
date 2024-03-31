package exercise11;
import java.util.Scanner;

public class Pessoa {
    int gender[]=new int[56], f=0,m=0;
    Scanner input = new Scanner(System.in);
    public void getgender() {
        for (int i = 0; i < gender.length; i++) {
                do {
                    
                System.out.println("Please input the sex of the person: (1)Male (2)Female; ["+(i+1)+"]");
                gender[i] = input.nextInt();

                switch (gender[i]) {
                    case 1:
                        m++;
                        break;
                    case 2:
                        f++;
                        break;
                }
                } while (gender[i] != 1 && gender[i] != 2);
                input.nextLine();
        }
    }
    public void showgender(){
        System.out.println("There are "+m+" males");
        System.out.println("There are "+f+" females");
    }

}
