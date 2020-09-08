
package problem.solving;

import java.util.Scanner;


public class SixOddNumber {
    public static void main(String[] args) {
        int X,Y=0,Z;
        Scanner in =new Scanner(System.in);
        
        X = in.nextInt();
        Y=X+11;
        
        
        if (X%2==0) {
            X=X+1;
            Y=X+11;
            do {
                    System.out.println(X);
                    X=X+2;


            } while (X<Y);
            
        }
        
        else{
            do {
                    System.out.println(X);
                    X=X+2;


            } while (X<Y);
        
        }
       
       
    }
}
