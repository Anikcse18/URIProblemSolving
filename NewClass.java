
package problemsolving;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);
        double temp=0,counter=0;
        char O;
        O = in.next().charAt(0);
        
        double arr[][] = new double[12][12];
        
            for (int i = 0; i < 12; i++) {
                
                for(int j = 0; j< 12; j++){
                
                    arr[i][j] = in.nextDouble();
                
                }
            
        }
        
        for (int i = 1; i < 12; i++) {
            
            for (int j = 0; j < i; j=j+1) {
                
                System.out.println(i+""+j+" ");
                
                temp += arr[i][j];
                counter ++;
               
                
            } 
            
            
            
        }
        
                    if (O=='S') {

                               System.out.printf("%.1f\n",temp);
                           }

                    else if(O=='M'){

                               System.out.printf("%.1f\n",(temp/counter));

                           }
    }
}
