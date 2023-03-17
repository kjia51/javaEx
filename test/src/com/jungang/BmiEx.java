package com.jungang;

public class BmiEx {

	public static void main(String[] args) {
		/**
		 * Bmi 구하기
		 */
//	타입(int/double) 변수이름;
		double height=1.6;
		int weight=50;
		double bmi;
		bmi = weight/(height*height);
		System.out.println(bmi);
	}

}
