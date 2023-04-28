package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookService {
// 컨트롤러랑 연결
	BookDao dao = new BookDao();
	
	
	public List<Book> getList(){
		List<Book> list = dao.getList();
		for(Book book : list) {
			System.out.println(book.toString());
		}
		return list;
	}
	public void insertBook(String title, String author) {
		Book book = new Book(title, author);
		int i = dao.insertBook(book);
		if(i>0) {
			System.out.println(i+"건이 등록되었습니다");
		} else {
			System.out.println("입력 도중 오류 발생");
		}

	}
	public void deleteBook(int no) {
		int res = dao.deleteBook(no);
		if(res>0) {
			System.out.println(res+"건이 삭제되었습니다");
		} else {
			System.out.println("도서삭제 중 문제 발생 \n번호 다시 입력바람");
		}
	}
	public void rentYNBook(int no) {
		String rentyn = dao.rentYNBook(no);
		
			if(rentyn.equalsIgnoreCase("n")) {
				int res = dao.rentYNBook("Y", no);
				if(res>0) {
					System.out.println(res+"건 대여");
					System.out.println("정상적으로 대여");
					
				}
			} else {
				System.out.println("이미 대여중입니다");
			}
			
			System.out.println("대여처리 도중 오류 발생");
		}
	
	public void returnBook(int no) {
		String rentyn = dao.rentYNBook(no);
		
			if(rentyn.equalsIgnoreCase("y")) {
				int res = dao.rentYNBook("N", no);
				if(res>0) {
					System.out.println("정상적으로 반납");
				
				}
			} else {
				System.out.println("이미 반납중입니다");
			}
			
			System.out.println("반납처리 도중 오류 발생");
		}
		
	}
	

