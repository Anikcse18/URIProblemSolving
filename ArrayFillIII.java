
package problemsolving;

import java.util.Scanner;



public class ArrayFillIII {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double arr[] = new double[100];
        double X,temp=0;
        X = in.nextDouble();
         temp = X;
        
        for (int i = 0; i < 100; i++) {
            
           
            arr[i] = temp;
            temp= temp/2;
            System.out.printf("N["+i+"] = %.4f\n",arr[i]);
            
        }
    }
            
}
