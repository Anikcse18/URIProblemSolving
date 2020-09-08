
package problemsolving;

import java.util.Scanner;


public class ElectricalOutlet {
    public static void main(String[] args) {
        int arr[] = new int[4],temp = 0;
        Scanner in = new Scanner(System.in);
         for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            temp +=arr[i];
               
        }
         System.out.println(temp-3);
      
    }
}
