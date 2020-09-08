
package problemsolving;

import java.util.Scanner;


public class Maindiagonal {
    public static void main(String[] args) {
        double arr[][] = new double[12][12];
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j]= 0;
            }
            
        }
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j=j+2) {
                System.out.print(" "+i+""+j);
            }
            System.out.println("");
            
            
        }
    }
}
