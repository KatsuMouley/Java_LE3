package exercise13;

public class Pessoa {
    int idade;//some int
    String nome;//name. bad good
    char sexo, saude;//f F m M
    public Pessoa(int idade, String nome, char saude, char sexo){
        this.idade = idade;
        this.nome = nome;
        this.saude = saude;
        this.sexo = sexo;
    }
    
    public boolean militar(){
            //Estes critérios não definem minha posição em relação ao assunto, favor não me cancelem
        if (idade > 17 && (sexo == 'm' || sexo == 'M') && (saude == 'g' || saude == 'G')) {
            return true;   
        } else {
            return false;
        }
    }
}
