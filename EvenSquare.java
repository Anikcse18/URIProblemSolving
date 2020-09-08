
package problem.solving;

import java.util.Scanner;


public class EvenSquare {
    
    public static void main(String[] args) {
         int X,Y;
    Scanner in=new Scanner(System.in);
        X=in.nextInt();
        for (int i = 2; i <=X; i++) {
 
            if (i%2==0) {
                Y=i*i;
                
                System.out.println(i+"^"+2+" = "+Y);
                
                
            }
            
        }
       
    }
    
   
    
}
