
package problem.solving;

import java.util.Scanner;


public class EvenOrOdd2 {
    public static void main(String[] args) {
        int N,X;
        
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
            
        for (int i = 1; i <= N; i++) {
            
            X=in.nextInt();
            
            if (X==0) {
                System.out.println("NULL");
            }
            
            else if(X%2==0){
                
                
                if (X>0)
                    System.out.println("EVEN POSITIVE");
                else
                    System.out.println("EVEN NEGATIVE");
            
            }
            else{
                if (X>0)
                    System.out.println("ODD POSITIVE");
                else
                    System.out.println("ODD NEGATIVE");
            
            }
               
                    
        }
        
    }
}
