package day09.ex;
/*
 	문제 2]
 		랜덤하게 입력 받은 반지름으로
 		원의 넓이
 		원의 둘레
 		를 계산해서 
 		출력하는 프로그램을 작성하세요.
 		
 		반지름 랜덤하게 만들어주는 함수
 		넓이 계산 함수, 둘레 계산 함수, 출력을 해주는 함수
 		를 각각 만들어서 작성하세요.
 */

public class Ex02 {
	public Ex02() {
		double ban = setPi();
		double nresult = setNull(ban);
		double dresult = setdull(ban);
		toPrint( ban,  nresult,  dresult);
		
	}

	public static void main(String[] args) {
		new Ex02();

	}
	// 랜덤하게 반지름 입력받기
	public double setPi(){
		double ban = (int)(Math.random()*10+1);
		return ban;
	}
	// 넓이 계산해주는 함수
	public double setNull(double ban) {
		return ban*ban*3.14;
		
	}
	// 둘레 구해주는 함수
	public double setdull(double ban) {
		return 2*3.14*ban;
	}
	// 출력
	public void toPrint(double ban, double nresult, double dresult) {
//		double pi = ban;
//		double nresult = setNull(ban);
//		double dresult = setdull(ban);
		
		System.out.println("원의 반지름 : " + ban + " 넓이는 " + nresult 
				+ " 둘레는 " + dresult + " 입니다.");

	}

}
