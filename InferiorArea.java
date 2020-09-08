
package problemsolving;

import java.util.Scanner;


public class InferiorArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char O;
        int counter = 0,divider=0;
        float temp = 0;
        double arr[][] = new double[12][12];
        
         O = in.next().charAt(0);
         
         
        for (int i = 0; i < 12; i++) {
            
            for (int j = 0; j < 12; j++) {
                
                
                arr[i][j] = in.nextDouble() ;
                
                
                
                
                        }
        }
        


        for (int i = 7; i < 12; i++) {
            
            for (int j = 5-counter; j < 7+counter; j++) {
                
               
                
                temp += arr[i][j];
                divider++;
                
                
                
            }
       
            counter++;
           
            
        }
        
        
       
                    if (O =='S') {

                               System.out.printf("%.1f\n",temp);
                           }

                    else if(O=='M'){

                               System.out.printf("%.1f\n",(temp/divider));

                           }
        
    }
}
