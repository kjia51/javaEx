//		FileDao dao = new FileDao();
//		List<Book> list = dao.getList();
//		for (Book book: list) {
//			System.out.println(book.toString());
//		}
//		FileDao dao = new FileDao();
//		List<Book> list = new ArrayList<>();
//		
//		list.add(new Book(3,"오늘도","우리는",false));
//		dao.ListToFile(list);
package com.library;

import java.util.Scanner;

public class App {
	static Scanner scan = new Scanner(System.in);
	static String str = "";
	public static void main(String[] args) {
		

		// 라이브러리 생성
		Library lib = new Library();
		
		// app을 생성하지 않고 getString, getInt 메소드를 사용할 수 없다
		// main 메소드는 static 메소드 정적 메서드
		// 정적 필드에서는 인스턴스필드를 사용할 수 없어서 생성하고 사용해야 한다
		// 또는 getString()과 getInt()를 정적 멤버로 만들어줍니다
		
		
		
//		App app = new App();
		
		System.out.println(lib);

			// 자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해집니다
			
			
			// 로그인
			// id를 입력 받아서 admin이면 관리자 아니면 사용자
			// 어드민 - 책 등록, 책 삭제
			// 사용자 - 책 대여, 책 반납
			
			System.out.println("아이디를 입력해주세요");
			String id = getString();
			
			
			// 스캐너로부터 입력 받아서 리턴 해주는 역할
			outter : while(true) {
				
				if (id.equalsIgnoreCase("admin")) {
					System.out.println("관리자 메뉴입니다.");
					while(true) {
						System.out.println("1.도서등록 2.도서삭제 0.로그아웃 q.종료");
						System.out.println("메뉴번호 입력:");
						int menu = getInt();
						switch (menu) {
						case 1:
							System.out.println("도서번호 입력");
							int no = getInt();
							System.out.println("제목 입력");
							String title = getString();
							System.out.println("저자 입력");
							String author = getString();
							lib.insertBook(no, title, author, false);
							break;
						case 2:
							System.out.println("도서번호 입력");
							no = getInt();
							lib.deleteBook(no);
							break;
						case 0:
							System.err.println("로그아웃 되었습니다");
							break outter;
							
						default:
							System.out.println(menu+"는 없는 메뉴입니다");
							break;
						
					}
					}
					
				}
			
					else {
						System.out.println(id+"님 환영합니다~!");			
						while(true) {
						System.out.println("1.도서대여 2.도서반납 0.로그아웃 q.종료");
						System.out.println("번호를 입력해주세요");
						int menu=getInt();
						switch (menu) {
						case 1:
							System.out.println("도서번호 입력");
							int no = getInt();
							lib.rentBook(no);
							break;
						case 2:
							System.out.println("도서번호 입력");
							no = getInt();
							lib.returnBook(no);
							break;
						case 0:
							System.out.println("로그아웃 되었습니다");
							System.exit(0);
							
						default:
							System.out.println(menu+"는 없는 메뉴입니다");
							break;
					
						}	
					}
				}
			}
}
			
		
			
		
		

		
		
		// 책 추가
//		lib.insertBook(1, "책1", "저자1", false);
//		lib.insertBook(2, "책2", "저자2", false);
//		lib.insertBook(3, "책3", "저자3", false);
		
		// lib ==== lib.toString()

		
		// 책 삭제

//		lib.deleteBook(1);
//		lib.rentBook(2);
//		lib.rentBook(3);
//		lib.returnBook(2);
		
//		int no = 0;
//		boolean res = lib.deleteBook(no);
//		res = lib.rentBook(no);		
//		res = lib.returnBook(no);
		
	
	/**
	 * 사용자로부터 입력받은 문자열을 반환합니다.
	 * 숫자가 입력될 경우 다시 입력을 묘청
	 * oq가 입력될 경우 프로그럼 
	 * 
	 * @return
	 */

	
	public static String getString() {
		while(true) {
			try {
		
			str = scan.next();
			if(str.equalsIgnoreCase("q")) {
				System.out.println("종료 되었습니다");
			}
			// 숫자로 변환 시 숫로 변경되면 문자를 입력해달라고 다시 요청
			Integer.parseInt(str);
			System.out.println("문자를 입력하세요");
		} catch (Exception e) {
			// 문자가 입력된 경우 반복문 탈출
		}
	return str;	
	}
	}
	/**
	 * 문자가 입력되었을 경우 다시 입력 받습니다
	 * Q나 q가 입력되었을 경우 프로그램을 종료합니다.
	 * @return
	 */
	public static int getInt() {
		int i =0;
		String str = "";
		// 사용자 입력받기
		while(true) {
			
			try {
				str = scan.next();
				// q인지 확인하기
				if(str.equalsIgnoreCase("q")) {
					System.out.println("종료 되었습니다.");
					System.exit(0);
				}
				// 숫자로 변환하기
				i = Integer.parseInt(str);
				break;
				
			} catch (Exception e) {
				// 오류가 발생시 다시 사용자 입력으로
				System.err.println("숫자나 Q/q를 입력해주세요");
			}
			
		}
		return i;
	}
}

