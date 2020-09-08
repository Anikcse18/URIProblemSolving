
package problemsolving;

import java.util.Scanner;

public class PopulationIncreased {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long N,Pa,Pb;
        int anos,Sec;
        N = in.nextInt();
        double F1,F2;
        
        for (int i = 0; i < N; i++) {
            
            Pa = in.nextInt();
            Pb = in.nextInt();
            
            F1 = in.nextDouble();
            F2 = in.nextDouble();
            
           anos =0;
           Sec = 0;
            
            while(Pa<=Pb){

              Pa += Pa*(F1/100);
              Pb += Pb*(F2/100);
              
              anos++;
                
            if (anos >100) {
                    Sec = 1;
                    break;
                }
        
            }
            if (Sec==1) {
             System.out.println("Mais de 1 seculo.");
        }else{
        
            System.out.println(anos+" anos.");
        }
            
        }
        
        
    }
    
    
}
