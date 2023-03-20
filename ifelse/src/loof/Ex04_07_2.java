package loof;

import java.util.Scanner;

public class Ex04_07_2 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int balance = 0;
			System.out.println("---------------------------"); 
			System.out.println("1.예금| 2.출금| 3. 잔고| 4.종료");
			System.out.println("---------------------------");
			System.out.println("선택>");
			
			int input = scan.nextInt();
				switch(input) {
				case 1 :
					System.out.println("예금액>");
					balance = scan.nextInt();
				break ;
				case 2 :
					System.out.println("출금액>");
					
					int output = scan.nextInt();
					if(balance<output) {
						System.out.println("금액이 부족합니다");
					} else {
						balance -= output;
					}
					break;
				case 3 :
					System.out.println("잔고 :" + balance);
					break;
				default :
					System.exit(0);
					System.out.println("프로그램 종료");
					break ;
					
			
		}
		}
	}
}