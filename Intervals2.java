
package problem.solving;

import java.util.Scanner;


public class Intervals2 {
    public static void main(String[] args) {
        int X,j=0,k=0;
        Scanner in=new Scanner(System.in);
        X=in.nextInt();
        int arr[]=new int[X];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
            if (arr[i]>=1 &&  arr[i]<=20) {
                j++;
            }
            else{
                k++;
            }
        }
        System.out.println(j+" in");
        System.out.println(k+" out");
            
        }
      
    }

