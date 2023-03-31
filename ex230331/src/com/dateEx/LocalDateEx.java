package com.dateEx;

import java.time.LocalDateTime;

public class LocalDateEx {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2021,5,25,22,30,25);
		System.out.println(now);
		System.out.println(when);
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
	
		
		System.out.println("===================");
		LocalDateTime plus = now.plusDays(1).plusMonths(1).plusYears(1);
		System.out.println(now);
		System.out.println(plus);
	}
	
	
}
