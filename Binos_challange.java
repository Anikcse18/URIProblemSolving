
package problemsolving;

import java.util.Scanner;

public class Binos_challange {
    public static void main(String[] args) {
        int size_ofArray ;
        Scanner in = new Scanner(System.in);
        size_ofArray = in.nextInt();
        int my_num[] = {2,3,4,5};
        int count = 0;
        
        int num[] = new int[size_ofArray];
        for (int i = 0; i < size_ofArray; i++) {
            num[i] = in.nextInt();
        }
        
        for (int i = 0; i < my_num.length; i++) {
            
            for (int j = 0; j < num.length; j++) {

                   if (num[j]%my_num[i]==0) {
                        count++;
                        
                    }
                
                
            }
            System.out.println(count+" Multiplo(s) de "+my_num[i]);
            count=0;
            
        }
    }
}
