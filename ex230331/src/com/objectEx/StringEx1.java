package com.objectEx;

public class StringEx1 {
	public static void main(String[] args) {
		// 7번째 인덱스 문자가 1,3이면 2,4면 여자
		String ssn = "123456-1234567";

			if (ssn.charAt(7)== '1' | ssn.charAt(7)== '3') {
				System.out.println("남자");
			} else if (ssn.charAt(7)== '2' | ssn.charAt(7)== '4') {
				System.out.println("여자");
			} else {
				System.out.println("숫자를 다시 입력하세요");
			}
			
		
	}
}
