

import java.util.Scanner;


public class cf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[][] = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][0] = 1;
                arr[0][j] = 1;

            }
        }
        
        
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
                   
            }
            
        }
        
        System.out.println(arr[size-1][size-1]);
    }
    
}
