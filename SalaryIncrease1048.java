
package problem.solving;

import java.util.Scanner;


public class SalaryIncrease1048 {
    public static void main(String[] args) {
        float X,Tem,M;
        Scanner in = new Scanner (System.in);
        X = in.nextFloat();
        if (X>=0 && X<=400.00) {
            Tem = (float) (X*0.15);
            M = (X+Tem);
            
            
            System.out.printf("Novo salario: "+"%.2f", M);
            System.out.println("");
            System.out.printf("Reajuste ganho: "+"%.2f", Tem);
            System.out.println("");
            System.out.println("Em percentual: 15 %");
            
            
        }
 
         if (X>=400.01 && X<=800.00) {
            Tem = (float) (X*0.12);
            M = (X+Tem);
            
            
            System.out.printf("Novo salario: "+"%.2f", M);
            System.out.println("");
            System.out.printf("Reajuste ganho: "+"%.2f", Tem);
            System.out.println("");
            System.out.println("Em percentual: 12 %");
            
            
        }
         
         if (X>=800.01 && X<=1200.00) {
            Tem = (float) (X*0.1);
            M = (X+Tem);
            
            
            System.out.printf("Novo salario: "+"%.2f", M);
            System.out.println("");
            System.out.printf("Reajuste ganho: "+"%.2f", Tem);
            System.out.println("");
            System.out.println("Em percentual: 10 %");
            
            
        }
         
            if (X>=1200.01 && X<=2000.00) {
            Tem = (float) (X*0.07);
            M = (X+Tem);
            
            
            System.out.printf("Novo salario: "+"%.2f", M);
            System.out.println("");
            System.out.printf("Reajuste ganho: "+"%.2f", Tem);
            System.out.println("");
            System.out.println("Em percentual: 7 %");
            
            
        }
         
         
            if (X>2000.00) {
                
                Tem = (float) (X*0.04);
                M = (X+Tem);


                System.out.printf("Novo salario: "+"%.2f", M);
                System.out.println("");
                System.out.printf("Reajuste ganho: "+"%.2f", Tem);
                System.out.println("");
                System.out.println("Em percentual: 4 %");

            
        }
         
    }
}
