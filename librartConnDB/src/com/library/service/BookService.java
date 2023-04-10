package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;


/**
 * 비즈니스 로직
 * 사용자요청검증
 * DB CRUD 요청
 * 사용자 요구에 맞게 리턴 
 * 
 * Dao 호출
 * @author user
 *
 */
public class BookService {
	
	BookDao bookDao = new BookDao();
	
	
	public void getList() {
		List<BookVo> list = bookDao.getList();
		System.out.println("======도서목록======");		
		for (BookVo book : list) {
			System.out.println(book.toString());
		}
	}

	public int insertBook(BookVo bookVo) {
		int res = bookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println("도서가 입력되었습니다");
			getList();
		} else {
			System.out.println("도서 입력 중 오류가 발생했습니다.");
		}
		return 0;
	}


	public int deleteBook(int bookNo) {
		int res = bookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println("도서가 삭제되었습니다");
			getList();
		} else {
			System.out.println("도서 삭제 중 오류가 발생했습니다.");
		}
		return 0;
	}
	
	/**
	 * 책이 렌트 가능한 상태인지 확인
	 * 가능한 상태면 대여처리
	 * 아니면 메세지 처러
	 * @param bookNo
	 */

	public void rentBook(int bookNo) {
		if(selStatus(bookNo,"N")) {
			int res =bookDao.updateBook(bookNo,"Y");
			if(res>0) {
				System.out.println("대여되었습니다");
				getList();
			} else {
				System.out.println("대여중 문제가 발생했습니다");
			}
		} else {
			System.err.println("대여가 불가능한 상태입니다");
		}
	
	}
	
	/**
	 * 대여/반납 가능한 책인지 조회합니다
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		boolean res = bookDao.selStatus(no,rentYN);
		return res;
	}

	public void returnBook(int bookNo) {
		if(selStatus(bookNo, "Y")) {
			int res = bookDao.updateBook(bookNo, "N");
			
			if(res>0) {
				System.out.println("반납되었습니다");
				getList();
			} else {
				System.err.println("반납도중 문제가 발생했습니다");
			}
		} else {
			System.err.println("반납할 수 없는 도서입니다.");
		}
	}
	

}
