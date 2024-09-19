package com.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormaterExample {

	public static void main(String[] args) {

		// Print Date in your format
		LocalDate today = LocalDate.now();
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String format = today.format(myFormat);

		System.out.println("Custom Format : " + format);

		// Print custome format date to original format
		String date = "29/08/2024";
		DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate parse = LocalDate.parse(date, dateTimeFormater);
		System.out.println("Original Format : " + parse);
	}
}
