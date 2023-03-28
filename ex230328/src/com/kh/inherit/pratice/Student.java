package com.kh.inherit.pratice;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.grade=grade;
		this.major=major;
	}
	public String information() {
		return null;
	}
}
