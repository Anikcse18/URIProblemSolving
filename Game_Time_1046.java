
package problem.solving;

import java.util.Scanner;

public class Game_Time_1046 {
    public static void main(String[] args) {
        
        int a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        
        if(a==b){
            
            System.out.println("O JOGO DUROU 24 HORA(S)");
        
        }
        else{
            if (a>b) {
                c = (24-a)+b;
                
                System.out.println("O JOGO DUROU "+c+" HORA(S)");
            }
            else {
                
                c =b-a;
                System.out.println("O JOGO DUROU "+c+" HORA(S)");
            
            }
        
        }
    }
}
