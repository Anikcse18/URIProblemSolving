
package problemsolving;

import java.util.Scanner;


public class Triangle {
    
    public static void main(String[] args) {
        int arr[] = new int[4],d,X,Y;
        
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
            
        }
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = i+1; j < 4; j++) {
                
                if (arr[j]<arr[i]) {
                    
                    d = arr[j];
                    arr[j] = arr[i];
                    arr[i]=d;
                    
                    
                }
                
            }
          
        }
        X = arr[0]+arr[1];
        Y = arr[1] + arr[2];
        
        if (X>arr[2] || Y>arr[3]) {
            System.out.println("S");
           
        }else{
            
            System.out.println("N");
        
        }
        
        
        
    }
    
}
