package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCEx {

	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "orauser";
	String pw = "1234";
	Connection conn;
	
	public static void main(String[] args) {
		JDBCEx jdbc= new JDBCEx();
//		jdbc.insert();
		jdbc.delete();
		jdbc.update();
		
		
	}
	
	public void insert() {
		Connection conn;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		// 클래스 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			Statement stmt = conn.createStatement();
			
			// 몇건이 처리되었는지 반환
			int res = stmt.executeUpdate("insert into book values (9,'제목1', '저자1', 'Y', SYSDATE, NULL)");
			
			System.out.println(res+"건이 처리되었습니다.");
			
			stmt.close();
			conn.close();
		}catch (ClassNotFoundException e) {
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void delete() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션을 얻어오기 위해 필요한 정보
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("오토커밋 false설정");
			conn.setAutoCommit(false);
			// 쿼리 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 몇 건이 처리 되었는지 반환
			// 쿼리 실행
			int res = stmt.executeUpdate("delete from book");
			
			System.out.println(res+"건이 처리 되었습니다");
			conn.rollback();
			System.out.println("롤백 되었습니다");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("오토커밋 false설정");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			
			int res = stmt.executeUpdate("update book set author='저자6' WHERE author='저자2'");
			System.out.println(res+"건이 업데이트 처리 되었습니다");
			conn.rollback();
			System.out.println("롤백 되었습니다");
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc라이브러리를 확인해주세요                                ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getList() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn;
		// 클래스 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);

			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from book");
			List<Book> list = new ArrayList<>();
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editdate = rs.getDate(6);
				
				Book book = new Book(no, title, author, isRent, regdate, editdate);
				list.add(book);
				
			}

			for(Book book : list) {
				System.out.println(book.toString());
			}
			
			// 컬럼의 이름이나 순서로 가져올 수 있음
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			
				
			} catch (SQLException e) {
			e.printStackTrace();
		} 
		}
		// 커넥션 얻어오기
		// 쿼리 실행 객체 생성하기
		// 쿼리 실행후 결과집합 받아오기
		
		
	
	public void connection() {
		try {
			// 데이터 베이스 접근시 필요한 정보
			// ip, port, sid, 계정정보, 비밀번호
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				// 커넥션 얻어오기
				conn=DriverManager.getConnection(url, id, pw);
				System.out.println("커넥션 얻기 성공" + conn);
				// 쿼리 실행시 필요한 객체
				Statement stmt = conn.createStatement();
				
				
				
				//데이터 조회
				//ResultSet 결과 집합
				ResultSet rs = stmt.executeQuery("select count(*) from book");
				rs.next();
				System.out.println("조회결과 : " + rs.getString(1));
				
				rs.close();
				stmt.close();
				conn.close();
				
				//데이터 생성, 수정, 삭제
//				stmt.executeUpdate("");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
