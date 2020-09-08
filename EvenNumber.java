
package problem.solving;

import java.util.Scanner;


public class EvenNumber {
    
    public static void main(String[] args) {
        
        int X,Tem=0;
        
        for (int i = 0; i < 5; i++) {
            
            Scanner in = new Scanner(System.in);
           
             X = in.nextInt();
             
             if (X<0) {
                X = -X;
            }
            
             if (X%2==0) {
                 
                Tem=Tem+1;
            }
        }
        System.out.println(Tem+" valores pares");
        
                  
    }
}
