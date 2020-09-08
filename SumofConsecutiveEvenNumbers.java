
package problemsolving;

import java.util.Scanner;


public class SumofConsecutiveEvenNumbers {
    public static void main(String[] args) {
        int X,temp=0,Va;
        Scanner in = new Scanner(System.in);
        
        while(true){
            
            X = in.nextInt();
            if (X==0) {
                
                break;
            }
            if (X%2!=0) {
                
                Va = X+1;
                
                
            }else{
            
                Va = X;
            
            }
            for (int i =1; i <= 5; i++) {
                
                temp +=Va;
                Va = Va+2;
            }
            System.out.println(temp);
            temp=0;
        
        }
    }
}
