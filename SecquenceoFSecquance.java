
package problemsolving;

import java.util.Scanner;

public class SecquenceoFSecquance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        int sum;
        int count = 1;
        int cntrl = 0;
        while (in.hasNext()) {
            input = in.nextInt();
            sum = ((input * (input + 1)) / 2) + 1;
            System.out.print("Caso " + count + ": " + sum + " numero" + "\n");
            count++;

            if (input == 0) {
                System.out.println(input + "\n");
                continue;
            }

            for (int i = 0; i <= input; i++) {
                if (i == 0) {
                    System.out.print(0 + " ");
                }

                for (int j = 0; j < i; j++) {
                    cntrl++;

                    if (cntrl == sum - 1) {
                        System.out.print(i);
                        cntrl = 0;
                        
                    } else {

                        System.out.print(i + " ");

                    }
                }

            }
            System.out.println("\n");

        }

    }
}
