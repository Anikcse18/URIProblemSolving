
package offline_Code;

import java.util.Scanner;


public class StarTarek {
    public static void main(String[] args) {
        int size,temp = 0,temp2;
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        
        int arr[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            
            arr[i]=in.nextInt();
            temp += arr[i];
            
        }
        int count=0;
        
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i]%2!=0) {
                
                count++;
            }
            else{
                count++;
                temp2 = (count*2);
                
                break;
            }
            
        }
        System.out.println((count+1)+" "+(temp-(count+1)));
    }
    
}
