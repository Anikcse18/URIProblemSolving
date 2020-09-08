
package problemsolving;




public class Secquenceii {
     public static void main(String[] args) {
        float temp=0,i=1,Answer;
        
        
        float temp2=0,j=1;
        
         do {
             
             
             temp = i;
             i=i+2;

            
             temp2 = j;
             j = (j+j);
            
             Answer = i/j;
             
             
             
             
         } while (i<=39);
         System.out.printf("%.2f",Answer);
   
    }
}
