
import java.util.Scanner;


public class fox_snake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int cou = 0;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
          
            for (int j = 0; j < col; j++) {
                
                if (i%2==0) {
                    System.out.print("#");
                }
                
                else{
                    if (j==0) {
                       cou ++; 
                    }
      
                    if (cou%2!=0) {
                        
                        if (j==col-1) {
                            System.out.print("#");
                        }
                        else{
                            System.out.print(".");

                        }
                            
                    }
                    else{
                        
                         if (j==0) {
                             
                            System.out.print("#");
                            
                        }
                        else{
                             
                            System.out.print(".");

                        }
                    
                    }
                  
                }
 
                
            }
            System.out.println("");
       
        }
    }
}
    
    
