
package problemsolving;

import java.util.Scanner;

//////////REST OF DIVISION
///REST OF DIVISION 1133


public class RestOfaDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int X,Y,remainder,temp;
        
        X = in.nextInt();
        Y = in.nextInt();
        if (X>Y) {
            temp = Y;
            Y = X;
            X = temp;
 
        }
        
        for (int i = X+1; i <Y; i++) {
            
            remainder = i%5;
            
            if (remainder==2 || remainder==3) {
                System.out.println(i);
            }
            
           
        }
    }
}
