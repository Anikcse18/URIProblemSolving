
package offline_Code;

import java.util.Scanner;


public class RomanNumeralsForPageNumber {
    
    public static void main(String[] args) {
        int input,divident,remainde;
        Scanner in  = new Scanner(System.in);
    int num[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    String sym[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    
        input = in.nextInt();
        int i  =num.length-1;
        remainde = input;
      
        while(remainde>0){
            
            divident = remainde / num[i];
           
            remainde = remainde % num[i];
            
            
            while(divident>0){ 
                
                System.out.print(sym[i]);
                
                divident--;
           
            }
            
            i--;
         
        }
        System.out.println("");
       
        }

    }
    
     
