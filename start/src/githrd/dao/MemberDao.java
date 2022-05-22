package githrd.dao;


import java.sql.*;
import java.util.ArrayList;

import githrd.db.JenyJDBC;
import githrd.sql.*;
import githrd.vo.*;


public class MemberDao {
	private JenyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;
	
	public MemberDao() {
		// 오라클 드라이버 연결
		db = new JenyJDBC();
		mSQL = new MemberSQL();
	}
	
	// 회원번호 id 조회해서 반환해주는 함수 
	public ArrayList<MemberVO> getMno() {
		// 반환값변수
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		// 데이터베이스 접속 커넥션
		con = db.getCon();
		// 질의명령
		String sql = mSQL.getSQL(mSQL.SEL_MNOID);
//		System.out.println("sql : " + sql);
		// 명령 전달도구 준비
		stmt = db.getStmt(con);
		
		// 질의명령 보내고 결과받기
		try {
			rs = stmt.executeQuery(sql);
			// 데이터 추출
			while(rs.next()) {
			// 한명의 데이터를 저장할 VO를 new 시키고
			MemberVO mVO = new MemberVO();
				
			// 데이터 꺼내고
			int mno = rs.getInt("mno");
			String id = rs.getString("id");
			
			// vo에 채우기
			mVO.setMno(mno);
			mVO.setId(id);
			
			// 리스트에 채우기
			list.add(mVO);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return list;
	}
	
	// 회원번호[1001]를 입력하면 해당 회원의 정보를 출력해주는 함수
	public ArrayList<MemberVO> getMnoList(int mno){
		// 반환값 변수
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		// 커넥션 가져오고
		con = db.getCon();
		// 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_MNOINFO);
		
		// 명령전달도구 준비
		pstmt = db.getPstmt(con, sql);
		
		try {
			// 질의명령 완성하고
			pstmt.setInt(1, mno);
			// 질의명령 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 데이터 꺼내고
			while(rs.next()) {
				// 한명분 데이터 저장할 VO 만들고
				MemberVO mVO = new MemberVO();
				// 데이터 꺼내서 채우고
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setPw(rs.getString("pw"));
				mVO.setMail(rs.getString("mail"));
				mVO.setTel(rs.getString("tel"));
				mVO.setAno(rs.getInt("avt"));
				mVO.setGen(rs.getString("gen"));
				mVO.setJoindate(rs.getDate("joindate"));
				
				list.add(mVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return list;
	}

	// ID 를 입력 해서 해당회원의 전화번호(010-1212-1212)를 수정해주는 함수
	public int getUpTel(MemberVO mVO){
		// 커넥션 연결
		int cnt = 0;
		con = db.getCon();
		// 질의명령가져오기
		String sql = mSQL.getSQL(mSQL.SEL_UPTEL);
		// 명령전달도구
		pstmt = db.getPstmt(con, sql);
		
		try {
			// 질의명령 완성하기
			String tel = mVO.getTel();
			String id = mVO.getId();
			
			pstmt.setString(1, tel);
			pstmt.setString(2, id);
			
			cnt = pstmt.executeUpdate();
			System.out.println("### 전화번호 수정 완료###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	// 회원정보 입력 받아서 회원가입 처리..?
	public int insertInfo(MemberVO mVO) {
	// 반환값 변수
	int cnt = 0;
	con = db.getCon();
	String sql = mSQL.getSQL(mSQL.SEL_INSERTINFO);
	pstmt = db.getPstmt(con, sql);
		
	try {
		//질의명령 완성하기
		int mno = mVO.getMno();
		String name = mVO.getName();
		String id = mVO.getId();
		String pw = mVO.getPw();
		String mail = mVO.getMail();
		String tel = mVO.getTel();
		int ano = mVO.getAno();
		
			
		pstmt.setInt(1, mno);
		pstmt.setString(2, name);
		pstmt.setString(3, id);
		pstmt.setString(4, pw);
		pstmt.setString(5, mail);
		pstmt.setString(6, tel);
		pstmt.setInt(7, ano);

		
		
		cnt = pstmt.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		db.close(pstmt);
		db.close(con);
	}
			
	return cnt;	
	
	}
	
	}
	
