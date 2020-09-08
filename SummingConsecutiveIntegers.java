
package problemsolving;

import java.util.Scanner;


public class SummingConsecutiveIntegers {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int A,N,sum=0;
        A = in.nextInt();
        
        while(true){
            
            N = in.nextInt();
            if (N<=0) {
                continue;
            }
        
        for (int i = A; i <(A+N); i++) {
            sum +=i;
            
        }
        System.out.println(sum);
        break;
        
        
        }
        
        
        
        
                
    }
}
