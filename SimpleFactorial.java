
package problemsolving;

import java.util.Scanner;


public class SimpleFactorial {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int X,temp=1;
        
        X = in.nextInt();
       
        
        while(X!=1){
            temp *=X;
            
            X--;
        
        }
        System.out.println(temp);
    }
}
