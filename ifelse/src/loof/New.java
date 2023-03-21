package loof;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int output = 0;
		Scanner scan = new Scanner(System.in);
		out : while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("--------------------------");
			System.out.println("선택>");
			int input = scan.nextInt();
//			int num = (int)Double.parseDouble(input);
			switch(input) {
			case 1 :
				System.out.println("예금액>");
				balance = scan.nextInt();
				break;
			case 2 :
				System.out.println("출금액>");
				output= scan.nextInt();
				if (output>balance) {
					System.out.println("잔고가 부족합니다");
				}else {
					balance -=output;	
					}
				break;
			case 3 :
				System.out.println(balance);
				break;
			default :
				System.out.println("프로그램을 종료합니다");
				break out;
				}
			}
			scan.close();
			
		}
	}



