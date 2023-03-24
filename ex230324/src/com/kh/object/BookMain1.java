package com.kh.object;

import com.kh.object.pratice.Book;

public class BookMain1 {
	public static void main(String[] args) {
		Book book1=new Book();
		Book book2=new Book("자바의 정석", 20000, 0.2, "윤상섭");


		System.out.println(book2.information());

		book2.setTitle("자바의 정석");
		book2.setPrice(30000);
		book2.setDiscountRate(0.1);
		book2.setAuthor("윤상섭");
		


	}
}
