
import java.util.Scanner;
import java.util.Stack;


public class sheep {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        
        int size,room = 1,sheepnumber=1;
        long totalsheep=0;
        size = in.nextInt();
        
        int arr[] = new int[size];
        
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=in.nextInt();
            
            totalsheep +=arr[i];
            
        }
        if (arr[0]%2==0) {
            
            
            System.out.println(room+" "+(totalsheep-sheepnumber));
           
            
            
        }
        else{
         arr[0] = arr[0]-1;
         st.push(arr[0]);
        
        
        int l=0;
        
        
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i]%2!=0) {
               
                st.push(arr[i]-1);
                room++;
                sheepnumber++;
                
                l++;
            }
            
            else{
                
                room++;
                sheepnumber++;  
                
                 while(l>=0){
        
                     if (st.peek()!=0) {
                         sheepnumber++;
                         st.pop();
                     }
                    
                  l--;
         
                 }
                break;
               
                
            }
           
           
        }
       
       
            
       System.out.println(room+" "+(totalsheep-sheepnumber));
       
        }
    }
    
}
