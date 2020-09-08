
package problemsolving;

import java.util.Scanner;

public class Mjölnir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String h;
        int size,i = 0,amm;
            size = in.nextInt();
           
            
           for (int j = 0; j < size; j++) {
               
               h = in.next();
               amm = in.nextInt();
              
               if (h.substring(0, 4).equals("Thor")) {
                   
                   System.out.println("Y");
               }else{
               
                   System.out.println("N");
               }

               
              
        }
      
    }
        
       
    
}
