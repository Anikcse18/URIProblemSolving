
package problem.solving;
import static java.lang.Math.abs;
import java.util.Scanner;

public class AgeCalculator {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Pastyear,pastmonth,pastday,tempY,tempM,tempD;
        
        int Presentyear,Presentmonth,Presentday;
        
        
        System.out.print("Enter Your Present Date(YY-MM-DD): ");
            
            Presentyear = in.nextInt();
            Presentmonth = in.nextInt();
            Presentday = in.nextInt();
        
        System.out.print("Enter Your Past Date(YY-MM-DD): ");
        
            Pastyear = in.nextInt();
            pastmonth = in.nextInt();
            pastday = in.nextInt();
            
        
            
            if (Presentmonth>=pastmonth && Presentday>=pastday ) {
                    
                tempY = Presentyear-Pastyear;
                tempM = Presentmonth-pastmonth;
                tempD = Presentday-pastday;
                System.out.print("Your Age is: ");
                
                    System.out.println(tempY+" Year "+tempM+" Month "+tempD+" Day");
                
        }
            else{
                tempD = (Presentday+30)-pastday;
                
                
                tempM = (Presentmonth+12) - (pastmonth+1);
                
                tempY = Presentyear-(Pastyear+1);
            
                System.out.print("Your Age is: ");
                
                    System.out.println(tempY+" Year "+tempM+" Month "+tempD+" Day");
            
            }
            
            int hr,min,sec,temp;
            
            
            tempY = (tempY+tempD+(tempM*30))*(365*24*3600);
            
                hr = tempY/3600;
                temp = tempY%3600;
                min = temp/60;
                sec = temp%60;
                
                System.out.print("Your Age Is: ");
                
                System.out.println(abs(hr)+" Hour "+abs(min)+" Minute "+abs(sec)+" sec");
            
            
            
            
            
        
    }
    
}
