
package problemsolving;

import java.util.Scanner;

public class BobConduit {
    
    public static void main(String[] args) {
        int n,a ,b;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a+b);
        }
    }
    
}
