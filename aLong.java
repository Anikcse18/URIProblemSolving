
package offline_Code;

import java.util.Scanner;


public class aLong {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int input,Year,numberOftestCase;
        numberOftestCase = in.nextInt();
        while(numberOftestCase>0){
        
        input = in.nextInt();
        if (input<2015) {
            Year = 2015-input;
            System.out.println(Year+" D.C.");
            
        }else{
            Year = input - 2014;
            System.out.println(Year+" A.C.");
        
        
        }
        numberOftestCase--;
        
        
        }
        
    }
    
}
