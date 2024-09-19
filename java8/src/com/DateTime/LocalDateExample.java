package com.DateTime;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);

		LocalDate customeDate = LocalDate.of(2002, 4, 1);
		System.out.println("Custome Date : " + customeDate);

		LocalDate yestarday = today.minusDays(1);
		System.out.println("Yestarday Date : " + yestarday);

		LocalDate past = today.minusYears(10);
		System.out.println("Past : " + past);
	}
}
