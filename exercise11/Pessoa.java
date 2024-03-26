package exercise11;
import java.util.Scanner;

public class Pessoa {
    int sex[]=new int[56], f=0,m=0;
    Scanner input = new Scanner(System.in);
    public void getsex() {
        for (int i = 0; i < sex.length; i++) {
                do {
                    
                System.out.println("Please input the sex of the person: (1)Male (2)Female; ["+(i+1)+"]");
                sex[i] = input.nextInt();

                switch (sex[i]) {
                    case 1:
                        m++;
                        break;
                    case 2:
                        f++;
                        break;
                }
                } while (sex[i] != 1 && sex[i] != 2);
                input.nextLine();
        }
    }
    public void showSex(){
        System.out.println("There are "+m+" males");
        System.out.println("There are "+f+" females");
    }

}
