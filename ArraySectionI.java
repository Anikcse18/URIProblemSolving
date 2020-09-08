
package problemsolving;

import java.util.Scanner;


public class ArraySectionI {
    void Arrayrepetation(double X[]){
        
        Scanner in = new  Scanner(System.in);
      
        for (int i = 0; i < X.length; i++) {
            X[i] = in.nextDouble();
            
        }
        for (int i = 0; i < X.length; i++) {
            if (X[i]<=10) {
                System.out.printf("A["+i+"] = %.1f\n",X[i]);
            }
        }
    
    
    
    }
    
    
    public static void main(String[] args) {
        double X[] = new double[100];
         ArraySectionI ob = new ArraySectionI();
         ob.Arrayrepetation(X);
        
                
    }
}
