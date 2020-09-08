
package problemsolving;

import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
       
       int K;
       double V1,V2,V3,Z;
       
       
       Scanner in =new Scanner(System.in);
        K=in.nextInt();
        
        
        for (int i = 1; i <=K; i++) {
            V1=in.nextDouble();
            V2 =in.nextDouble();
            V3 =in.nextDouble();
            Z=(V1*2+V2*3+V3*5)/10;
            System.out.printf("%.1f\n",Z);
        }

        
    }   
       
    }

