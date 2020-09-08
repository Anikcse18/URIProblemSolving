
package problemsolving;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        int X,Input,counter = 0;
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        
        for (int i = 0; i < X; i++) {
            
            Input = in.nextInt();
            
            for (int j = 1; j<=Input; j++) {
                
                
                if (Input%j == 0) {
                    counter++;
                }
                
                
            }
            if (counter==2) {
                System.out.println(Input+" eh primo");
                counter =0;
            }
            else if(counter>2){
            
                System.out.println(Input+" nao eh primo");
                counter =0;
            }
        }
       
        
    }
}
