
package problemsolving;

public class Array {
    public static void main(String[] args) {
        
        
        
        
        int arr[][] = new int[5][5];
        int ki = 0, pj =4;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               
                
                if (i==ki || j==ki || i==pj || j==pj) {
                   
                    arr[i][j]=1;
                    System.out.print(arr[i][j]+" ");
                    
                    
                    
                }
                else{
                    
                    
                if (i==ki || j==ki || i==pj || j==pj) {
                   
                    arr[i][j]=2;
                    System.out.print(arr[i][j]+" ");
                    
                    
                    
                    
                }
                
                else{
                    
                     arr[i][j]=3;
                    System.out.print(arr[i][j]+" ");
                
                }
                
                
                }
             
               
                  ki++;
            }
               System.out.println("");
                pj--; 
        }
        
         
        
        
        
    }
}
