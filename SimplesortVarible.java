
package problemsolving;

import java.util.Scanner;


public class SimplesortVarible {
    public static void main(String[] args) {
        int arr[] = new int[3];
        int Sarr[] = new int[3];
        int temp;
        Scanner in = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            
                arr[i] = in.nextInt();
                Sarr[i] = arr[i];
            
        }
        for (int i = 0; i < arr.length; i++) {
            
                for (int j = 0; j < arr.length; j++) {
                        
                    if (arr[i] < arr[j]) {
                                temp = arr[j];
                                arr[j] = arr[i];
                                arr[i] = temp;

                        }
                }
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            
                System.out.println(arr[i]);
                
        }
        System.out.println("");
        
         for (int i = 0; i < arr.length; i++) {
            
                System.out.println(Sarr[i]);
                
        }
        
    }
}
