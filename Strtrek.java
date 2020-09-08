
package offline_Code;

import java.util.Scanner;
import java.util.Stack;

public class Strtrek {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(),totalSheep=0,number_sheep=0;
        int arr[] = new int[size];
        int room = 1;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();  
            totalSheep += arr[i]; 
        }
        int first;
        if (arr[0]%2==0) {
            
            number_sheep++;
            System.out.println(room+" "+(totalSheep-number_sheep));
                   
        }else{
            number_sheep = 1;
            
            st.add(arr[0]-1);
            
             for (int i = 1; i < arr.length; i++) {
                 
                    if (arr[i]%2!=0) {

                        st.add(arr[i]-1); 
                        number_sheep++;

                        room++;

                    }
                    
                    else{
                        
                        number_sheep++;
                        
                        
                        room++;
                       
                        for (int j = room-2; j >= 0; j--) {
                             
                            if (st.peek()==0) {
                                    break;
                                }
                            else{
                                    st.pop();
                                    number_sheep++;

                                }
                        }
                        
                       
                        break;



                    }
             
          
        }
             
        System.out.println(room+" "+(totalSheep-number_sheep));
        }
        
       
        
    }
    
}
