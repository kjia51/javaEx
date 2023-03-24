package com.kh.object;

import com.kh.object.pratice.Book;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("자바의 정석", 20000,02,"윤상섭");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.2);
		book1.setAuthor("윤상섭");
		
		book1.print();
		
		
	
	}

			
 }
