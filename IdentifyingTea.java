
package problemsolving;

import java.util.Scanner;


public class IdentifyingTea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int tea_type = in.nextInt();
        int contestent[] = new int[5];
        for (int i = 0; i < 5; i++) {
            contestent[i] = in.nextInt();
            if (contestent[i] == tea_type) {
                count++;
            }
             
        }
        System.out.println(count);
    }
    
}
