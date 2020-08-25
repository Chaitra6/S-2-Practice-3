import java.time.LocalDate; 


public class Year_Month_Day {
	public static void main(String args[]) {
		LocalDate date = LocalDate.now(); 
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		
	}

}
