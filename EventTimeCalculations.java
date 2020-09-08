
package problem.solving;

import java.util.Scanner;


public class EventTimeCalculations {
    public static void main(String[] args) {
        int A,M,N,B,X,Y,c,e,g,f=0,s,i;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        M = in.nextInt();
        N = in.nextInt();
        B = in.nextInt();
        X = in.nextInt();
        Y = in.nextInt();
        
        if (A==B && M==X && N==Y) {
            System.out.println("24 hora(s)");
            System.out.println("0 minuto(s)");
            System.out.println("0 segundo(s)");
            
        }
        
        //1st codition
       else if (A>B) {
           
            c = (24-A)+B;
            
            if (M>X) {
                e = M-X; 
                    g = ((c*60)-e)/60;
                    f = ((c*60)-e)%60;
                    
                    if (N>Y) {
                        
                    s = N-Y;
                    i = (60 - s);
                    f = ((f*60)-i)/60;
                    
                        System.out.println(c+" hora(s)");
                        System.out.println(f+" minuto(s)");
                        System.out.println(i+" segundo(s)");
                    
                }
                    
                    else {
                        
                         s = Y-N;
                         System.out.println(c+" hora(s)");
                         System.out.println(f+" minuto(s)");
                         System.out.println(s+" segundo(s)");
                        
                    }
            }
            
            
            else if(M<X){
                
                e = X-M;
               
                  if (N>Y) { 
                      
                    s = N-Y;
                    i = (60 - s);
                    e = ((e*60)-i)/60;
                        System.out.println(c+" hora(s)");
                        System.out.println(e+" minuto(s)");
                        System.out.println(i+" segundo(s)");
                    
                }
                    
                  else {
                        
                         s = Y-N;
                         System.out.println(c+" hora(s)");
                         System.out.println(e+" minuto(s)");
                         System.out.println(s+" segundo(s)");
                        
                    }
                
                
                
            
            }
            
            
        }
       
       
       //2nd condition
       else if (A<B) {
           c = B-A;
           
             if (M>X) {
                 
                e = M-X; 
                    g = ((c*60)-e)/60;
                    f = ((c*60)-e)%60;
                    
                    if (N>Y) {
                        
                    s = N-Y;
                    i = (60 - s);
                    f = ((f*60)-i)/60;
                    c = ((c*60)-f)/60;
                    
                        System.out.println(c+" hora(s)");
                        System.out.println(f+" minuto(s)");
                        System.out.println(i+" segundo(s)");
                    
                }
                    
                    else {
                        
                         s = Y-N;
                         c = ((c*60)-s)/60;
                         System.out.println(c+" hora(s)");
                         System.out.println(f+" minuto(s)");
                         System.out.println(s+" segundo(s)");
                        
                    }
            }
            
            
            else if(M<X){
                
                e = X-M;
               
                  if (N>Y) { 
                      
                    s = N-Y;
                    i = (60 - s);
                    e = ((e*60)-i)/60;
                        System.out.println(c+" hora(s)");
                        System.out.println(e+" minuto(s)");
                        System.out.println(i+" segundo(s)");
                    
                }
                    
                  else {
                        
                         s = Y-N;
                        
                         System.out.println(c+" hora(s)");
                         System.out.println(e+" minuto(s)");
                         System.out.println(s+" segundo(s)");
                        
                    }
                
                
                
            
            }
           
        }
        
       else if(A==B && M==X && N>Y){
           
           c = 23;
           s = N-Y;
           i = (60 - s);
           e = 59;
           
           System.out.println(c+" hora(s)");
           System.out.println(e+" minuto(s)");
           System.out.println(i+" segundo(s)");
           
           
       
       }
         else if(A==B && M==X && N<Y){
           
          
           s = Y-N;
           
           
           System.out.println("0 hora(s)");
           System.out.println("0 minuto(s)");
           System.out.println(s +" segundo(s)");
           
           
       
       }
        
         else if (A>B && M==X && N==Y) {
            
             c = (24-A)+B;
              System.out.println(c+" hora(s)");
              System.out.println("0 minuto(s)");
              System.out.println("0 segundo(s)");
        }
         
         
        else if (A<B && M==X && N==Y) {
            
             c = B-A;
             
              System.out.println(c+" hora(s)");
              System.out.println("0 minuto(s)");
              System.out.println("0 segundo(s)");
        }
        
        
        else if (A==B && M>X && N==Y) {
             e = M-X;
             c = (24-A)+B;
             f = (60-e);
             c = ((c*60)-e)/60;
             System.out.println(c+" hora(s)");
             System.out.println(f+" minuto(s)");
             System.out.println("0 segundo(s)");
           
        }
        
        
         else if (A==B && M>X && N==Y) {
             
             e = M-X;
             c = (24-A)+B;
             f = (60-e);
             c = ((c*60)-e)/60;
             System.out.println(c+" hora(s)");
             System.out.println(f+" minuto(s)");
             System.out.println("0 segundo(s)");
           
        }
        
         else if (A==B && M<X && N==Y) {
             
             
             e = X-M;
             c = (24-A)+B;
           
             System.out.println("24 hora(s)");
             System.out.println(e+" minuto(s)");
             System.out.println("0 segundo(s)");
           
        }
         
         
       //my condition
       
        else if (A==B) {
           
            c = (24-A)+B;
            
            if (M>X) {
                e = M-X; 
                    g = ((c*60)-e)/60;
                    f = ((c*60)-e)%60;
                    
                    if (N>Y) {
                        
                    s = N-Y;
                    i = (60 - s);
                    f = ((f*60)-i)/60;
                    
                        System.out.println(c+" hora(s)");
                        System.out.println(f+" minuto(s)");
                        System.out.println(i+" segundo(s)");
                    
                }
                    
                    else {
                        
                         s = Y-N;
                         System.out.println(c+" hora(s)");
                         System.out.println(f+" minuto(s)");
                         System.out.println(s+" segundo(s)");
                        
                    }
            }
            
            
            else if(M<X){
                
                e = X-M;
               
                  if (N>Y) { 
                      
                    s = N-Y;
                    i = (60 - s);
                    e = ((e*60)-i)/60;
                        System.out.println(c+" hora(s)");
                        System.out.println(e+" minuto(s)");
                        System.out.println(i+" segundo(s)");
                    
                }
                    
                  else {
                        
                         s = Y-N;
                         System.out.println(c+" hora(s)");
                         System.out.println(e+" minuto(s)");
                         System.out.println(s+" segundo(s)");
                        
                    }
                
                
                
            
            }
            
            
        }
        
        
        
    }
}
