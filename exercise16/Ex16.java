package exercise16;
import java.util.Scanner;
import java.util.Random;
//Esse programa é gigante demais namoral, 584 funcionários requerem valores aleatórios para determinar o salário de todos ou uma simplificação para 5 funcionários >:1
//Eu gosto do meu input.nextDouble(); >:³³£¢¢¬¬¹²³
public class Ex16 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int aleatorio;
        Funcionarios[] funcionario = new Funcionarios[584];
        for (int i = 0; i < funcionario.length; i++) {
            aleatorio = rand.nextInt(100)+1;
            //ESTA PARTE DO CÓDIGO DECIDE O SALÁRIO DOS FUNCIONÁRIOS ATRAVÉS DE UMA PORCENTAGEM
            if (aleatorio < 6) {//5%
                funcionario[i] = new Funcionarios('D');// 5% dos funcionários da empresa ganham mais do que 20 salarios minimos
            } else if (aleatorio > 5 && aleatorio < 21) {//15%
                funcionario[i] = new Funcionarios('C');// 15% dos funcionários da empresa ganham até 20 salarios minimos
            } else if (aleatorio > 20 && aleatorio < 51) {//30%
                funcionario[i] = new Funcionarios('B');// 30% dos funcionários da empresa ganham até 10 salarios minimos
            } else if (aleatorio > 50 && aleatorio < 101) {//50%
                funcionario[i] = new Funcionarios('A');// 50% dos funcionários da empresa ganham menos do que 3 salarios minimos
            }
        }
        char opt;
        System.out.println("Você quer ver os salarios sem o reajuste?");
        System.out.println("(a)mostrar todos\n(b)ver apenas o primeiro\n(c)não mostrar");
        System.out.println("||AVISO, são 584 funcionários||");
        opt = input.next().charAt(0);
        if (opt == 'a' || opt == 'A') {
            for (int i = 0; i < funcionario.length; i++) {
                System.out.println("Funcionário ["+(i+1)+"]");
                funcionario[i].showsalarium();
            }
        } else if (opt == 'b' || opt == 'B') {
            System.out.println("Funcionário ["+1+"]");
            funcionario[0].showsalarium();
        }
        input.close();
    }
}
