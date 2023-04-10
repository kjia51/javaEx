package com.library.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	public static void main(String[] args) {
		System.out.println(DBUtil.getConnection());
	}
	public static Connection getConnection() {
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			
			conn.setAutoCommit(false); // false로 하게되면 일괄적으로 commit/rollback
		
		} catch (ClassNotFoundException e) {
			System.out.println("라이브러리를 확인해주세요");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void commit(Connection conn) {
		try {
			// null이면 nullpointexception 오류 발생 
			if(conn!=null && !conn.isClosed()) conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) conn.rollback();
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {
			if(stmt!=null && !stmt.isClosed()) stmt.close();
			if(conn!=null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection conn, Statement stmt, ResultSet res) {
		try {
			if(stmt!=null && !stmt.isClosed()) stmt.close();
			if(conn!=null && !conn.isClosed()) conn.close();
			if(res!=null && !res.isClosed()) res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
