package java8features;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TestDate {

	public static void main(String[] args) {
		
String dateTime=null;
		
		int  hour=LocalTime.now().getHour();
		int min=LocalTime.now().getMinute();
		
		LocalDate lDate=LocalDate.now();
		DateTimeFormatter formater=DateTimeFormatter.ofPattern("d MMM uuuu");
		String date=lDate.format(formater);
		
		dateTime=date+" -Time: "+hour+":"+min;
		System.out.println(dateTime);
	
	
	}

}
