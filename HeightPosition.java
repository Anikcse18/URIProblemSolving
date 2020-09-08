
package problemsolving;

import java.util.Scanner;


public class HeightPosition {
    public static void main(String[] args) {
        
        
        int Z,g=0;
        
        int arr[]=new int[100];
        
        Scanner in=new Scanner(System.in);
        
        for (int i = 0; i<arr.length; i++) {
            arr[i]=in.nextInt();
        
        }
         Z=arr[0];
        
        
        for (int j = 1; j < arr.length; j++) {
            
           
            
            
            if (Z<arr[j]) {
              
                 Z=arr[j];
                
                 g = j+1;
              
           }
          
        }
        
        System.out.println(Z);
        System.out.println(g);
        
    }
}
