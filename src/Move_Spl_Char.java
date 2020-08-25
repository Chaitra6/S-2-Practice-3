import java.util.Scanner;
public class Move_Spl_Char {
	public static void main(String args[]) 
    { 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String regx = "[a-zA-Z0-9\\s+]";
		
		String res1 = "", res2 = ""; 
        for (int i = 0; i < str.length(); i++) { 
          
            char c = str.charAt(i); 
            if (String.valueOf(c).matches(regx))  
               res1 = res1 + c; 
            else
               res2 = res2 + c; 
        } 
       System.out.println(res1 + res2);       
        
    } 
	

}
