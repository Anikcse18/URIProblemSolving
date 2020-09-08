
package problemsolving;

import java.util.Scanner;


public class Sunday_Morning {
    public static void main(String[] args) { 
       Scanner in = new Scanner(System.in);
       String out;
       while(in.hasNext()){
           
       out = in.nextLine();
       int hour = Character.getNumericValue(out.charAt(0));
       int minut = Integer.parseInt(out.substring(2, 4));
       
        if (hour<7) {
            System.out.println("Atraso maximo: "+0);
        }
        else if(hour==7){
            System.out.println("Atraso maximo: "+minut);
        }
        else if(hour==8)
            {
            System.out.println("Atraso maximo: "+(60+minut));
        }
        else{
        
            System.out.println("Atraso maximo: "+(120+minut));
        
        }
       }
 
    }
    
}
