
package problemsolving;

import java.util.Scanner;


public class Repetingnumber {
    
    public static void main(String[] args) {
        int n,count=0,c;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
         int arr[] = new int[n];
         
         for (int i = 0; i < arr.length; i++) {
             arr[i] = in.nextInt();
            
        }
         c = arr[0];
         
         for (int j = 0; j < arr.length; j++) {
                
                if (c>arr[j]) {
                    
                    c = arr[j];
                    count++;
                 
             }
        }
         System.out.println(count);
         
        
    }
      
       
    
    
    
}
