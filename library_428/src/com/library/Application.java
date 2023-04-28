
package com.library;

import com.library.controller.LibraryController;

public class Application {
	public static void main(String[] args) {

		//도서목록 출력 getList테스트
//		List<Book> list = dao.getList();
//		for(Book book1 : list) {
//			System.out.println(book1.toString());
//		}

//		insert 테스트
//		Book book = new Book("책제목","저자");
//		System.out.println("insert 완료 "+dao.insertBook(book));

//		delete 테스트
//		System.out.println("delete 완료 "+dao.deleteBook(1));

//		rentYNBook 테스트
//		System.out.println("delete 완료 "+dao.rentYNBook("Y",3));
	
//		MemberDao dao = new MemberDao();
		
		// member 인서트
//		Member member = new Member("user01","1234","사용자","N","N","B");
//		System.out.println(dao.insertMember(member));

		LibraryController lib = new LibraryController();
		lib.library();
		lib.login();
		
//		System.out.println(dao.login("user", "1234"));
		// 아이디 체크 테스크
		// dao.idCheck("user");
//		System.out.println(dao.deleteMember("user01"));
		
	
	
}	 
}