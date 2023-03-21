package loof;

import java.util.Scanner;

public class Ex04_07_3 {

		public static void main(String[] args) {
			int money=0; 
			int balance=0;
			Scanner scan = new Scanner(System.in);
			outter : while(true) {
				
				System.out.println("---------------------------");
				System.out.println("1.예금|2.출금|3.잔고|4.종료");
				System.out.println("---------------------------");
				System.out.println("선택>");
				
				
				int input = scan.nextInt();
				switch(input) {
				case 1 :
					System.out.println("예금액>");
					balance = scan.nextInt();
					break;
				case 2 :
					System.out.println("출금액>");
					money = scan.nextInt();
					if (balance < money){
						System.out.println("잔고가 부족합니다");
					} else {
						balance -= money;
					}
						break;
				case 3 :
						System.out.println("잔고>"+balance);
					break;
				default :

					System.out.println("프로그램 종료");
//					System.exit(0);
					break outter;
					
			} 
		} 
			scan.close();
			
	}
}