package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
	 * UnCheckedException
	 * - RuntimeException을 상속하고 있는 예외들 ==> 실행예외
	 * - 컴파일 시 예외처리코드가 있는지 검사하지 않는다
	 * - 프로그램 실행 도중 문제가 발생되므로 오류를 예측해서 조건문을 통해 처리해주어야한다.
	 * - 보통 예측 가능한 범주에 속하므로 어느정도 예측하여 처리하는 것이 가능하다
	 * @author user
	 * 
	 * 
	 * RuntimeException의 후손들
	 * - ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 이용한 경우
	 * - NegativeArraySizeException : 배열의 사이즈를 음수로 잘못지정한 경우
	 * - ArithmeticException : 0으로 나눈 경우
	 * - NullPointerException : 참조변수의 값이 null인 경우 주소접근연산자를 사용
	 * - ClassCastException : 잘못된 Cast 연산자 사용시 
	 */


public class D_UnCheckedException {
	public static void main(String[] args) {
		D_UnCheckedException d = new D_UnCheckedException();
//		d.method1();
//		d.method2();
		
		d.method3();
	}
	
	public void method1() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("숫자 : ");
				int num = scan.nextInt();
				break;
				
			} catch (InputMismatchException e) {
				String str= scan.next();
				System.out.println(str+"은 입력이 불가능합니다");
			}
		}
		System.out.println("문자 : ");
		// nextInt()를 이용해서 숫자값을 받아올 경우 
		// 엔터가 그냥 남아있어서 nextLine() 
		String str = scan.nextLine();
		System.out.println("문자 : ");
		String str1 = scan.nextLine();

	}
	
	// ArithmeticException : 0으로 나눈 경우
	public void method2() {
		int i = 10;
		int j = 0;
		if (j==0) {
			System.out.println("0으로 나눌 수 없습니다");
			return; 
		}
		
	}
	
	//NegativeArraySizeException 실행오류
	public void method3() {
		int size = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 : ");
		try {
			size= scan.nextInt();
		} catch (Exception e) {
			System.out.println(scan.next()+"는 입력 불가능합니다");
			return;
		}
		
		
		// 배열을 생성하는데 배열의 사이즈를 음수로 설정할 경우
		// NegativeArraySizeException이 발생할 소지가 있으므로
		// 입력된 값이 양수인지 체크합니다.
		if(size<0) {
			System.out.println("음수는 입력할 수 없습니다");
			return;
		}
		int[] arr = new int[size];
		// 0~n-1 
//			 방번호는 0부터 시작하므로
//			 배열의 생성길이 size보다 1작은수까지 참조가 가능하다
		try {
			int num = arr[size] ;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력하였습니다");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
