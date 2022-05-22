package test.dao;

import java.sql.*;
import java.util.ArrayList;

import test.vo.*;
import test.db.*;
import test.sql.*;

public class MemberDao {
	private GitJDBC db;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private MemberSQL mSQL;

	public MemberDao() {
		db = new GitJDBC();
		mSQL = new MemberSQL();
	}
	
	// 회원번호 입력받아서 아이디 , 이름, 메일 조회해주는 함수
	public MemberVO getInfo(int mno) {
		// 반환값 저장 할 변수
		MemberVO mVO = new MemberVO();
		// 커넥션 가져오기
		con = db.getCon();
		// 질의명령 가져오기
		String sql = mSQL.getSQL(mSQL.SEL_MEMBER_INFO);
		// 명령전달도구 준비
		pstmt = db.getPSTMT(con, sql);

		try {
			pstmt.setInt(1, mno);
			rs = pstmt.executeQuery();
			rs.next();
			String id = rs.getString("name");
			String name = rs.getString("name");
			String mail = rs.getString("name");
					
					
			mVO.setId(id);
			mVO.setName(name);
			mVO.setMail (mail);

		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}

		return mVO;
	}
}
