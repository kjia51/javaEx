package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB Connection을 반환합니다
 * @author user
 *
 */

public class ConnectionUtil {

	public static Connection getConnection() {
		// 접속정보(ip, port, sid, 계정id , 비밀번호)
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "library";
				String pw = "1234";
				Connection conn = null;
				try {
					// 드라이버 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 커넥션 생성
					conn = DriverManager.getConnection(url, id, pw);
					// 트랜잭션 처리를 위해 자동커밋을 false로 설정 
					// -> 커넥션이 종료되는 시점에 커밋
					conn.setAutoCommit(false);
					
				} catch (ClassNotFoundException e) {
					System.err.println("라이브러리를 확인해주세요!");
					System.err.println(e.getMessage());
					e.printStackTrace();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
				return conn;
			}
	public static void close(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("conn.close 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {
			if(stmt!=null && !stmt.isClosed()) stmt.close();
			if(conn!=null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("stmt.close 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs!=null && !rs.isClosed()) rs.close();
			if(stmt!=null && !stmt.isClosed()) stmt.close();
			if(conn!=null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("rs.close 실패");
			e.printStackTrace();
		}
	}
}