
package Adhoc;

import java.util.Scanner;


public class code {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        long x = in.nextLong();
        int cou = 0;
        
        while (x != 0){
            if (x%10==4 || x%10==7) {
                cou++;
            }
            x/=10;

        }
        if (x==4 || x==7) {
            System.out.println("YES");
                   
        }
        else
            System.out.println("NO");
        
    }
}
