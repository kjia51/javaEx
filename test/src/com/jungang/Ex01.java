package com.jungang;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디:");
		String id = scan.nextLine();
		System.out.println("패스워드:");
		String password = scan.nextLine();
		int pass = Integer.parseInt(password);
		
			
			if ("java".equals(id)) {
				if (pass == 12345) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패 : 패스워드가 틀림");
				}
			}else {
				System.out.println("로그인 실패: 아이디가 존재하지 않음");
			
			
			}
	scan.close();
	}

}
