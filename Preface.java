
package problemsolving;


import java.util.Scanner;

public class Preface {
    public static void main(String[] args) {
        int a,b,temp,temp1,s=0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        
         if (a<0 && b>0) {
             int i =0;
            
             while(s>a){
                  i--;
                 s = b*i;
                

             }
             
             temp = a-(s);
             
             System.out.println(i+" "+temp);
             
        }
         else if(a<0 && b<0){
              
             int i =0;
            
             while(s>a){
                  i++;
                 s = b*i;
                

             }
             
             temp = a-(s);
             
             System.out.println(i+" "+temp);
         
         
         }
         
         
         else{
        
             
                temp1 = a/b;
                
                temp = a%b;
                System.out.println(temp1+" "+temp);

         }
       
    }
}
