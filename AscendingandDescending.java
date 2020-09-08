
package problemsolving;

import java.util.Scanner;


public class AscendingandDescending {
    
    public static void main(String[] args) {
     
        int x,y,n=1;
        Scanner in = new Scanner(System.in);
        
            for (int i = 0; i <n; i++) {
                
                x = in.nextInt();
                y = in.nextInt();
                if (x>y) {
                    System.out.println("Decrescente");
                    n++;
                }
                else if(x<y){
                
                    System.out.println("Crescente");
                    n++;
                }
                
                else if (x==y) {
                    n=1;
                    break;
                }
            }
        
        
    }
}
//5 4
//7 2
//3 8
//2 2

