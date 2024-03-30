package exercise18;

public class Funcionario {
    String name;
    int idade;
    char sexo;
    double salario;
    double abono = 0;

    public Funcionario(String name, int idade, char sexo, double salario){
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public void abono(){
           // Calculando o abono conforme o sexo e a idade
           if (sexo == 'M' || sexo == 'm') {
               if (idade >= 30) {
                   abono = 100.00;
               } else {
                   abono = 50.00;
               }
           } else if (sexo == 'F' || sexo == 'f') {
               if (idade >= 30) {
                   abono = 200.00;
               } else {
                   abono = 80.00;
               }
           } else {
               System.out.println("Sexo inválido!");
           }
    }
    public double salarioLiq(){
           return salario + abono;
    }
}

