package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library2 {
	List<Book> bookList = new ArrayList<>();

	public Library2() {

	}
	public Library2(List<Book> bookList) {
		this.bookList = bookList;
	}
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	public void Add(String title, String author) {
		Book book = new Book(title, author);
		bookList.add(book);
	}
	
	@Override
	public String toString() {
		for (Book book: bookList) {
			System.out.println(book.getTitle()+"/"+book.getAuthor()+"/"+book.isRent());
		}
		return super.toString();

	}
	
}
