
package problemsolving;


public class Secquence1096 {
    public static void main(String[] args) {
       int Y=1;
    double Nm=0,X=1,N=3;
    
    do{
       
        for (double j=X; j<=N; j++) {
            System.out.println("I="+Nm+" "+"J="+j);
        
            
            if (j==N) {
                
                N+=0.2;
                
                X+=0.2;
                
                break;
            }
             
        }
        
        Nm+=0.2;
        Y++;
   
    }while(Y<=11);
   
        
    }
}
