
package problemsolving;

import java.util.Scanner;


public class Bill {
    public static void main(String[] args) {
        int size,n;
        Scanner in = new Scanner(System.in);
            size = in.nextInt();
            for (int i = 0; i < size; i++) {
                
                n = in.nextInt();
                
                if (n%2==0) {
                    System.out.println(0);
                }else{
                
                    System.out.println(1);
                }
            
        }
    }
    
}
