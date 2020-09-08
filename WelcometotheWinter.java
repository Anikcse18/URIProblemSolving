
package problemsolving;

import java.util.Scanner;


public class WelcometotheWinter {
    
    public static void main(String[] args) {
        int x,y,z;
        
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        
        
        if (x>y && y<=z) {
            System.out.println(":)");
            
        }
        else if(x<y && y>=z){
            
            System.out.println(":(");
        
        } 
        else if(x<y && z>y && (y-x)>(z-y)){
            
            System.out.println(":(");
        
        } 
        //4th conditions
        
        else if(x<y && z>y &&(y-x)<=(z-y)){
            
            System.out.println(":)");
        
        } 
        
        //5th conditions
       else if(x>y && y>z && (z-y)>(y-x)){
            
            System.out.println(":)");
        
        } 
          //6th conditions
       else if(x>y && y>z && (z-y)<=(y-x)){
            
            System.out.println(":(");
        
        }
        
         else if(x==y && y<z){
            
            System.out.println(":)");
        
        }
        else if(x==y && y>z){
            
            System.out.println(":(");
        
        }
        else{
            System.out.println(":(");
        
        }
    }
    
}
