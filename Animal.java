
package problem.solving;

import java.util.Scanner;


public class Animal {
    public static void main(String[] args) {
       String X,Y,Z;
       Scanner in = new Scanner(System.in);
       X = in.nextLine();
       Y = in.nextLine();
       Z = in.nextLine();
      
        if (X.equals("vertebrado") && Y.equals("ave")&& Z.equals("carnivoro")) {
            
            System.out.println("aguia");
            
        }
        else if (X.equals("vertebrado") && Y.equals("ave")&& Z.equals("onivoro")) {
            
            System.out.println("pomba");
            
        }
        
        
        else if(X.equals("vertebrado") && Y.equals("mamifero")&& Z.equals("onivoro")){
        
            System.out.println("homem");
        
        }
        
        else if(X.equals("vertebrado") && Y.equals("mamifero")&& Z.equals("herbivoro")){
        
            System.out.println("vaca");
        
        }
        
        
         else if(X.equals("vertebrado") && Y.equals("mamifero")&& Z.equals("herbivoro")){
        
            System.out.println("vaca");
        
        }
        
        
        //2nd Part
        
        
         else if(X.equals("invertebrado") && Y.equals("inseto")&& Z.equals("hematofago")){
        
            System.out.println("pulga");
        
        }
        
         else if(X.equals("invertebrado") && Y.equals("inseto")&& Z.equals("herbivoro")){
        
            System.out.println("lagarta");
        
        }
        else if(X.equals("invertebrado") && Y.equals("anelideo")&& Z.equals("hematofago")){
        
            System.out.println("sanguessuga");
        
        }
        
         else if(X.equals("invertebrado") && Y.equals("anelideo")&& Z.equals("onivoro")){
        
            System.out.println("minhoca");
        
        }
        
}
}