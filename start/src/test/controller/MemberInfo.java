package test.controller;

import java.util.ArrayList;
import java.util.Scanner;

import test.dao.MemberDao;
import test.vo.MemberVO;

public class MemberInfo {
	private MemberDao mDao;
	
	public MemberInfo() {
		mDao = new MemberDao();
		
		// 회원번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("회원번호를 입력하세요!");
		int mno = 0;
		
		try {
			mno = sc.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		// 부서 입력해서 부서원들의 정보 조회
		MemberVO mVO = mDao.getInfo(mno);
		System.out.println(mVO.getId() + mVO.getName() + mVO.getMail());
	}

		public static void main(String[] args) {
			new MemberInfo();
	}

}
