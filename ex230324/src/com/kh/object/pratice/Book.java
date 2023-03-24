package com.kh.object.pratice;

public class Book{
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	public Book(){
		
	}
	
	public Book(String title, int price, double discountRate, String author){
		this.title=title;
		this.price=price;
		this.discountRate=discountRate;
		this.author=author;
	}
	
	public String information() {
		return null;
	}

	public void print() {
		System.out.println(
				getTitle()
				+"\t" + "getPrice()"
				+"\t" + getDiscountRate()
				+"\t" + getAuthor()
				);
	}
			
	public void printPrice() {
		System.out.println("도서명 ="+getTitle());
		double price = getPrice()-(getPrice()*getDiscountRate());
		System.out.println(price);
	}
	


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
//	public void printPrice() {
//	System.out.println("도서명 = "+getTitle());
//	int price = (int)(getPrice() -getPrice()*getDiscountRate());
//	System.out.println("할인된 가격 = "+price);
//	
//}
}
