package exercise16;

import java.util.Random;
public class Funcionarios {
    Random rand = new Random();
    double salario;
    String message;
    int type;
    //salario minimo de 1500
    public Funcionarios(char salarium){
        //este constructor decide o salário dos 584 funcionários
        if (salarium == 'A') {
            this.salario = rand.nextDouble(3000)+1500;//até 3 salários minimos
            type = 1;
        } else if (salarium == 'B') {
            this.salario = rand.nextDouble(10500)+4500;//de 3 até 10 salários minimos
            type = 2;
        } else if (salarium == 'C') {
            this.salario = rand.nextDouble(15000)+15000;//de 10 até 20 salários minimos
            type = 3;
        } else if (salarium == 'D') {
            this.salario = rand.nextDouble(30000)+30000;// o restante
            type = 4;
        }
    }
    public void showsalarium(){
        if (salario < 4000/* 4000 para n ter coisa tipo 4499 q é quase a mesma coisa que 3 salários minimos*/) {
            System.out.println(String.format("%.2f", salario) + " R$ olha o salário desse cara é menor que 3 salarios minimos (até 4000)(A)");
        } else if (salario > 4000 && salario < 14500) {
            System.out.println(String.format("%.2f", salario) + " R$ olha o salário desse cara é maior que 3 salarios minimos (até 14500))(B)");
        } else if (salario > 14500 && salario < 29500) {
            System.out.println(String.format("%.2f", salario) + " R$ olha o salário desse cara é maior que 10 salarios minimos (até 29500)(C)");
        } else if (salario > 29500) {
            System.out.println(String.format("%.2f", salario) + " R$ o salário desse moço é bem grande, maior do que 20 salários minimos (até 60000)(D)");
        }
    }
    
}
