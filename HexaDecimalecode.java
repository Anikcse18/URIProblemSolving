
package Adhoc;

import java.util.Scanner;


public class HexaDecimalecode {
    
   
   
    public static void main(String[] args) {
        stack st = new stack();
        Scanner in = new Scanner(System.in);
        int input,temp1,temp2;
        input = in.nextInt();
        temp1 = input;
        int f=0;
        do {
            f++;
            temp2 = temp1%16;
            temp1 = temp1/16;
            
            st.push(temp2);
           
        } while (temp1!=0);
        
 
        int peek;
        
        for (int i = 0; i<f; i++) {
         
            peek = st.peek();
            
            switch (peek) {
                
                case 10:
                    st.pop();
                    System.out.print("A");
                    break;
                    
                case 11:
                    st.pop();
                    System.out.print("B");
                    break;
                    
                case 12:
                    st.pop();
                    System.out.print("C");
                    break;
                    
                case 13:  
                    st.pop();
                    System.out.print("D");
                    break;
                    
                case 14:
                    st.pop();
                    System.out.print("E");
                    break;
                    
                case 15:
                    st.pop();
                    System.out.print("F");
                    break;
                    
                default:
                    System.out.print(st.pop());
                    break;
                    
            }
            
        }
        System.out.println("");
        
        
        
        
    }
   
   

}


//stack implemettation
class Node{
       int data;
       Node next;
    
   }
   
  class stack{
       
       Node Top;
       public void push(int data){
           
           Node newNode = new Node();
            newNode.data=data;
            newNode.next = Top;
            Top = newNode;
       
       }
       
       public int pop(){
           Node n = Top;
           Top = Top.next;
           
           return n.data;
      
       }
       
       public int peek(){
           
           return Top.data;

       }
 
   }

 