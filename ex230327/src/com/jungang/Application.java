package com.jungang;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] student = new Student[3];

		student[0] = new Student("홍길동", 20, 178.2, 70.0,1,"정보시스템공학과");
		student[1] = new Student("김말똥", 21, 187.3, 80.0,2,"경영학과");
		student[2] = new Student("강개순", 23, 167.0, 45.0,4,"정보통신공학과");

		for (int i=0; i<student.length;i++) {
			System.out.println(student[i].name);
			
		}
		

		

		
		Employee[] employee = new Employee[10];
		while(true) {
		System.out.print("이름을 입력하세요 : ");
		String name = scan.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.print("키를 입력하세요 : ");
		double height = scan.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = scan.nextDouble();
		System.out.print("급여를 입력하세요 : ");
		int salary = scan.nextInt();
		System.out.print("부서를 입력하세요: ");
		String dept = scan.nextLine();
		
			for (int i=0; i<employee.length;i++) {
				
				employee[i]=new Employee(name, age, height, weight, salary,dept);

				

			}
			System.out.println("계속 추가 : Y/y, 그만 : n ");
			String input = scan.next();
			if 	("Y".equals(input)||"y".equals(input)) {
				continue;
			} else {
				break;
			} 
		}
			for (int i=0; i<employee.length;i++) {
				System.out.println(employee[i]);
			}
				
			
		}
			
	
		
	}

	


