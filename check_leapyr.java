
package Adhoc;

import java.util.Scanner;


public class check_leapyr {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        boolean inti ;
        
        
        if (year % 400 == 0 || year%4 == 0) {
            
            inti = true;
            
        }
        else if(year%100==0){
        
             inti = false;
        
        }
        
        else{
            inti = false;
        
        }
        
        if(inti){
        
            System.out.println(year+"This Year Leap Year");
        
        }else{
        
            System.out.println(year+"This year is not Leap year");
        
        }
        
        
                
        
    }
}
