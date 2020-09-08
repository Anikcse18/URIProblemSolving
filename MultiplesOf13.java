
package problemsolving;

 //MultiplesOf12 1132

import java.util.Scanner;


public class MultiplesOf13 {
    
    public static void main(String[] args) {
        
        int X,Y,temp = 0,remain,sumOfAll=0;
        Scanner in = new Scanner(System.in);
            X = in.nextInt();
            Y = in.nextInt();
            if (X>Y) {
            temp = Y;
            Y = X;
            X = temp;
            
        }
            for (int i = X; i <= Y; i++) {
                remain = i%13;
                if (remain !=0) {
                    sumOfAll +=i;
                    
                }
  
        }
        
            System.out.println(sumOfAll);
        
        
    }
    
    
}
