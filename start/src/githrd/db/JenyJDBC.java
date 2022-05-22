package githrd.db;
/*
 	이 클래스는 제니 계정으로 데이터베이스 작업을 할 경우 필요한 드라이버 로딩 하는 작업,
 	커넥션과 스테잍트 먼트를 필요할떄 반환해주는 기능을 가지고있는 클래스
 	@author 김소연
 	@since 22.04.15
 	@version v.1.0
 */

import java.sql.*;
public class JenyJDBC {

	public JenyJDBC() {
		
	// 이 클래스가 new될때 드라이버 로딩이 되게 처리한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("#########드라이버 로딩 실패#########");
		}
	}
	// 데이터베이스 작업을 위해 접속이 필요한경우 커넥션 만들어서 반환해주는 함수
	
	public Connection getCon() {
		Connection con = null;	// null초기화 하는 이유 : return에서 반환해줄게 없어서 오류나므로, null로 초기화해준다.
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //드라이버타입@?s로컬번호xe
		String user= "jennie";
		String pw = "12345";
		
		try {
			con= DriverManager.getConnection(url,user,pw);
		}catch(Exception e) {}
		
		return con;
			 
	}
	// 오버로딩 (함수이름같음, 매개변수 다름, 반환값다를수 있음ㄴ)
	public Connection getCon(String user, String pw) {
		Connection con = null;
		
		String url = "jdbc:oracle:thin@localhost:1521:xe"; 
		
		try {
			con= DriverManager.getConnection(url,user,pw);
		}catch(Exception e) {}
		return con;
	}
	
	// 명령전달도구가 필요하면 statement 준비해서 반환해주는 함수
	public Statement  getStmt(Connection con) {
		Statement stmt = null;
		try {
			// 양방향 이동 가능한 resultSet
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
		}catch(Exception e) {}
		return stmt;
	}
	//PreparedStatement 오버로딩
	public PreparedStatement  getPstmt(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			// 양방향 이동 가능한 resultSet
			pstmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
		}catch(Exception e) {}
		return pstmt;
	}
	// 사용하지 않는 자원 반환해주는 함수(모든거 받는 object)
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
			//입력된 데이터가 커넥션이냐?
			((Connection) o).close();
			// (Connection) o.close(); ==> o의 멤버중close() 함수를 호출한 결과를 Connection로 강제 형변환 으로 해석됨 [가로 필수]
			}else if(o instanceof Statement) {
				((Statement) o).close();
			}else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {}
	}
}
