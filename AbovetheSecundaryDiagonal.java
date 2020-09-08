
package problemsolving;

import java.util.Scanner;

public class AbovetheSecundaryDiagonal {
    public static void main(String[] args) {
         
        Scanner in  = new Scanner(System.in);
        double temp=0,counter=0,M=0;
        char O;
        O = in.next().charAt(0);
        
        float arr[][] = new float[12][12];
//        
//            for (int i = 0; i < 12; i++) {
//                
//               for(int j = 0; j< 12; j++){
//                
//                    arr[i][j] = in.nextFloat();
//                
//                }
//            
//        }
        
        for (int i = 1; i < 12; i++) {
            
            
                for (int j = 11; j >= 1; j--) {
                    
                    System.out.print(i+""+j+" ");
                    
                     temp += arr[i][j];
                     counter ++;
            }
                System.out.println("");
               
               
                
            
            M++;
            
            
            
            
        }
        
                    if (O=='S') {

                               System.out.printf("%.1f\n",temp);
                           }

                    else if(O=='M'){

                               System.out.printf("%.1f\n",(temp/counter));

                           }
    }
    }

