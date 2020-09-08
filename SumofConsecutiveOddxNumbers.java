
package problemsolving;

import java.util.Scanner;


public class SumofConsecutiveOddxNumbers {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int X,Fin,Sin,Value,temp=0;
        X = in.nextInt();
        
        for (int i = 0; i < X; i++) {
            
           Fin = in.nextInt();
           Sin = in.nextInt();
           
            if (Fin%2==0) {
                
                Value = Fin+1;
                
                
            }else{
                
                Value = Fin;
            
            }
            for (int j = 1; j <= Sin; j++) {
                
                temp +=Value;
                Value = Value+2;
            }
            System.out.println(temp);
            
            Value = 0;
            temp = 0;
       }
            
            }
}




