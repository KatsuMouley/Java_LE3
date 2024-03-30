
import exercise1.Ex1;
import exercise2.Ex2;
import exercise3.Ex3;
import exercise4.Ex4;
import exercise5.Ex5;
import exercise6.Ex6;
import exercise7.Ex7;
import exercise8.Ex8;
import exercise9.Ex9;
import exercise10.Ex10;
import exercise11.Ex11;
import exercise12.Ex12;
import exercise13.Ex13;
import exercise14.Ex14;
import exercise15.Ex15;
import exercise16.Ex16;
import exercise17.Ex17;
import exercise18.Ex18;
import exercise19.Ex19;
import exercise20.Ex20;
import exercise21.Ex21;
import exercise22.Ex22;
import exercise23.Ex23;
import exercise24.Ex24;
import exercise25.Ex25;
import exercise26.Ex26;

public class Programa{
    public static void main(String[] args) {
            System.out.printf("Escolha uma atividade para executar\n(1 - 26)\nInput:");
            int value = UL.lerInteiro();
            UL.linhaEmBranco();
            switch (value) {
                case 1:
                    Ex1.run();                    
                    break;
                case 2:
                    Ex2.run();
                    break;
                case 3:
                    Ex3.run();
                    break;
                case 4:
                    Ex4.run(); 
                    break;
                case 5:
                    Ex5.run();
                    break;
                case 6:
                    Ex6.run(); 
                    break;
                case 7:
                    Ex7.run();
                    break;
                case 8:
                    Ex8.run(); 
                    break;
                case 9:
                    Ex9.run();
                    break;
                case 10:
                    Ex10.run();
                    break;
                case 11:
                    Ex11.run();
                    break;
                case 12:
                    Ex12.run();
                    break;
                case 13:
                    Ex13.run();
                    break;
                case 14:
                    Ex14.run();
                    break;
                case 15:
                    Ex15.run();
                    break;
                case 16:
                    Ex16.run();
                    break;
                case 17:
                    Ex17.run();
                    break;
                case 18:
                    Ex18.run();    
                    break;
                case 19:
                    Ex19.run();
                    break;
                case 20:
                    Ex20.run();                    
                    break;
                case 21:
                    Ex21.run();    
                    break;
                case 22:
                    Ex22.run();
                    break;
                case 23:
                    Ex23.run();                    
                    break;
                case 24:
                    Ex24.run();                    
                    break;
                case 25:
                    Ex25.run();                    
                    break;
                case 26:
                    Ex26.run();                    
                    break;

                default:
                    break;
        }
    }
}
