
package problemsolving;

import java.util.Scanner;


public class EasyFibonacci {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N,temp=0,ans=0,preNum = 0,nextNum = 1;
        N=in.nextInt();
         System.out.print(preNum+" ");
        for (int i = 1; i <=N-1; i++) {
            
           
            
            ans =preNum+nextNum;
           
            preNum = nextNum;
            nextNum = ans;
            if (i<(N-1)) {
                 System.out.print(preNum+" ");
            }
            else{
                
                System.out.println(preNum);
            
            }
            
            
           
            
        }
       
        
    }
}
