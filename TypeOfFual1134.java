package problemsolving;


import java.util.Scanner;


public class TypeOfFual1134 {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        int X,Alco=0,Gas = 0,Die = 0;
     
      
       
        while(true){
        
         X = in.nextInt();
        
        
            
            if (X==1) {
                Alco++;
            }
            
            else if (X==2) {
                Gas++;
                
            }
            
            else if(X==3){
                Die++;
                
            }
            else if (X==4){
            
                break;
            }

        
       
        
        
        
        }
         System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+Alco);
        System.out.println("Gasolina: "+Gas);
        System.out.println("Diesel: "+Die);

        
    }
}
