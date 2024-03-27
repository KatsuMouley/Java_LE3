package exercise13;

import java.util.Scanner;

import exercise10.Idade;

public class Ex13 {
    public static void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira quantas pessoas se alistaram para o serviço militar?");
        int peopleQuantity = input.nextInt();
        Pessoa[] pessoas = new Pessoa[peopleQuantity];

        int[] idade = new int[peopleQuantity];
        String[] nome = new String[peopleQuantity];
        char[] sexo = new char[peopleQuantity], saude = new char[peopleQuantity];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Qual o nome da pessoa ["+(i+1)+"]");
            nome[i] = input.nextLine();
            System.out.println("Qual a idade da pessoa "+(i+1)+"] , "+nome[i]);
            idade[i] = input.nextInt();
            System.out.println("Qual o estado da sáude da pessoa ["+(i+1)+"] (g)good (b)bad");
            saude[i] = input.next().charAt(0);
            System.out.println("Qual o sexo da pessoa ["+(i+1)+"]");
            sexo[i] = input.next().charAt(0);
            
            pessoas[i] = new Pessoa(idade[i], nome[i], saude[i], sexo[i]);
        }
    }
} 
