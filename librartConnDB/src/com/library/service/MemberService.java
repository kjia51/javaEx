package com.library.service;

import java.util.List;

import com.library.controller.MemberVo;
import com.library.dao.MemberDao;

public class MemberService {
	MemberDao memberDao = new MemberDao();
	public void getList() {
		List<MemberVo> list = memberDao.getList();
		System.out.println("======사용자목록======");
		for (MemberVo member : list) {
			System.out.println(member.toString());
		}
	}
	/**
	 * 로그인
	 * ID, PW를 입력받아서 사용자를 조회합니다.
	 * @param id
	 * @param pw
	 * @return
	 */
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id, pw);
		if(memberVo!=null) {
			System.out.println(memberVo.getName()+"님 환영합니다~!");
			return memberVo;
		} else {
			System.out.println("아이디/비밀번호가 일치하지 않습니다.");
			return null;
		}
	}
	
	
	public void insertMember(MemberVo memberVo) {
		int res = memberDao.insertMember(memberVo);
		if(res>0) {
			System.out.println("사용자가 입력되었습니다");
			getList();
		} else {
			System.out.println("사용자 입력 중 오류가 발생했습니다");
		}
	}


	public void deleteMember(String id) {
		
		// 사용자 조회
		// 사용자를 조회할 수 없습니다 메세지 출력
		int res = memberDao.deleteMember(id);
		if(res>0) {
			System.out.println("사용자가 삭제되었습니다");
			getList();
		} else {
			System.out.println("사용자 삭제 중 오류가 발생했습니다.");
		}
		
	}



}
