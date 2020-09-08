
package problemsolving;

import java.util.Scanner;


public class PerfectNumber {
    public static void main(String[] args) {
        int size,Number,counter,sum;
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        for (int i = 0; i < size; i++) {
            Number = in.nextInt();
            counter = 0;
            sum=0;
            
            for (int j = 1; j <= (Number/2); j++) {
                
                if (Number%j==0) {
                    sum+=j;
                   
                }
                
            }
             if (sum==Number) {
                        System.out.println(Number+" eh perfeito");
                    }
                    else{
                        System.out.println(Number+" nao eh perfeito");
                    
                    }
        }
    }
}
