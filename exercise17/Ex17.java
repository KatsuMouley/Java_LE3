package exercise17;
import java.util.Scanner;
public class Ex17{
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário");
        String name = input.nextLine();
        System.out.println("Insira o salário do funcionário");
        double salarioFun = input.nextDouble();
        System.out.println("Qual o salário minimo?");
        double salarioMin = input.nextDouble();
        Funcionario funcionario = new Funcionario(name, salarioFun, salarioMin);
        System.out.println("O funcionário "+ funcionario.name + " teve um reajuste de "+funcionario.reajuste+"%, seu novo salário é "+funcionario.reajuste());
        System.out.println("A empresa vai aumentar sua folha de pagamento em "+(funcionario.reajuste()-salarioFun)+" R$");
        input.nextLine();
        input.close();
    }
}