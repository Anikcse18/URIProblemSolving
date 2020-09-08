
package problem.solving;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        int X=0,N;
        Scanner in=new Scanner(System.in);
            N=in.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            X=i*N;
            
            System.out.println(i+" x "+N+" = "+X);
            
        }
    }
}
