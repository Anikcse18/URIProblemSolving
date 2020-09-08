
package problemsolving;

import java.util.Scanner;


public class RightArea {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float arr[][] = new float[12][12],temp = 0;
        
        int L = 0,M=0,counter = 0;
        char O;
        O = in.next().charAt(0);
        
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                
                arr[i][j] = in.nextFloat();
                
            }
            
        }
     

        for (int i = 1; i < 11; i++) {
            
              
           
            if (i<=5) {
                
            for (int j = 11-L; j < 12; j++) {
                 
                       temp += arr[i][j]; 
                        counter++; 
                
                
            }
            L++;
               
                
            }
            
            else if(i>=6){
               
                for (int j = 7+M; j < 12; j++) {
                   
                       
                       temp += arr[i][j]; 
                       counter++; 
                
                
            }
                M++;
                
            
            }
           
          
            
        
        }
        
        
         if (O=='S') {

                               System.out.printf("%.1f\n",temp);
                           }

         else if(O=='M'){

                               System.out.printf("%.1f\n",(temp/(counter-1)));

                           }
        
        
    }
}
