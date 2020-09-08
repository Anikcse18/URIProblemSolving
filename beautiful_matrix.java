
import static java.lang.Math.abs;
import java.util.Scanner;


public class beautiful_matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat [] [] = new int[5][5];
        int tem ;
        int put,col=0 ,row=0;
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                put = in.nextInt();
                if (put==1) {
                    col = j;
                    row = i;

                }
                        
                mat[i][j] = put;
            }
            
        }
        tem = abs(row-2) + abs(col-2);
        System.out.println(tem);
        
    }
    
}
