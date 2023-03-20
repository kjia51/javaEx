package loof;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("1.예금| 2.출금| 3. 잔고| 4.종료");
		System.out.println("---------------------------");
		System.out.println("선택>");
		while(run) {
			int num = scan.nextInt();
			balance += scan.nextInt(); 
//			System.out.println("선택>"+num);
			if (num==1) {
				System.out.println("예금액>");				
				System.out.println(balance);				
			} else if(num==2) {
				System.out.println("출금액>");				
			} else if(num==3) {
				System.out.println("잔고>");				
			} else {
				break;
			}
		} System.out.println("프로그램 종료");
		scan.close();
	} 

}
