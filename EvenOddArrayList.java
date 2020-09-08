
package Adhoc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class EvenOddArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        int size,number;
        size = in.nextInt();
        
        
        for (int i = 0; i < size; i++) {
            number = in.nextInt();
            
            if (number%2==0) {
                even.add(number);
            }else{
            
                odd.add(number);
            
            }
            
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        
        for (int i : even) {
            System.out.println(i);
            
        }

        for (int j : odd) {
            System.out.println(j);
            
        }
    }
    
}
//4
//32
//34
//543
//3456
//654
//567
//87
//6789
//98