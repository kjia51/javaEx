package com.library.vo;

public class Book {
	private int no; // 도서 일련번호
	private String title; // 도서명
	private String author; // 작가
	private String rentyn;  // 도서 대여여부

	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		// 신규도서이므로 N
		this.rentyn = "N";
	}
	
	
		public Book(int no, String title, String author, String rentyn) {
		this.no = no;
		this.title = title;
		this.rentyn = rentyn;
		this.author = author;
	}
		
	@Override
	public String toString() {
		
		String rentYNStr = "";
		if("Y".equals(getRentyn())) {
			rentYNStr="대여중";
		}
		else {
			rentYNStr="대여가능";
		}
		return getNo()
				+ " " + getTitle()
				+ " " + getAuthor()
				+ " " + rentYNStr;
			
				
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
	public String getRentyn() {
		return rentyn;
	}
	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
}
