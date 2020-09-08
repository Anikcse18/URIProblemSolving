
package offline_Code;

import java.util.Scanner;


public class TheMotionPicture {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double oldPrice = in.nextDouble(),temp;
        double newPrice = in.nextDouble();
        temp = ((newPrice - oldPrice)/oldPrice)*100;
        
        System.out.printf("%.2f",temp);
        System.out.println("%");
        
        
        
    }
    
}
