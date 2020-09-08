
package problem.solving;

import java.util.Scanner;


public class Taxes {
    public static void main(String[] args) {
        float X,Y,Z;
        Scanner in = new Scanner (System.in);
        X = in.nextFloat();
        Y = X-2000;
        
        if (X<=2000) {
            System.out.println("Isento");
        }
        
        
        else{
            
            if (Y>1000) {
                Y = (Y-1000);
                Z = (float) 80.0;
                if (Y>1500) {
                    
                    Y=(Y-1500);
                    Z = (float) (Z+270.00);
                    if (Y>0) {
                       Z = (float) (Z+(0.28*Y));
                        System.out.printf("R$ "+"%.2f",Z);
                        System.out.println("");
                    }
                    
                    
                }
                else{
                
                Z = (float) (Z+(0.18*Y));
                    System.out.printf("R$ "+"%.2f",Z);
                    System.out.println("");
                }
                
                
            }
            
            else{
                Z=(float) (Y*0.08);
                
                System.out.printf("R$ "+"%.2f",Z);
                System.out.println("");
                
            
            }
            
            
        }
        
    }
}
