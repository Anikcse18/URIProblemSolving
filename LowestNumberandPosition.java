
package problemsolving;

import java.util.Scanner;


public class LowestNumberandPosition {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int X,temp,location = 0;
        
        X = in.nextInt();
        
        int Arr[] = new int[X];
        
        temp = 50;
        
        for (int i = 0; i < Arr.length; i++) {
            
            Arr[i] = in.nextInt();
                if (Arr[i] < temp) {
                  
                    temp = Arr[i];
                    
                    location = i;
            }
            
        }
        System.out.println("Menor valor: "+temp);
        System.out.println("Posicao: "+location);
    }
  
}
