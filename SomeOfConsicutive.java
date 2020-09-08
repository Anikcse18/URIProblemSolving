
package problem.solving;

import java.util.Scanner;


public class SomeOfConsicutive {
    public static void main(String[] args) {
        int X,Y;
        Scanner in = new Scanner(System.in);
        X=in.nextInt();
        Y=in.nextInt();
        for (int i = Y; i <= X; i++) {
            System.out.println(i);
            Y=Y+1;
        }
    }
}
