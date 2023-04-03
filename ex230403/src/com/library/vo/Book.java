package com.library.vo;

public class Book {
	//책 일련번호
	private int no;
	private String title;
	private String author;
	private boolean rent;
	
	public Book() {
	
	}
	public Book(int no, String title, String author, boolean rent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.rent = rent;
	}
	
	public void info() {
		String str = " ";
		if(rent) {
			str="대여중"; }
		System.out.println(getNo()+ " " + getTitle()+ " " + getAuthor()+ " " + str);
	
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return rent;
	}
	public void setRent(boolean isrent) {
		this.rent = isrent;
	}
	

	
	
}

