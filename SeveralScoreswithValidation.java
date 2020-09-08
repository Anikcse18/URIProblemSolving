
package problemsolving;

import java.util.Scanner;


public class SeveralScoreswithValidation {
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);
        
       double X,temp1,temp2=0,counter=0,ans=0;
       while(true){
           
           X = in.nextDouble();
           
           
           if (ans>0) {
               if (X==1) {
                   System.out.println("novo calculo (1-sim 2-nao)");
                   ans=0;
                   continue;
               }
               else if (X==2){
                   
                   System.out.println("novo calculo (1-sim 2-nao)");
                   break;
               }
               else{
                 System.out.println("novo calculo (1-sim 2-nao)");
                 
                 continue;
               
               }
           }
           else if (X>=0.00 && X<=10.0) {
               temp1=X;

               temp2 +=temp1;
               
               
               counter++;
               
               if (counter==2) {
                   
                   ans = temp2/2;
                   System.out.printf("media = %.2f\n",ans);
                   counter = 0;
                   temp2 = 0;
                   
               }
           }
           else{
           
               System.out.println("nota invalida");
           }
           
       
       }
      
       
        
    }
    
    
}
