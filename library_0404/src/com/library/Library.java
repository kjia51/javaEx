package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DatabaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	// 필드(전역변수)
	// 클래스 내부에서 어디서든지 사용할 수 있다
	private List<Book> list;
	// FileDao 또는 DatabaseDao 로 생성할 수 있도록
	// 인터페이스를 타입을 선언
	private Dao dao = null;
	
	
//	private Dao dao = new FileDao; 도 가능하다 생성자에 필드 정의 안해줘도됌
	
	public Library() {
		dao = new FileDao();
		//파일을 읽어서 리스트를 초기화 합니다
		list = dao.getList();
	}
	
	public Library(String type) {
		if(type.equalsIgnoreCase("DB")) {
			dao = new DatabaseDao();
		}
	}
	public boolean updateRent(int no) {
		for(Book book: list) {
			if(book.getNo()==no) {
				if(book.isRent()) {
					System.out.println("이미 대여중입니다");
					return true;
				} 
				System.out.println("대여가 완료되었습니다.");
				book.setRent(true);
				return true;
			}
		}
		return false;
	}
	
	public boolean rentBook(int no) {
		for(Book book: list) {
			if(book.getNo()==no) {
				if(book.isRent()) {
					System.out.println("도서가 반납되었습니다");
					book.setRent(false);

				} 
				System.out.println("반납할 수 없는 책입니다.");
				return false;
			}
		}
		return false;
	}
	
	public boolean deleteBook(int no) {
		for (Book book:list) {
			if(book.getNo()==no) {
				return list.remove(book);
			}
		}
		return false;
	}
	
	public boolean insert(int no, String title, String author, boolean isRent) {
		// 책을 생성해서 외부로부터 받은 데이터를 바탕으로 책을 생성하고 리스트에 추가
		
		// 중복제거
		for (Book book : list) {
			if(book.getNo()==no) {
				System.out.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		Book book = new Book(no, title, author, isRent);
		boolean res = dao.saveFile(list);

		if(res) {
			list.add(book);
			return true;
		} else {
			list.remove(book);
			return false;
		}
		
		
		
	}
	
	public void info() {
		System.out.println("========도서내역========");
		for(Book book:list) {
			System.out.println(book.toString());
		}
		System.out.println("=====================");
	}
	
	@Override
	public String toString() {
		String listStr ="";
		for(Book book: list) {
			listStr += book.toString()+"\n";
		}
		return listStr;
	}
}
