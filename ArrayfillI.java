
package problemsolving;

import java.util.Scanner;


public class ArrayfillI {
    public static void main(String[] args) {
        int N[] = new int[10];
        
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        
        for (int i = 0; i < 10; i++) { 
           
            N[i] = V;
            V+=V;
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N["+i+"] = "+N[i]);
        }
    }
}
