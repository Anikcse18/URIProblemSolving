
package problemsolving;

import java.util.Scanner;


public class ArraychangeI {
    
    public static void main(String[] args) {
        int A[] = new int [20];
        int X;
        Scanner in = new Scanner(System.in);
        
        
        for (int i = 19; i>=0 ; i--) {
            
            
             X = in.nextInt();
             A[i] = X;
        }
        for (int i = 0; i < A.length; i++) {
            
            System.out.println("N["+i+"] = "+A[i]);
        }
        
       
            
    }
}
