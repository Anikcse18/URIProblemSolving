
package problemsolving;

import java.util.Scanner;


public class Fixed_Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
             int a;
             do {
                 a=in.nextInt();
                 
                 
                 if (a==2002) {
                     System.out.println("Acesso Permitido");
                 }
                 else{
                     System.out.println("Senha Invalida");
                 }
            
        } while (a!=2002);
        
    }
    
        
    
    
}
