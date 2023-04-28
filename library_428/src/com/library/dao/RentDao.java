package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;

public class RentDao {
// 상태조회 : 대여여부 도서번호가 매개변수
// 인서트 : id 도서번호 -> 반환타입 int
// 업데이트 : 도서번호 -> 반환타입 int
	public static void main(String[] args) {
		 RentDao dao = new RentDao();
		 System.out.println(dao.getRentYN(2));
		 System.out.println(dao.insert("user",3));
		 System.out.println(dao.update(3));
	}
	public String getRentYN(int no) {

		String str="N";
		String sql = String.format("select 대여여부 from 대여 where 도서번호=? and 대여여부 = 'Y'",no);
		try(Connection conn = ConnectionUtil.getConnection();
			    Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while(rs.next()) {
				str= rs.getString(1);
			}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return str;
	}
	
	public int insert(String id, int no) {
		int res = 0;
		String sql = "INSERT INTO 대여 VALUES(SEQ_대여.NEXTVAL, ?,?,'Y',SYSDATE, NULL, SYSDATE+7, null)";
		try (Connection conn = ConnectionUtil.getConnection();
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setString(1, id);
			pstmt.setInt(2, no);
			
			res= pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
//대여 INSERT 반납 UPDATE 대여여부 RENTYN
//  
	public int update(int no) {
		int res = 0;
		String sql = String.format("update 대여 set 반납일 = sysdate, 대여여부 = 'N' WHERE 도서번호=%d",no);
		try (Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, no);
			res = pstmt.executeUpdate();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}
