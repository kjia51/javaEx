package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Member;

public class MemberDao {
	/**
	 * 
	 * 사용자 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member login(String id, String pw) {
		MemberDao dao = new MemberDao();
		Member member = null;

		String sql = String.format("select id, name, adminyn, status, grade from member where id='%s'and pw='%s'", id, pw);
//		System.out.println(sql);
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
				// 질의 결과 결과집합을 member객체에 담아줍니다	
				if(rs.next()) {
					String name = rs.getString(2);
					String adminyn = rs.getString(3);
					String status = rs.getString(4);
					String grade = rs.getString(5);
					member = new Member(id, "", name, adminyn, status,  grade);
				}					
		} catch (SQLException e) {

		}
	return member;	
	}
	
	public int insertMember(Member member) {
		int res=0;
		String sql = String.format("INSERT INTO MEMBER (id, pw, name)  VALUES ('%s','%s','%s')", member.getId(), member.getPw(), member.getName());

		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();){
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {

		}
		return res;	
	}
	
	/**
	 * 아이디 중복 체크 
	 * 중복일 경우 FALSE리턴
	 * @param id
	 * @return
	 */
	public boolean idCheck(String id) {
		
		String sql = String.format("SELECT * FROM MEMBER WHERE ID = '%s'", id);

		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){

			return !rs.next();
			
		} catch (SQLException e) {
//			e.printStackTrace();
		}
		return true;
	}
	
	public int deleteMember(String id) {
		int res=0;
		String sql = String.format("DELETE FROM MEMBER WHERE ID='%s'", id);

		try (Connection conn = ConnectionUtil.getConnection();
			 Statement stmt = conn.createStatement();){
			 stmt.executeQuery(sql);
		} catch (SQLException e) {

		}
		
		return res;
	}


}	