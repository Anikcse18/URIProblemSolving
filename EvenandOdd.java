
package Adhoc;

import java.util.Scanner;


public class EvenandOdd {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            int number ;
            int evn[] = new int[size],ev=0;
            int odd[] = new int[size],od=0;
            
            for (int i = 0; i < size; i++) {
                
                number = in.nextInt();
                
                if (number%2==0) {
                  
                    evn[ev] = number; 
                    ev++;
                   
                }
                else{
                    
                    odd[od] = number;
                    od++;
                
                }
            
        }
            
            
        //Even Number Shortong
        
          int temp = 0;
            for (int i = 0; i < ev; i++) {
              
                for (int j = i+1; j < ev; j++) {
                    
                    if (evn[i]>evn[j]) {
                        temp = evn[i];
                        
                        evn[i] = evn[j];
                        evn[j] = temp;
                        
                    }
                 
                }
            
        }
           
            //Odd Number shorting
            
            for (int i = 0; i < od; i++) {
                
                for (int j = i+1; j < od; j++) {
                    
                    if (odd[i]<odd[j]) {
                        temp = odd[i];
                        
                        odd[i] = odd[j];
                        odd[j] = temp;
                        
                    }
                    
                }
             
        }
            
             //Even Numbr printing
            
            for (int i = 0; i <ev; i++) {
                
                System.out.println(evn[i]);
                
        }
            //Odd Number printing 
            
            for (int i = 0; i <od; i++) {
                
                System.out.println(odd[i]);
                
        }
            
            
    }
}
