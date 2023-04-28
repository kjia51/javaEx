package com.library.service;


import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	public Member login(String id, String pw) {
		Member member = null;
		member = dao.login(id, pw);
		
		if(member==null) {
			System.out.println("아이디/비밀번호를 확인해주세요");
		} else {
			System.out.println(member.getName()+"님 환영합니다.");
		}
		return member;
	}


	public void insertMember(String id, String pw, String name, String adminYN) {
		Member member = new Member(id, pw, name, adminYN, null, null);
		int res = dao.insertMember(member); 
		while(dao.idCheck(id)) {
			if(res>0) {
				System.out.println(res+"건 입력");
				break;
			}
		}
		System.out.println("아이디가 중복되었습니다.");
		
	}


	public void deleteMember(String id) {
		int res = dao.deleteMember(id);
		if (res>0) {
			System.out.println(res+"건 처리되었습니다");
		}
		System.out.println("삭제할 번호를 다시 입력");
	}
	

}
