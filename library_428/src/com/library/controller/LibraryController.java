package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.RentService;
import com.library.vo.Member;

/**
 * 도서대여 시스템
 * 
 * controller 가 사용자로부터 입력을 받아서 사용자 요청에 알맞는 서비스 로직 호출
 * 1. 로그인
 * - 관리자
 * 		: 도서등록, 도서삭제, 사용자등록, 사용자삭제
 * - 사용자
 * 		: 도서대여, 도서반납, 도서대여현황
 * @author user
 *
 */
public class LibraryController {
	Scanner scan = new Scanner(System.in);
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	RentService rentService = new RentService();
	
	
	/**
	 * 도서관리 시스템 시작
	 */
	public void library() {
		System.out.println("===================================");
		System.out.println("=========<<도서관리시스템 v1.0>>=======");
		System.out.println("===================================");
		
		System.out.println("=============<<로그인>>==============");
		
		while(true) {
			Member member = login();

			if(member.getAdminyn().equals("Y")) {
				adminMenu();
			} else {
				userMenu();
			}
			
		}
		
	}
	
	private void adminMenu() {
		while(true) {
			bookService.getList();
			System.out.println("========관리자 메뉴========");
			System.out.println("1. 도서등록, 2. 도서삭제, 3. 사용자등록, 4. 사용자삭제, 0.로그아웃, q. 종료");
			System.out.println("========================");
			System.out.println("메뉴를 선택해주세요");

			
			int menu = getInt();
			switch (menu) {
			case 1:
				// 도서등록
				System.out.println("책제목 입력");
				String title = scan.next();
				System.out.println("작가 입력");
				String author = scan.next();
				bookService.insertBook(title, author);
				break;
			case 2:
				System.out.println("삭제할 도서 번호 입력");
				int no = scan.nextInt();
				bookService.deleteBook(no);
				
				break;
			case 3:
				//사용자 등록
				System.out.println("id 입력");
				String id = scan.next();
				
				System.out.println("pw 입력");
				String pw = scan.next();
				
				System.out.println("name 입력");
				String name = scan.next();
				
				System.out.println("관리자 계정이면 Y 입력");
				String  str= scan.next();
				String adminYN = str.equalsIgnoreCase("y")?"관리자":"사용자";
				memberService.insertMember(id, pw, name, adminYN);
				
				break;
			case 4:
				//사용자삭제
				System.out.println("삭제할 사용자 번호");
				id = scan.next();
				memberService.deleteMember(id);
				
				break;
			case 0:
				System.out.println("로그아웃 되었습니다");
				break;
				
			default:
				System.out.println("메뉴번호를 확인하고 다시 입력해주세요");
				break;
			}
			

		}
			}
		
	private void userMenu() {

		while(true) {
			bookService.getList();
	 	    System.out.println("========사용자 메뉴========");
	 	    System.out.println("1. 도서대여, 2. 도서반납, 0. 로그아웃, q. 종료");
	 	    System.out.println("========================");
	 	    System.out.println("메뉴를 선택해주세요");
	 	    
	 	    int menu = getInt();
	 	    switch (menu) {
			case 1:
				//1. 도서대여
				System.out.println("도서번호 입력");
				String id = getString();
				System.out.println("아이디 입력");
				int no = getInt();
				rentService.rentBook(id, no);
				break;
			case 2:
				System.out.println("도서번호 입력");
				no = getInt();
				rentService.returnBook(no);
				
				break;
			case 0:
				
				break;

			default:
				System.out.println("메뉴를 다시 선택해주세요");
				break;
			}
	 	    
		}
		}

	public Member login() {
		MemberService memberserive = new MemberService();
		while(true) {
			System.out.println("id 입력");
			String id = getString();		
			System.out.println("password 입력");
			String pw = getString();
			
			Member member = memberserive.login(id, pw);
			if(member!=null) {
				return member;
			} 
			
			
			
		}
	}
	
	/**
	 * 사용자의 입력을 받아 문자열을 반환합니다.
	 * 문자가 입력될때까지 반복
	 * Q, q가 입력되면 종료
	 * @return
	 */
	
	public String getString() {
		String str="";
		while(true) {
			str=scan.next();
			if(str.equalsIgnoreCase("q")) {
				System.exit(0);
		}
			return str;
		}			
	}
	
	public int getInt() {
		int i = 0 ;
		while(true) {
			
			try {
				i=scan.nextInt();
				return i;
			} catch (Exception e) {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
				System.out.println(str+"은 입력 불가능합니다");
		}
			return i;
		}
	}
	

}
