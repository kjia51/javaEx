package com.library;

import java.util.Scanner;

public class Application {
	
	// 인스턴스 멤버 -> 생성 후 사용할 수 있어요 변수로 접근
	// 레퍼런스 변수명으로 .찍어서 사용할 수 있다
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Application app = new Application();
//		System.out.println("나이 입력");
//		System.out.println(app.getInt());
//
//		System.out.println("이름 입력");
//		System.out.println(app.getString());
		// 도서관 생성
		Library lib = new Library("file");

		
		public void adminMenu(Library lib) {
		
			while(true) {
				// 로그인 처리
				System.out.println("아이디를 입력해주세요");
				String id = getString();
				if ("admin".equalsIgnoreCase(id)) {
					outter : while(true) {
						lib.info();
						System.out.println("1. 도서등록 2. 도서삭제 0.로그아웃 q : 프로그램 종료");
						System.out.println("메뉴를 입력해주세요");
						int menu = getInt();
						
						if(menu==1) {
							System.out.println("도서번호를 입력해주세요");
							int no = getInt();
							System.out.println("제목을 입력해주세요");
							String title = getString();
							System.out.println("저자를 입력해주세요");
							String author = getString();
							lib.insertBook(no, title, author, false);
						} else if (menu==2) {
							System.out.println("도서번호를 입력해주세요");
							int index = getInt();
							lib.deleteBook(index);
						} else if(menu==0){
							System.out.println("로그아웃 되었습니다");
							break outter;
						}
						else {
							System.out.println("메뉴를 다시 입력해주세요");
						}
					}
		}
	}
}
		

	
		// 메뉴확인
		
		
	
	private void memberMenu(){
		while(true) {
			// 로그인 처리
			System.out.println("아이디를 입력해주세요");
			String id = getString();
			if ("admin".equalsIgnoreCase(id)) {
				outter : while(true) {
					lib.info();
					System.out.println("1. 도서등록 2. 도서삭제 0.로그아웃 q : 프로그램 종료");
					System.out.println("메뉴를 입력해주세요");
					int menu = getInt();
					
					if(menu==1) {
						System.out.println("인덱스를 입력해주세요");
						int index = getInt();
						System.out.println("도서번호를 입력해주세요");
						int no = getInt();
						System.out.println("제목을 입력해주세요");
						String title = getString();
						System.out.println("저자를 입력해주세요");
						String author = getString();
						lib.insertBook(no, title, author, false);
					} else if (menu==2) {
						System.out.println("도서번호를 입력해주세요");
						int index = getInt();
						lib.deleteBook(index);
					} else if(menu==0){
						System.out.println("로그아웃 되었습니다");
						break outter;
					}
					else {
						System.out.println("메뉴를 다시 입력해주세요");
					}
				}
		

		}}
	}
	
	
	
	/**
	 * 사용자로부터 문자를 입력받습니다
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			try {
				res = scan.next();
				
					Integer.parseInt(res);
					System.out.println("문자를 입력해주세요");
					continue;
				} catch (Exception e) {

				}
				

				
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				break;
				}
			 catch(Exception e) {
				System.err.println("입력 중 오류가 발생했습니다 \n 숫자를 입력해주세요");
			}
		}
		
		return res;
	}
	
	/**
	 *  사용자로부터 숫자를 입력받습니다.
	 * @return
	 */
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String res = scan.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(res);
				return i ;
				
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다 \n 숫자를 입력해주세요");
			}
		}
	}
	
}
}
