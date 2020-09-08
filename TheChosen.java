
package offline_Code;

import java.util.Scanner;


public class TheChosen {
    public static void main(String[] args) {
        int stuSize,intigator=0;
        
        Scanner in = new Scanner(System.in);
        
        stuSize = in.nextInt();
        
        int reg[] = new int[stuSize];
        float mark[] = new float[stuSize];
        for (int i = 0; i < stuSize; i++) {
            
             reg[i] = in.nextInt();
             mark[i] = in.nextFloat();
            
        }
        float tmp = 3;
        int flag = 0;
        for (int i = 0; i < stuSize; i++) {
            
            if (mark[i]<8) {
                intigator++;
               
            }
            else{
                if(mark[i]>tmp){
                    
                    tmp = mark[i];
                    flag = i;
                    
                }
               
                
            
            }
            
        }
        if (intigator==stuSize) {
            System.out.println("Minimum note not reached");
        }
        else{
        
            System.out.println(reg[flag]);
            
        
        }        
    }
    
}
