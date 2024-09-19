package com.DateTime;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println("Time : " + now);

		LocalTime customeTime = LocalTime.of(2, 30);
		System.out.println("Custom Time : " + customeTime);

		LocalTime parsedTime = LocalTime.parse("15:30:45");
		System.out.println("Parsed Time : " + parsedTime);
		
		LocalTime pastTime = now.minusMinutes(20);
		System.out.println("Past Time : " + pastTime );
	}
}
