import java.time.*;
public class ZoneID {
	public static void main(String args[]) {
		ZoneId zoneid = ZoneId.of("America/Chicago");
		LocalTime time = LocalTime.now(zoneid);  
		System.out.println(time);
	}
}
