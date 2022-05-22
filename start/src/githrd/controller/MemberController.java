package githrd.controller;

import java.sql.Date;
import java.util.ArrayList;


import githrd.dao.*;
import githrd.vo.*;

public class MemberController {
	private static final String MemberVO = null;
	private MemberDao mDao;
	public MemberController() {
		mDao = new MemberDao();
	

	// 회원번호 ID조회
	ArrayList<MemberVO> idlist = mDao.getMno();
	mnoIdPrint(idlist);
	System.out.println();
	
	// 회원번호  1001 입력해서 조회
	ArrayList<MemberVO> mlist = mDao.getMnoList(1001);
	mnoPrint(mlist);
	System.out.println();
	
//	// 전화번호 수정
//	MemberVO mVO = new MemberVO();
//	upTel();/* MemberVO new 시키고 데이터 채워서 입력*/
//	
//	// 신규가입등록
//	MemberVO mVO1 = new MemberVO();
//	insert();
	
	}
	
	
	
	// 회원번호와 ID를 조회해서 출력해주는 함수
	public void mnoIdPrint(ArrayList<MemberVO> list) {
		System.out.println("### 회원번호 id 출력");
		System.out.println("-------------------------------------------------------------------------------------------");
		for(MemberVO m : list) {
			System.out.println(m.getMno() + " - " + m.getId());
		}
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	// 회원번호[1001]를 입력하면 해당 회원의 정보를 출력해주는 함수
	public void mnoPrint(ArrayList<MemberVO> list) {
		System.out.println("### 회원번호 정보 출력");
		System.out.println("-------------------------------------------------------------------------------------------");
		for(MemberVO m : list) {
			System.out.println(m.getMno() + " | " + m.getName() + " | " + m.getId() + " | " + m.getPw() + " | " + m.getMail() + " | " + m.getTel() + " | " + m.getAno() + " | " + m.getGen() + " | " + m.getJoindate());
			}
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	
	// ID 를 입력 해서 해당회원의 전화번호(010-1212-1212)를 수정해주는 함수
	public void upTel() {
		String tel = "010-1212-1212";
		String id = "rose";
		// vo 만들기
		MemberVO mVO = new MemberVO();
		
		mVO.setTel(tel);
		mVO.setId(id);
		
		int result = mDao.getUpTel(mVO);
		if(result == 1) {
			System.out.println("*** " + tel + " 로 전화번호 변경에 성공했습니다.");
		} else {
			System.out.println("###### " + tel + " 로 전화번호 변경에 실패했습니다.");
		}
		
	}
	
	
	
	// [★선택] Scanner로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	public void insert() {
	int mno = 2001;
	String name = "소연";
	String id = "ssy";
	String pw = "yyyys";
	String mail = "sss03418@naver.com";
	String tel = "010-1234-5432";
	int ano = 15;

	
	MemberVO mVO = new MemberVO();
	
	mVO.setMno(mno);
	mVO.setName(name);
	mVO.setId(id);
	mVO.setPw(pw);
	mVO.setMail(mail);
	mVO.setTel(tel);
	mVO.setAno(ano);

	
	int result = mDao.getUpTel(mVO);
	if(result == 7) {
		System.out.println(mno + " - " + name + " - " + id + " - " + pw 
				+ " - " + mail + " - " + tel + " - " + ano 
				+ " 로 회원가입되었습니다.");
	} else {
		System.out.println("##### 회언가입에 실패하였습니다. #####");
	}
	}
	
	/* 회원리스트 꺼내 오는데  한페이지당 3명의 아이디 , 메일, 가입일 을 리스트 형식으로 보여준다.
		그중에서 한명이 아이디를 입력하면 
		그 회원의 상세데티러를 보여주는 기능을 구현하세요.
		
		한페이지당 보여주는 리스트의 갯수는 3개로 하고
		한페이지당 보여지는 페이지수는 3개
		이전.다음 페이지 로 이동
		
	
	*/
	
	public static void main(String[] args) {
		new MemberController();
	}
	
	

}
