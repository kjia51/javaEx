package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// 책 리스트를 생성
	// 길이가 자동으로 늘어나면서 자료가 저장됩니다
	List<Book> bookArr = new ArrayList<>();

	public Library() {
	}

	public Library(List<Book> bookArr) {
		this.bookArr = bookArr;
	}
	
	public boolean addBook(String title, String author) {
		//외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title, author);
		//맨 마지막에 인덱스를 추가하고 객체를 저장
		return bookArr.add(book);
		
		
	}
	
	@Override
	public String toString() {
		int i = 0;
		for(Book b : bookArr) {
			System.out.println(i+":"+b.toString());
			i++;
		}
		return super.toString();
	}
	
	public void removeBook(int index) {
		Book book = bookArr.remove(index);
		System.out.println(book.toString());
		
	}
	
	public void updateBook(int index) {
		/*
		 * 1. 인덱스에 들어있는 책을 꺼내오기
		 * 2. 렌트 여부 수정
		 * 3. 책 저장하기
		 */
		Book book = bookArr.get(index);
		book.setRent(true);
		bookArr.set(index, book);
	}
	
	
	
}
