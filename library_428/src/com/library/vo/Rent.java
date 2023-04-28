package com.library.vo;

import java.sql.Date;

public class Rent {
	String 대여번호; 
	String 아이디;
	int 도서번호;
	String 대여여부;
	Date 대여일;
	Date 반납일;
	Date 반납가능일;
	Date 연체일;
	public Rent(String 아이디, int 도서번호) {
		this.아이디 = 아이디;
		this.도서번호 = 도서번호;
	}
	public String get대여번호() {
		return 대여번호;
	}
	public void set대여번호(String 대여번호) {
		this.대여번호 = 대여번호;
	}
	public String get아이디() {
		return 아이디;
	}
	public void set아이디(String 아이디) {
		this.아이디 = 아이디;
	}
	public int get도서번호() {
		return 도서번호;
	}
	public void set도서번호(int 도서번호) {
		this.도서번호 = 도서번호;
	}
	public String get대여여부() {
		return 대여여부;
	}
	public void set대여여부(String 대여여부) {
		this.대여여부 = 대여여부;
	}
	public Date get대여일() {
		return 대여일;
	}
	public void set대여일(Date 대여일) {
		this.대여일 = 대여일;
	}
	public Date get반납일() {
		return 반납일;
	}
	public void set반납일(Date 반납일) {
		this.반납일 = 반납일;
	}
	public Date get반납가능일() {
		return 반납가능일;
	}
	public void set반납가능일(Date 반납가능일) {
		this.반납가능일 = 반납가능일;
	}
	public Date get연체일() {
		return 연체일;
	}
	public void set연체일(Date 연체일) {
		this.연체일 = 연체일;
	}
	
	
}
