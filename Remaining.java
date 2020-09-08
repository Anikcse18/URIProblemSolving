
package problem.solving;

import java.util.Scanner;


public class Remaining {
    public static void main(String[] args) {
        
        int N,X=2;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        
        do {
            System.out.println(X);
            X=X+N;
            
        } while (X<=10000);
        
            
    }
}
