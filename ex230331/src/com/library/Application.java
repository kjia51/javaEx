package com.library;

public class Application {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook("책1", "지은이1");
		lib.addBook("책2", "지은이2");
		lib.addBook("책3", "지은이3");
		
		lib.toString();
		System.out.println();
		
		//책 삭제
		System.out.println("삭제할 책 번호 선택");
		int i = 2 ;
		lib.removeBook(i);
		lib.toString();
		System.out.println();
		//책 대여 book.isRent=true;
		
		System.out.println("대여할 책 번호 선택");
		i=0;
		lib.updateBook(i);
		lib.toString();
		
		// 책 목록의 사이즈보다 큰 값이 입력되었을 때 다시 입력받을 수 있도록
		
		
	}
}
