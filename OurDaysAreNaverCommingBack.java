
package problemsolving;

import java.util.Scanner;


public class OurDaysAreNaverCommingBack {
    
    public static void main(String[] args) {
        String D = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        Scanner in = new Scanner(System.in);
        int size;
            size = in.nextInt();
        
        
        for (int i = 0; i < size; i++) {
            
                System.out.print(D.charAt(i));
                
        }
        System.out.println("");
        
    }
    
}
