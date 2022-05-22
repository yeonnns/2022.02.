package test.db;

import java.sql.*;
import java.util.Scanner;
public class GitJDBC {

	// 드라이버 로딩 설정
	public GitJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("-- 드라이버 로딩 성공 --");
		}
	}
	
	// 데이터 베이스 접속
	public Connection getCon() {
		Connection con = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "githrd";
		String pw = "12345";

		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
		}
		return con;
	}

	// 명령전달도구 만들기 PreparedStatment
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		// 회원번호 입력받기
		
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
		}
		return pstmt;
	}
	
	// 사용하지 않는 자원 반환
	public void close(Object o) {
		try {
			if (o instanceof Connection) {
				((Connection) o).close();
			} else if (o instanceof Statement) {
				((Statement) o).close();
			} else if (o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if (o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch (Exception e) {
		}
	}
}
