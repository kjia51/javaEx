package com.library.service;

import com.library.dao.RentDao;

public class RentService {
	RentDao dao = new RentDao();
	public String getRentYN(int no){
		String rentYN = dao.getRentYN(no);
		return rentYN;
	}
	
	public void rentBook(String id, int no) {
		String rentYN = dao.getRentYN(no);
		if("Y".equalsIgnoreCase(rentYN)){
			System.out.println("이미 대여중인 도서입니다");
			return;
		}
		int res = dao.insert(id, no);
		System.out.println(res+"건 대여");
	}
	
	public void returnBook(int no) {
		String rentYN = dao.getRentYN(no);
		if("N".equalsIgnoreCase(rentYN)){
			System.out.println("반납 가능한 도서가 아닙니다");
			return;
		}
		int res = dao.update(no);
		System.out.println(res+"건 대여");
	}
		
	}

