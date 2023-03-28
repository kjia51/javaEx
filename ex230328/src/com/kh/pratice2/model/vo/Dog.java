package com.kh.pratice2.model.vo;

public class Dog extends Animal{
	public String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	public Dog(String name, String kind, int weight) {
		super(name,kind);
		this.weight=weight;

	}
	@Override
	public void speak() {
		System.out.println(toString());
		System.out.println("몸무게는 "+weight+"kg입니다");
	}
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
