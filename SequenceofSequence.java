
package problemsolving;

import java.util.Scanner;

public class SequenceofSequence {
   
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int caso = 1;
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
        
            number = in.nextInt();
            System.out.print("Caso "+caso+": ");
            caso++;
            sum = (number*(number+1))/2;
            System.out.println(sum+1+" numeros");
//            if (number==0) {
//                System.out.print(0);
//            }else{
                for (int i = 0; i<=number; i++) {
//                    if (i==0) {
//                        System.out.print(0+" ");
//                    }else{
                        for (int j = 0; j <i; j++) {
                            System.out.print(i+" ");
                        }
                    
//                    }
            }
            
            
//            }
            System.out.println("\n");
            

        }
 
        
    }
    
}
