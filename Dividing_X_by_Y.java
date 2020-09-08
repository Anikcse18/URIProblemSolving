
package problemsolving;

import java.util.Scanner;


public class Dividing_X_by_Y {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
    double a,b,c,Lsize;
    
       
        Lsize=in.nextInt();
        
        
        for (int i = 0; i < Lsize; i++) {
             a=in.nextDouble();
             b=in.nextDouble();
             
            if (b==0) {
                System.out.println("divisao impossivel");
            }
            else{
                
               c=a/b;
                System.out.printf("%.1f\n", c);
            }
        }
    }
    
}
