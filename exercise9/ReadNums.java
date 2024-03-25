package exercise9;
import java.util.Scanner;
public class ReadNums {

    Scanner enter = new Scanner(System.in);
    double Nums[] = new double[80];
    int numsBetween = 0;
    
    public ReadNums(){}
    public void getNums(){
        for (int i = 0; i < 80; i++) {
            System.out.println("Insira um número(Array["+i+"])");
            Nums[i] = enter.nextDouble();
        }
    }
    public void Between50(){
        for (int i = 0; i < Nums.length; i++) {
            if(Nums[i]>10 && Nums[i]<150){
                this.numsBetween ++;
            }
        }
        System.out.println("There's "+numsBetween+" numbers between 10 and 150 inside this object");
    }
    
}
