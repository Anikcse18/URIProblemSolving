
package problemsolving;

import java.util.Scanner;


public class SumofConsecutiveOddNumbersII {
    public static void main(String[] args) {
        int N,X,Y,Z=0,M=0;
        
        Scanner in=new Scanner(System.in);
        N = 3;
        int Arr1[]=new int[N];
        int Arr2[]=new int[N];
        for (int i = 0; i < N; i++) {
            
            Arr1[i]=in.nextInt();
            Arr2[i]=in.nextInt();
            
        }
        
        for (int i = 0; i < N; i++) {
            X=Arr1[i];
            Y=Arr2[i];
            if (X<=0||Y<=0) {
                
                System.out.println("");
                
            }
            else{
                if (X>Y) {
                   for (int j = Y; j <=X; j++) {
                    
                       System.out.print(j+" ");
                        M+=j;
                     }
                    System.out.println("Sum="+M);
                            M=0;
                
                    
                }
                else{
                
                for (int j = X; j <=Y; j++) {
                    
                    System.out.print(j+" ");
                        Z+=j;
                        
                       
                }
                System.out.println("Sum="+Z);
                Z=0;
            }
            }
           
            
            
        }
    }
}
