
package offline_Code;

import java.util.Scanner;


public class FrogJump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ffrogHeight,temp=0,temp2=0;
        int amountPipe;
        
        ffrogHeight = in.nextInt();
        amountPipe = in.nextInt();
        
        int pipeHeigh[] = new int[amountPipe];
        
        for (int i = 0; i < amountPipe; i++) {
            
            pipeHeigh[i] = in.nextInt();
            
        }
        
        for (int i = 0; i < amountPipe-1; i++) {

                temp = pipeHeigh[i] - pipeHeigh[i+1];
                
                if (Math.abs(temp)<=ffrogHeight) {
                    temp2++;
                }
            
            
        }
        
        
        if (temp2==amountPipe-1) {
            System.out.println("YOU WIN");
        }
        else{
            System.out.println("GAME OVER");
        
        }
        
        
    }
    
}
