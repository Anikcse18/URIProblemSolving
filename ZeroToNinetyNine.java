
package problem.solving;

import java.util.Scanner;

public class ZeroToNinetyNine {
    public static void main(String[] args) {
        
        
       System.out.println("Using For Loop");
        
       int X = 100,n=-3;
       
        for(int i=100; i>0; i--) {
                
                    n = n+3;
                    System.out.println(n);
                    
                    if (n==99) {
                        
                        
                        break;
                                }
            
         
                  }
        
        System.out.println("");
        System.out.println("");
       
        System.out.println("Using While Loop");
     
       int m=-3,i=100;
        
        
       while (i>0) {
           
           
           m=m+3;
           System.out.println(m);
           if (m==99) {
               break;
           }
                   
           i--;
            }
       
       
        System.out.println("");
        System.out.println("");
       
        System.out.println("Using Do While Loop");
        
        
        int Z=0,K=40;
        
        do {
           
            System.out.println(Z);
             
            if (Z==99) {
                
                break;
            } 
            
           Z=Z+3;
            
            K--;
            
        } while (Z>0);

        
    }
}
