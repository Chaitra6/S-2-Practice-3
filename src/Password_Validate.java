import java.util.Scanner;
import java.util.regex.*; 
public class Password_Validate {
	public static void main(String args[]) 
    { 
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$"; 
		
		Pattern p = Pattern.compile(regex);
		
		  if (password == null) { 
	            System.out.println("A weak password, change it!"); 
	        } 
		
		  Matcher m = p.matcher(password); 
		  
		  if(m.matches()) {
			  System.out.println("Strong password!");
		  }
		  
		  else {
			  System.out.println("A weak password, change it!");
		  }
    } 
	

}
