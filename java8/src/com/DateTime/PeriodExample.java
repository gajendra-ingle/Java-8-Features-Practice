package com.DateTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {

//		LocalDate today = LocalDate.now();
//		LocalDate past = LocalDate.of(2024, 7, 29);

		LocalDate today = LocalDate.of(2019, 6, 11);
		LocalDate past = LocalDate.of(2024, 8, 24);

		Period peroid = Period.between(today, past);

		System.out.println("Difference Of two Date : " + peroid);

		System.out.println("Years : " + peroid.getYears());
		System.out.println("Months : " + peroid.getMonths());
		System.out.println("Days : " + peroid.getDays());
	}
}
