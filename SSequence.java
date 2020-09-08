
package problemsolving;




public class SSequence {
    public static void main(String[] args) {
        
        
        
        float X=0;
        for (int i = 1; i <=100; i++) {
            
            X += 1/(float)i;
            
        }
        System.out.printf("%.2f\n",X);
    }
}
