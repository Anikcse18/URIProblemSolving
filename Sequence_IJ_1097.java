
package problemsolving;


public class Sequence_IJ_1097 {
    public static void main(String[] args) {
      int j,Y=7, Nm=1,X=1,N=5;
        
        do {
            
            for ( j = Y; j>=N; j--) {
            
            System.out.println("I="+Nm+" "+"J="+j);
            
                if (j==N) {
                    
                    N=Y;
                    Y+=2;
                    
                    break;
                }
            
           }
            
             Nm+=2;
               X++;
            
        } while (X<=5);
   
        
    }
    }

