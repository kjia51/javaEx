package exception;

import java.util.Scanner;

public class TryCatchEx {
	/**
	 * try-catch
	 * 
	 * try{
	 * 	// 예외가 발생할 소지가 있는 코드
	 * }catch(exception e){
	 * 	// try블럭에서 예외가 발생시 실행을 멈추고 catch블럭으로 이동
	 * }
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			try {
				System.out.println("숫자를 입력하세요");
				// 사용자가 문자를 입력했을 경우, 숫자로 변환 시 오류 발생
				int num = scan.nextInt();
				break;
				
			} catch (Exception e) {
				scan.next();
//			e.printStackTrace();
				System.out.println("입력이 잘못되었습니다");

			}
		} 
		System.out.println("종료되었습니다");
		

	
	
}
}
