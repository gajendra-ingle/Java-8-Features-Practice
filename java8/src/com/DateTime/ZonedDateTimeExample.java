package com.DateTime;

import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		// UTC :- Universal Time Coordinated
		// 24 Zones

		ZonedDateTime indiaTime = ZonedDateTime.now();
		System.out.println("India Zoned Date & Time : " + indiaTime);

		//ZonedDateTime newYourkTime = ZonedDateTime.now(ZonedId.of("America/New-York"));
		//System.out.println("NewYork Time : " + newYourkTime);
		
	
	}

}
