
package problem.solving;

import java.util.Scanner;


public class OddNmber {
    public static void main(String[] args) {
        int X,i=1;
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        
       do{
           System.out.println(i);
           i=i+2;
       }
       while(i<=X);
        
    }
}
