package com.kh.pratice2.model.vo;

public class Cat extends Animal {
	private String location="서울";
	private String color="색깔";
	
	public Cat() {
		
	}
	
	public Cat(String name, String kind, String location, String color) {
		super(name, kind);
		this.location=location;
		this.color=color;
	}
	

	@Override
	public void speak() {
		System.out.println(toString());
		System.out.println(location+"에 서식하며, 색상은 "+color+"입니다");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
