package com.jungang;

import java.util.Scanner;

public class BmiEx1 {
	public static void main(String[] args) {
		int iValue = 12345;
		char cValue = (char)iValue;
		System.out.println(cValue);
		System.out.println(iValue);
		
		int var1 = Integer.parseInt("12345");
		double var2 = Double.parseDouble("12345");
		System.out.println(var1);
		System.out.println(var2);
		
		String var3 = "3.9";
		int var4 = (int)(Double.parseDouble(var3));
		System.out.println(var4);
		System.out.printf("var값은 %d입니다\n", var4);

		System.out.printf("이름 %s 나이 %06d 키 %.2f\n", "홍길동", 20, 160.00);
		System.out.printf("이름 %s 나이 %6d 키 %.2f\n", "홍길동", 20, 160.00);
		System.out.printf("이름 %s 나이 %-6d 키 %.2f\n", "홍길동", 20, 160.00);
		System.out.printf("이름 %s 나이 %-6d 키 %1.2f\n", "홍길동", 20, 160.00);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("키를 입력하세요");
//		double height = sc.nextDouble();
//		System.out.println("몸무게를 입력하세요");
//		int weight = sc.nextInt();
//		double result = weight/(height*height);
//		System.out.printf("당신의 bmi는 %f입니다\n",result);
//		System.out.printf("당신의 bmi는 %.2f입니다", 19.3597542);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째수");
		String strNum1 = scanner.nextLine();
		System.out.println("두번째수");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result2 = num1+num2;
		System.out.printf("덧셈결과는 %d 입니다", result2);
		scanner.close();
	}
}
