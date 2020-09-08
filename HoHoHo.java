
package problemsolving;

import java.util.Scanner;

public class HoHoHo {
    public static void main(String[] args) {
        int n;
        String h = "Ho";
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        for (int i = 0; i <n; i++) {
            
            if (i<n-1) {
                System.out.print(h+" ");
            }else{
            
                System.out.println(h+"!");
            
            }
            
            
        }
    }
    
}
