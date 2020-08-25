
import java.util.regex.*; 
import java.util.Scanner;
public class IPaddressMatch {
	public static void main(String args[]) 
    { 
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		
	    String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";  

        String regex 
           = zeroTo255 + "\\."
             + zeroTo255 + "\\."
             + zeroTo255 + "\\."
             + zeroTo255; 
        
        Pattern p = Pattern.compile(regex); 
        
        if(ip == null) {
        	System.out.println("Incorrect");
        }
        
        
        Matcher m = p.matcher(ip); 
        
       
        if(m.matches()) {
        	System.out.println("Correct");
        }
        
        else {
        	System.out.println("Incorrect");
        }
    } 

}
