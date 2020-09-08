
package problemsolving;

import java.util.Scanner;

public class WhoseTurnIsIt {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
             
             int size;
             size = input.nextInt();
                
             int Num1;
             int Num2;
             
               String s1,e1,s2,e2;
               
               
             for (int i = 0; i <size; i++) {
               
                 s1 = input.next();
                 e1 = input.next();
                 s2 = input.next();
                 e2 = input.next();
                 
                Num1 = input.nextInt();
                Num2 = input.nextInt();
                
                 if (( Num1+Num2)%2==0) {
                     
                     if (e1.equals("PAR")) {
                         
                         System.out.println(s1);
                         
                     }else{
                     
                         System.out.println(s2); 
                     
                     }
                    
                 }
                 else{
                 
                      if (e1.equals("PAR")) {
                         
                         System.out.println(s2);
                         
                     }else{
                     
                         System.out.println(s1); 
                     
                     }
                    
                 
                 }
             
            
        }
      
    }
    
}
