package com.kh.object.practice;

public class App {
	public String id;
	public int price;
	public double tax;
	
	public App(String id, int price, double tax){
		this.id=id;
		this.price=price;
		this.tax=tax;
	}
	public App() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	public String infor() {
		return getId()+" "+getPrice()+" "+getTax(); 
	}
}
