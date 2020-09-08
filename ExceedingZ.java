
package problemsolving;

import java.util.Scanner;


public class ExceedingZ {
    public static void main(String[] args) {
        int X,Y,counter=0,ans=0,temp=0;
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        //-negtive Part
        
        if (X<0) {
            
             while(true){
                 
                 Y = in.nextInt();
                if (Y<=X) {
                        
                    continue;
                
                
                    }
                
                while(true){
                    
                    ans+=X;
                    
                    X+=1;
                    counter++;
                    if (ans>Y) {
                        System.out.println(counter);
                        break;
                    }
                    
                }
                 
                 if (ans>=Y) {
                     break;
                 }
                 
                 
             
             }
            
        }else{
         
            while(true){
        
            Y = in.nextInt();
            if (Y<=X) {
                continue;
            }
            
            for (int i = X; i <=Y; i++) {
                
                ans +=i;
                counter++;
                temp=counter;
                
                if (ans>=Y) {
                    break;
                }
                
                
            }
            System.out.println(temp);
            break;
        
        }
        
        
        
        }
          
         
                ///Positivepart
     
        

    }
    
    
}
