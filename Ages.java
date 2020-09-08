
package problemsolving;

import java.util.Scanner;


public class Ages {
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        int X,Count=0;
        double temp=0;
        
        while(true){
          
            X = in.nextInt();
              if (X>=0) {
                  
                Count++;
                temp+=X;
                
                
            }else{
                  temp = temp/Count;
                  System.out.printf("%.2f\n",temp);
                  break;
              
              }
              
//              34
//56
//44
//23
//-2
              
              
              
              
              
        }
    }
}
