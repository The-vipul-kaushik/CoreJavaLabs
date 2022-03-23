package Lab3;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		Date d = null;
		
		s = sc.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Ex9.DateDuration(d);
	}

	static void DateDuration(Date d) {
		LocalDate ld = LocalDate.now();
		LocalDate date = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		
		
	}

}
