
package problemsolving;

import java.util.Scanner;


public class FibonnaciArray {
    public static void main(String[] args) {
    int n, f;
    long fib[] = new long[61];
    
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    fib[0] = 0;
    fib[1] = 1;
    for(int j = 2; j <= 60; j++){
        
            fib[j] = fib[j-2] + fib[j-1];
            
            
            
    }
    
    
    for(int i = 0; i < n; i++){
            f = in.nextInt();
            System.out.println("Fib(" + f + ") = "+fib[f]);
            
    }
    }
}
