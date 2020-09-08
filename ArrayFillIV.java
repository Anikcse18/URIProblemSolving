
package problemsolving;

import java.util.Scanner;
import java.math.*;



public class ArrayFillIV {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int Arr1[] = new int[15];
        int Arr2[] = new int[15];
        int X;
        
        for (int i = 0; i < 15; i++) {
            X = in.nextInt();
            
            for (int j = 0%5; j < 5; j++) {
                
            }
            
            if (Math.abs(X%2)==0) {
                Arr1[i] = X;
            }
            
        }
        
    }
    
}
