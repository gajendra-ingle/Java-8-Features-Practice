package com.DateTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime today = LocalDateTime.now();
		System.out.println("Today : " + today);

		LocalDateTime customDateTime = LocalDateTime.of(2002, 12, 4, 2, 45);
		System.out.println("Custom Date Time : " + customDateTime);

		LocalDateTime parseDateTime = LocalDateTime.parse("2024-08-29T02:45");
		System.out.println("Parsed Date Time : " + parseDateTime);
	}
}
