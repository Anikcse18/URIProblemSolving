
package problem.solving;
import java.util.Scanner;

public class The_Pronalância_Puzzle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int lng = x.length() -1;
        for (int i = lng; i>=0; i--) {
            
            System.out.print(x.charAt(i));
        }
        System.out.println("");
    }
    
        
    
}
