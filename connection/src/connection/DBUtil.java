package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	/**
	 * db커넥션은 생성하여 반환합니다.
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		// 데이터 베이스 접근시 필요한 정보 : ip, port, sid, 계정정보, 비밀번호

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			// 롤백하지 않고 커넥션이 종료되면 커밋됩니다

		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
		return conn;
	}
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
		}
	}
	
	public static void closeConnection(ResultSet rs,Statement stmt, Connection conn ) {

		try {
			

			
			if(rs!=null && !rs.isClosed()) rs.close();
			if(stmt !=null && !stmt.isClosed()) stmt.close();
			if(conn !=null && !conn.isClosed()) conn.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	public static void closeConnection(Connection conn, Statement stmt) {

			try {

				if(conn!=null && !conn.isClosed()) conn.close();
				if(stmt!=null && !stmt.isClosed()) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

	

