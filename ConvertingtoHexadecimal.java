
package Adhoc;

import java.util.Scanner;


public class ConvertingtoHexadecimal {
    
    public static class Node{
        int data;
        Node next;
    
    }
    
    
    public  static class stack{
        Node top;
        
       public void push(int data){    
           Node newNode = new Node();
           
            newNode.data = data;
            
            newNode.next = top;
            top = newNode;
       } 
       
        public int poop(){
            
           Node n = top;
           top = top.next;
           
           return n.data;
           
       
       }
        
        public int peek(){
        
        return top.data;
        
        }
         public static void main(String[] args) {  
             
            stack input = new stack();
            
            int X,temp1,temp2;
           
            Scanner in = new Scanner(System.in);
            X = in.nextInt();
            temp1 = X;
          
            int f = 0;
             
            do {
                
                 temp2 = temp1%16;
                 temp1 = temp1/16;
                 
                 f++;
                input.push(temp2);
             
            } while (temp1!= 0);

            
             for (int i = 0; i < f; i++) {
                 int x = input.peek();
                
                
                if (x==10) {
                    
                input.poop();
                System.out.print("A");
                
            }
                
            else if (x==11) {
                
                input.poop();
                System.out.print("B");
                
            }
            
            else if(x==12){
                
                input.poop();
                System.out.print("C");
            }
            
            else if (x==13) {
                
                input.poop();
                System.out.print("D");
            }
            
            else if (x==14) {
                
                input.poop();
                System.out.print("E");
            }
            
            else if (x==15) {
                
                input.poop();
                System.out.print("F");
            }
            
            else{
               
                System.out.print(input.poop());
            
            }
                 
                
             }
          System.out.println("");
        }
       
     
}
    
    
}
 