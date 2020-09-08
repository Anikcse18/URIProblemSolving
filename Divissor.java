
package problemsolving;

import java.util.Scanner;


public class Divissor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X,Ans=0;
        X = in.nextInt();
        for (int i = 1; i <= X; i++) {
            
            Ans = X%i;
            
            if (Ans==0) {
                System.out.println(i);
            }
        }
    }
}
