
package problemsolving;

import java.util.Scanner;


public class ArraYsRepetation {
    public static void main(String[] args) {
        int X[]= new int[10];
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
           
           X[i] = in.nextInt();
           
        }
        for (int i = 0; i < 10; i++) {
            
            if (X[i]<=0) {
                X[i]=1;
                System.out.println("X["+i+"] = "+X[i]);
            }
            else{
            
                System.out.println("X["+i+"] = "+X[i]);
            
            }
        }
    }
       
}
