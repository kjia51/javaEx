package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.Filedao;
import com.library.vo.Book;

public class Library {
	// 도서 리스트 - 메모리(프로그램 종료시 사라짐)
	private List<Book> bookArr = new ArrayList<>();
	// data access object
	private Dao dao = null;

	
	/**
	 * 생성자
	 */
	
	public Library(String confDao) {
		
		if("db".equals(confDao)) {
			dao = new DatabaseDao();
		} else { 
			dao = new Filedao();
		}
		// 책의 리스트를 조회(파일 또는 db를 이용해서 조회
		// 책을 생성해서 리스트에 담기

		// TODO : 일련번호가 겹치지 않았으면 좋겠다!
		// 데이터베이스를 이용할 경우 번호를 기본키로 사용시 
		// 중복된 번호는 입력이 안되므로 오류 발생
		bookArr.add(new Book(1, "책1", "작가1", false));
		bookArr.add(new Book(2, "책2", "작가2", false));
		bookArr.add(new Book(3, "책3", "작가3", false));
		bookArr.add(new Book(4, "책4", "작가4", false));
	}
	
	/**
	 * 신규도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		// 리스트에 책을 추가합니다.
		Book book = new Book(no, title, author, isRent);
		bookArr.add(book);
		dao.insertBook(book);
		return true;
}
	/**
	 * 책 대여
	 * 책의 일련번호를 매개변수로 받아서 책의 정보 수정
	 * @param index
	 * @return
	 */

	public boolean returnBook (int index) {
		for(Book book : bookArr) {
			if (book.getNo()==index) {
				if (!book.isRent()) {
					System.out.println("반납가능한 도서가 아닙니다");
					return false;
				}
			book.setRent(false);	
			}
		}
		return true;
	}
	public boolean rentBook(int index) {
		for (Book book : bookArr) {
			// 사용자가 입력한 일련번호가 존재하는 경우
			
			if (book.getNo()==index) {
				if (book.isRent()) {
					System.out.println("이미 대여중입니다.");
					return false;
				}
				
				// 반납 isRent가 false면 반납완료되었습니다.
				
				// 대여여부 변경 = 책의 정보를 수정
				book.setRent(true);
				dao.updateBook(book);
				return true;
			}
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}

	
	
	
	public boolean deleteBook(int index) {
		for (Book book : bookArr) {
			// 사용자가 입력한 일련번호가 존재하는 경우
			
			if (book.getNo()==index) {
				// 이미 대여중인 경우 

				return bookArr.remove(book);
			}
		}
		System.out.println("일련번호를 찾을수가 없습니다");
		return false;

	}
	
	
	public void info() {
		System.out.println("===================");
		for (Book book : bookArr) {
			book.info();
		}
		System.out.println("===================");
	}
	public static void main(String[] args) {
		Library lib = new Library(" ");
		// 도서 리스트 출력
		lib.info();
		
		// 신규 도서 등록
		lib.insertBook(5, "책5", "작가5", false);
		System.out.println("도서 삭제 실행lib.deleteBook(2)======================");
		lib.deleteBook(2);
		lib.info();
		// 도서대여

		System.out.println("도서 삭제 실행lib.rentBook(5)======================");
		lib.rentBook(5);
		lib.info();
		

		System.out.println("도서 삭제 실행lib.returnBook(1)======================");
		lib.returnBook(1);
		lib.info();
		
	}
	
}
