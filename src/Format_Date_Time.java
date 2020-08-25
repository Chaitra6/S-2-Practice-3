import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 


public class Format_Date_Time {
	public static void main(String args[]) {
//		LocalDateTime now = LocalDateTime.now(); 
		LocalDateTime dt = LocalDateTime.of(2020,11,03,05,21,30);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");   
		System.out.println(dtf.format(dt));  
	}

}
