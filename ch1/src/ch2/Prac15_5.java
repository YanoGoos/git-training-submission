package ch2;
//練習15-5

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prac15_5 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate futur = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(futur.format(fmt));

	}

}
