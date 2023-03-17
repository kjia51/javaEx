package com.jungang;




public class PrintEx {

	public static void main(String[] args) {
		String name = "자바라";
		int age = 20;
		String id = "java";
		double height = 1.6225214791548744511131;
		int money = 10000000;
		
		System.out.printf("%,d\n",money);
		
		//
		// 형식 문자열
		// 지정한 형식 문자열에 맞게 값 또는 변수를 대입 할 수 있다.
		// %s 문자열, %d 정수, %f : 실수
		//글자는 왼쪽에 붙어서 출력/ 숫자는 오른쪽에 붙어서 
		// 자릿수를 정해줄 때
		// %5d : 왼쪽 빈자리를 공백
		// %-5d : 오른쪽 빈자리를 공백
		// %05d : 빈자리를 0으로 채워줄때
		System.out.printf("이름: %s 나이 : %d 아이디: %s 키 : %010.2f \n",  name, age, id, height);
		System.out.printf("이름: %5s 나이 : %d 아이디: %s 키 : %030.20f\n",  name, age, id, height);
		System.out.printf("이름: %5s 나이 : %05d 아이디: %s 키 : %f\n",  name, age, id, height);
		// %10.2f 정수는 10자리까지 소수는 2자리까지
		
		
	
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1+var2+var3+(int)Double.parseDouble(var4));
		System.out.println(result);
	}

}
