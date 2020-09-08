
package problemsolving;

import java.util.Scanner;


public class LineinArray {
    
    public static void main(String[] args) {
        
          double Bideractional[][] = new double[12][12];
          int N;
          char A;
          double temp = 0;
          Scanner in = new Scanner(System.in);
          
            N = in.nextInt();
            A = in.next().charAt(0);
            
            
          for (int i = 0; i < 12; i++) {
              
                for (int j = 0; j < 12; j++) {
                    
                    Bideractional[i][j] = in.nextDouble();
                }

        }
          
          
          for (int i = 0; i < 12; i++) {
              
              temp += Bideractional[i][N];
              
        }
          if (A =='S') {
                  System.out.printf("%.1f\n",temp);
              }
              else if(A=='M'){
                  System.out.printf("%.1f\n",temp/12);
              
              }
        
    }
}
