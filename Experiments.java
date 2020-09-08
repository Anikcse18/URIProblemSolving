
package problemsolving;

import java.util.Scanner;




public class Experiments {
    public static void main(String[] args) {
       int N,Tol=0,Co=0,Ra=0,Sa=0,K;
       String Nm;
       Scanner in =new Scanner(System.in);
        N = in.nextInt();
        
       int arr[] = new int[N];
        String[] arrnm = new String[N];
        //input Loop
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = in.nextInt();
            arrnm[i] =in.nextLine();
            
            Tol +=arr[i];
            if (arrnm.equals("C")) {
                System.out.println("Anik");
            }
        }
        
        
         System.out.println("Total: "+Tol+" Cobaias");
         System.out.println("Total de coelhos: "+Co);
         System.out.println("Total de ratos: "+Ra);
         System.out.println("Total de sapos: "+Sa);
    }
}
