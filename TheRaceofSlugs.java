
package problemsolving;

import java.util.Scanner;


public class TheRaceofSlugs {
    
    public static void main(String[] args) {
        
        int size,temp;
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            
           size = in.nextInt();
        
            int arr[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            
            arr[i] = in.nextInt();
           
        }
         temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                
                if (temp<arr[i]) {
                    temp = arr[i];
                }
                
            }
            
             if (temp<10) {
                System.out.println(1);
            }
            
            else if (temp>=10 && temp<20) {
                System.out.println(2);
            }
            
            
            else if (temp>=20) {
                System.out.println(3);
                
            }
        
        
        }
  
            
            }
  
}
