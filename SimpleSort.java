package problemsolving;

import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        int Marr[] = new int[3];
        int Tarr[] =  new int[3];
        
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            
           Marr[i] = in.nextInt();
           
           
           Tarr[i] = Marr[i];
        }
        int tmp;
        for (int i = 1; i < 3; i++) {
            
            
            if (Tarr[i] < Tarr[0]) {
              
                 tmp = Tarr[0];
                
                 Tarr[0]= Tarr[i];
                 
                 Tarr[i] = tmp;
            }
            
           
            
           
        }
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println(Tarr[i]+" ");
          
           
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println(Marr[i]+" ");
        }
        
    }
}
