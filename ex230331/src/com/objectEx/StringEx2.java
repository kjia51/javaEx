package com.objectEx;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		// 포함하고 있는 문자열의 시작인덱스를 반환
		// 불포함시 -1 반환
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("c"));
		System.out.println(str.substring(str.indexOf("프로")));
		
		if(str.indexOf("자바")>=0) {
			System.out.println("자바 관련 책");
		} else {
			System.out.println("자바 관련 없음");
		}
		
		// 문자의 길이를 반환합니다
		// id의 길이는 5자 이상이어야 합니다
		String id = "id";
		 if(id.length()<5) {
			 System.out.println("아이디 5자 이상 14자 이하");
		 }
		 String ssn = "12345612345678";
		 if(ssn.length()!=13) {
			 System.out.println("주민번호를 정확히 입력해주세요");
		 }
		 
		 
		 System.out.println(ssn.substring(0, 6));
		 System.out.println(ssn.substring(6, 14));
		 
		 str="자바는 객체지향 언어입니다. 자바를 자바봅시다";
		 System.out.println(str.replace("자바", "java"));

		 // 대소문자 교체
		 str = "Java Program Language";
		 System.out.println(str.toUpperCase());
		 System.out.println(str.toLowerCase());
		 
		 // 대소문자를 구분하지 않고 비교
		 str="q";
		 System.out.println(str.equalsIgnoreCase("Q"));
		 System.out.println(str.equalsIgnoreCase("q"));
		 
		 // 공백을 제거해주기
		 id="    i   d";
		 System.out.println(id.trim());
		 
		 //기본타입을 문자로 변경
		 System.out.println(String.valueOf(10));
		 System.out.println(String.valueOf(10.0));
		 System.out.println(String.valueOf(true));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
