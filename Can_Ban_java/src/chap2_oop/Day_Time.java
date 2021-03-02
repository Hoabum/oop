package chap2_oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Day_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate a = LocalDate.now();
		LocalDateTime b= LocalDateTime.now();
		LocalTime c= LocalTime.now();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
