
package problemsolving;

import java.util.Scanner;


public class GrowingSequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int X;
           
            
           while(true){
                X=in.nextInt();
                if (X==0) {
                    
                    break;
                     
               }else{
                
                    for (int i = 1; i <=X; i++) {
                    
                    if (i!=X) {
                         System.out.print(i+" ");
                    }
                    else{
                    System.out.print(i);
                        System.out.println();
                    
                    }
                   
               }
                
                }
             
               
    
    }
    }
}
