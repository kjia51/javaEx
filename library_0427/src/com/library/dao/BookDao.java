package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {
	public List<Book> getList(){
		List<Book> list = new ArrayList<Book>();
		String sql = "SELECT no, title, author, (SELECT 대여여부 FROM 대여 WHERE 도서번호 = NO AND 대여여부 = 'Y') rentyn from book ORDER BY no";
		try(Connection conn = ConnectionUtil.getConnection();
		    Statement stmt = conn.createStatement();
				
			//stmt.executeQuery 의 반환 타입 resultset
			//stmt.executeUpdate의 반환 타입 int ( 몇 건 처리되었는지)
			ResultSet rs = stmt.executeQuery(sql);) {
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String rentyn = rs. getString(4);
				
			Book book = new Book(no, title, author, rentyn);
			list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public int insertBook(Book book) {
		int res = 0;
		String sql = String.format("insert into book values (SEQ_BOOK_NO.NEXTVAL,'%s','%s','%s')", book.getTitle(), book.getAuthor(), book.getRentyn());
		try {
			Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int deleteBook(int no) {
		int res=0;
		String sql = String.format("delete from book where no = %d", no);

		try {
			Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int rentYNBook(String rentyn, int no) {
		int res=0;
		String sql = String.format("update book set RENTYN = '%s' WHERE NO =%d", rentyn,no);
		try {
			Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	public String rentYNBook(int no) {
		String rentYN = "";
		String sql = String.format("select rentyn from book where no = %d",no);
		try {
			Connection conn = ConnectionUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				rentYN = rs.getString(1);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rentYN;
	}
	
	
}
