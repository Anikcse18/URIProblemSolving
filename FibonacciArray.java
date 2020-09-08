
package problemsolving;

import java.util.Scanner;


public class FibonacciArray {
    public static void main(String[] args) {
        int testcase,Number ;
    Scanner in = new Scanner(System.in);
    testcase = in.nextInt();
   
    
    int fb[] = new int[61];
    fb[0]=0;
    fb[1]=1;
    
        for (int i = 2; i <=60; i++) {
            fb[i] = fb[i-2]+fb[i-1];
        }
        
        
        for (int i = 0; i < testcase; i++) {
            
             Number = in.nextInt();
             System.out.println("Fib(" + Number + ") = "+fb[Number]);
            
        }
    
    }
    
    
    
}
