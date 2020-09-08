package problemsolving;


import java.util.Scanner;

//SquareAndQubic..
//SquareAndQubic...
public class SquareAndQubic {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int X,square,qubic;
        X = in.nextInt();
        
        for (int i = 1; i<=X; i++) {
            square = i*i;
            qubic = i*i*i;
            System.out.println(i+" "+square+" "+qubic);
            
        }
    }
}
