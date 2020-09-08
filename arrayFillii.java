
package problemsolving;

import java.util.Scanner;


public class arrayFillii {
    public static void main(String[] args) {
        
        int arr[] = new int[1000];
        
        int X,temp = 0;
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        
        for (int i = 0; i < 1000; i++) {
            
           
            if (temp==(X)) {
                
                temp = 0;
                
            }
            arr[i] = temp;
             temp ++;
            
            
            System.out.println("N["+i+"] = "+arr[i]);
 
            
           
            
            
        }
                
    }
}
