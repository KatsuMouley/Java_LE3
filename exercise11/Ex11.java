package exercise11;
import java.util.Scanner;
public class Ex11{
    public static void run(){
        Scanner enter = new Scanner(System.in);
        Pessoa pessoas = new Pessoa();
        pessoas.getsex();
        pessoas.showSex();
        enter.close();
    }
}
