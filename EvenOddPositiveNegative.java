
package problem.solving;

import java.util.Scanner;
 
import static java.lang.Math.abs;


public class EvenOddPositiveNegative {
    public static void main(String[] args) {
        int X,Y,Evn=0,Odd=0,Pos=0,Neg=0;
        
        for (int i = 0; i < 5; i++) {
            
            Scanner in = new Scanner(System.in);
            
            X = in.nextInt();
            
            Y = abs(X);
            
           if (Y%2==0) {
                Evn++;
                
            }
           else if(Y%2==1|Y%2==-1){
               Odd++;
           
           }
           
           if(X>0){
                   
               Pos++;
            }
           
           else if(X<0){
               Neg++;
           
           }
       
        }
        
        System.out.println(Evn+" valor(es) par(es)");
        System.out.println(Odd+" valor(es) impar(es)");
        System.out.println(Pos+" valor(es) positivo(s)");
        System.out.println(Neg+" valor(es) negativo(s)");
    }
 
}
