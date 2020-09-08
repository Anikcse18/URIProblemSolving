
package problem.solving;

import java.util.Scanner;


public class Game_Time_With_Minutes {
    
    public static void main(String[] args) {
        int X,m,Y,n,c,e,f,g;
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        m = input.nextInt();
        Y = input.nextInt();
        n = input.nextInt();
        
        if (X==Y && m==n) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        
        
       else if (X==Y && m>n){
        
               c = (24-X)+Y;
                
                if (m>n){
                    e = m-n; 
                    g = ((c*60)-e)/60;
                    f = ((c*60)-e)%60;
                    System.out.println("O JOGO DUROU "+g+" HORA(S) E "+f+" MINUTO(S)");
                }
                
                
        }
       
        else if(X==Y && m<n){
         c =Y-X;
                
            
                if (m<n) {
                    
                    e = n-m;
                    System.out.println("O JOGO DUROU "+c+" HORA(S) E "+e+" MINUTO(S)");
                }
                
        }
       
       
        
        else {
            if (X>Y) {
                
                c = (24-X)+Y;
                
                if (m<n) {
                    
                    e = n-m;
                    System.out.println("O JOGO DUROU "+c+" HORA(S) E "+e+" MINUTO(S)");
                }
                
                else if (m>n){
                    e = m-n; 
                    g = ((c*60)-e)/60;
                    f = ((c*60)-e)%60;
                    System.out.println("O JOGO DUROU "+g+" HORA(S) E "+f+" MINUTO(S)");
                }
                
            }
            
            
            else {
                
                c = Y-X;
                
            
                if (m<n) {
                    
                    e = n-m;
                    System.out.println("O JOGO DUROU "+c+" HORA(S) E "+e+" MINUTO(S)");
                }
                
                else if(m>n){
                    e = m-n;
                    g = ((c*60)-e)/60;
                    
                    f = ((c*60)-e)%60;
                    
                    System.out.println("O JOGO DUROU "+g+" HORA(S) E "+f+" MINUTO(S)");
                }
                else{
                
                    System.out.println("O JOGO DUROU "+c+" HORA(S) E 0 MINUTO(S)");
                
                
                }
            }

        }
        

        
    }
}
