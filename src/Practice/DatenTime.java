package Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatenTime {
	

	public static void main(String[] args) {
		LocalDate LD = LocalDate.now();
		System.out.println(LD);

		LocalTime LT = LocalTime.now();
		System.out.println(LT);

		LocalDateTime LDT = LocalDateTime.now();
		System.out.println(LDT);
		
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEEE, MMM dd YYYY, hh:mm:ss a");
		
		String DTFormat = LDT.format(DTF);
		System.out.println(DTFormat);
	}

}