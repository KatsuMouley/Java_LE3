package exercise26;
import java.util.Scanner;

public class Ex26 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do segurado:");
        String nome = input.nextLine();

        System.out.println("Informe a idade do segurado:");
        int idade = input.nextInt();

        System.out.println("Informe o grupo de risco do segurado.  Digite(baixo, medio ou alto):");
        String grupoRisco = input.next().toLowerCase();
        input.nextLine();
        Seguradora segurado = new Seguradora(nome, idade, grupoRisco);
        segurado.determinarCategoria(idade, grupoRisco);

        if (segurado.categoria != -1) {
            System.out.println("\nNome: " + segurado.nome);
            System.out.println("Idade: " + segurado.idade);
            System.out.println("Grupo de Risco: " + segurado.grupoRisco);
            System.out.println("Categoria de Seguro: " + segurado.categoria);
        } else {
            System.out.println("\nDesculpe, o segurado não se enquadra em nenhuma das categorias ofertadas.");
        }
        input.close();
    }
}
