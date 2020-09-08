
package offline_Code;

import java.util.Scanner;
import java.util.Stack;


public class Dimond {
    public static void main(String[] args) {
        //Stack<Character> STACK = new Stack<Character>();
        
        Scanner in = new Scanner(System.in);
        int loopSize = in.nextInt();
        int coun=0;
        for (int i = 0; i <=loopSize; i++) {
            String H = in.nextLine();
            
            for (int j = 0; j < H.length(); j++) {
                
                if (H.charAt(i) == '<'){
                    
                    STACK.push(H.charAt(i));
                }
                else{
                    
                    
                    if (STACK.empty()) {
                        //Pass
                    }
                    
                    
                    else{
                        STACK.pop();
                        coun ++;
                    
                    }
                
                }
                
            }
            System.out.println(coun);
            STACK.clear();
            
            
        }
        
        
        
    }
    }

