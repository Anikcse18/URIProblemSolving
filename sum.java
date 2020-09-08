
package problemsolving;

import java.util.Scanner;


public class sum {
    
    public static void main(String[] args) {
        
        int prottsha; 
        int zisan;
        int Anik;
        int sum;
        
        double lopa;
        
        System.out.println("Enter Your 3 number: ");
        Scanner in  = new Scanner(System.in);
        
        prottsha = in.nextInt();
        zisan = in.nextInt();
        Anik = in.nextInt();
        
         
         
        sum = prottsha + zisan + Anik;
        
       System.out.println("Addition is: "+sum);
       
        lopa =sum/3;
        
        System.out.println("Average is: "+lopa);
        
        
    }
    
    
}
