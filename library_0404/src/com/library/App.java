package com.library;

import java.util.Scanner;

public class App {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		App app = new App();
		Library lib = new Library();
		
		System.out.println("아이디를 입력하세요");
		String id = app.getString();
		if (id.equalsIgnoreCase("admin")) {
			app.ad(lib);
		} else{
			app.user(lib);
		}
	}
			
		public void ad(Library lib){
			lib.info();
			while(true) {
				System.out.println("관리자페이지");
				System.out.println("1. 도서등록 2. 도서삭제 0.로그아웃 q : 프로그램 종료");
				System.out.println("번호를 입력하세요");
				int num = getInt();
				switch (num) {
				case 1:
					System.out.println("도서번호를 입력하세요");
					int no = getInt();
					
					System.out.println("제목을 입력하세요");
					String title = getString();
					System.out.println("저자 입력하세요");
					String author = getString();
					lib.insert(no, title, author, false);
					System.out.println(lib.toString());
					break;
				case 2:
					System.out.println("삭제할 도서번호를 입력하세요");
					int i = getInt();
					lib.deleteBook(i);
					System.out.println(lib.toString());
					break;
				case 0:
					System.out.println("로그아웃 되었습니다");
					break;
				default:
					System.out.println("메뉴번호를 확인해주세요");
					
					break;
				}
				
			}
		}
		public void user(Library lib) {
			
		while(true) {
				System.out.println("사용자페이지");
				System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 q. 프로그램 종료");
				lib.info();
				System.out.println("번호를 입력하세요");
				int num = getInt();
				switch (num) {
				case 1:
					System.out.println("도서번호를 입력하세요");
					int no = getInt();
					lib.updateRent(no);

					break;
				case 2:
					System.out.println("반납할 도서번호를 입력하세요");
					no = getInt();
					lib.rentBook(no);

					break;
				case 0:
					System.out.println("로그아웃 되었습니다");
					break;
				default:
					System.out.println("메뉴번호를 확인해주세요");
					
					break;
				}
				
			}
			
		}
		
		

		
		
		public String getString(){
			String str = "";
			while(true) {
				try {
					str = scan.next();
					try {
						Integer.parseInt(str);
						System.err.println("문자를 입력해주세요");
						continue;
					} catch (Exception e) {
					}
					if (str.equalsIgnoreCase("q")) {
						System.out.println("프로그램 종료");
						System.exit(0);
					}
					break;
				} catch (Exception e) {
					System.err.println("입력 중 오류가 발생했습니다.");
				}
				
			}
			return str;
				
			}
		
		public int getInt() {
			int i = 0;
			while(true) {
			try {
				String str = scan.next();
				if (str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.err.println("숫자를 입력해주세요");
			}
			}return i;
			}
			
			
		
		

		}
		


		


