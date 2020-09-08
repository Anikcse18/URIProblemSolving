package problemsolving;


import java.util.Scanner;

//PUM1142
//PUM1142
public class PUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X,counter=0;
        X = in.nextInt();
        
        
            
                     for (int j = 1; j<=(X*4); j++) {
                         counter++;
                         
                         if (counter<=3) {
                             System.out.print(j+" ");
                         }
                         else if(counter==4){
                             
                             System.out.print("PUM\n");
                             counter=0;
                         }
                         
                
            
        }
                
        
        
    }
}
