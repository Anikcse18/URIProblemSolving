
package problem.solving;

import java.util.Scanner;


public class PostiveNumber {
    public static void main(String[] args) {
        double A,B,C,X,Y,Z,Sum=0;
        int i=0;
        Scanner in = new Scanner(System.in);
            A = in.nextDouble();
            B = in.nextDouble();
            C = in.nextDouble();
            X = in.nextDouble();
            Y = in.nextDouble();
            Z = in.nextDouble();
            
            
            if (A>0) {
            i=1;
            Sum=Sum+A;
          }
            if (B>0) {
            i=i+1;
            Sum=Sum+B;
          }
            if (C>0) {
            i=i+1;
            Sum=Sum+C;
          }
            if (X>0) {
            i=i+1;
            Sum=Sum+X;
          }
            if (Y>0) {
            i=i+1;
             Sum=Sum+Y;
          }
           if (Z>0) {
            i=i+1;
             Sum=Sum+Z;
          }    
           
           Sum=Sum/i;
           System.out.println(i+" valores positivos");
           System.out.printf("%.1f",Sum);
           System.out.println("");
           

            
    }
}
