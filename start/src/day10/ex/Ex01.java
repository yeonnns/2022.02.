package day10.ex;
/*
 	문제1 ] 
 		다음 변수를 가지는 Student 클래스를 제작하세요.
 		전역변수
 		String name;
 		int ban, no, kor, eng, math;
 		
 		클래스를 만들고
 		Ex01 클래스에서 한명의 데이터를 입력해서 출력하기
 		5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고
 		
 		1. 한개의 함수 내에서 처리하기...
 		2. 기능별로 분리해서 함수 만들어서 처리...
 		
 		
 		보너스 ] 
 			int Rank,total;
 			double avg;
 			
 		
 */

public class Ex01 {
	// 변수선언
		String[] fname;
		int[] fban;
		int[] fno;
		int[] fkor;
		int[] feng;
		int[] fmath;
		
	// 전역변수
		Student[] five;

	public Ex01() {
		// 데이터 변수 셋팅
		setData();
		// 배열 완성
		setFive();
		// 출력
		toPrint();
		
	}
		// Studenet 배열 내용 출력해주는 함수
			public void toPrint() {
				for(int i = 0; i<five.length;i++) {
				String name = five[i].getName();
				int ban = five[i].getBan();
				int no = five[i].getNo();
				int kor = five[i].getKor();
				int eng = five[i].getEng();
				int math = five[i].getMath();
				
				System.out.println("이름 : " + name);
				System.out.println("반 : " + ban);
				System.out.println("번호 : " + no);
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("-----------------------------------");
				
				}
				
			}
	
			public void setFive() {
			// 데이터 기억할 공간 확보
			five = new Student[5];
			// 확보된 공간에 데이터 채워주기	
			for(int i = 0; i<five.length;i++) {
				five[i] = new Student();
			} 
			// 각 방의 객체에 데이터 채워주기
			for(int i = 0; i<five.length;i++) {
				Student s = five[i];
				
				s.setName(fname[i]);
				s.setBan(fban[i]);
				s.setNo(fno[i]);
				s.setKor(fkor[i]);
				s.setEng(feng[i]);
				s.setMath(fmath[i]);
			}	
			}
			// 각 데이터를 초기화 시켜주는 함수
			public void setData() {
			fname = new String[] {"김소연", "김희연", "김지연", "김호연", "김수연"};
			fban = new int[] {3, 1, 5, 7, 6};
			fno = new int[] {11, 3, 28, 25, 21};
			fkor = new int[] {85, 90, 70, 65, 85};
			feng = new int[] {90, 75, 85, 70, 65};
			fmath = new int[] {95, 80, 90, 55, 70};
		}

	public static void main(String[] args) {
		new Ex01();

	}

}
