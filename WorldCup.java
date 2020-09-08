
package problemsolving;

import java.util.Scanner;


public class WorldCup {
    public static void main(String[] args) {
        int n,x;
        Scanner in = new Scanner(System.in);
        
        
        while(in.hasNextInt()){
            
            n = in.nextInt();
  
            if (n>0) {
                System.out.println("vai ter duas!");
            }
            
            
            else if(n==0){
                System.out.println("vai ter copa!");
            }
             
        }
    }
    
}
