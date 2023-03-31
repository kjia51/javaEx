package com.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// Date 클래스에서 날짜 시간을 어떻게 처리하는지 
		// 기본 생성자를 통해서 Date 객체를 생성하면
		// 현재 시간과 날짜에 대한 정보를 가지고 객체를 생성한다
		Date now = new Date();
		System.out.println(now.toString());
		
		//1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위
		Date when = new Date(1);
		System.out.println(when);
		
		when = new Date(1000);
		System.out.println(when);
		
		System.out.println("getTime()"+now.getTime());
		System.out.println("getYear()"+now.getYear()+1900);
		System.out.println("getMonth()"+now.getMonth()+1);
		System.out.println("getDate()"+now.getDate());
		System.out.println("getDay()"+now.getDay());
		System.out.println("getHours()"+now.getHours());
		System.out.println("getMinutes()"+now.getMinutes());
		System.out.println("getSeconds()"+now.getSeconds());
		
		/**
		 * y년도
		 * M월
		 * d일
		 * h시간
		 * m분
		 * s초
		 * E요일
		 * a:ap/pm
		 * 
		 * 원하는 형식으로 날짜 출력
		 */
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss:SSSS초 (E) a");
		String formataDate = sdf.format(now);
		System.out.println(formataDate);
		
		
		
	}
}
