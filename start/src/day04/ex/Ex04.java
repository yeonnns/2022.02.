package day04.ex;
/*
 	문제 4 ] 1000 ~ 3000 사이의 숫자를 랜던하게 발생시켜서 이숫자를 년도로 하는 해는
 			윤년인지 평년인지를 판별해서 출력해주는 프로그램을 작성하세요.
 			(윤년은 4로 나누어 떨어지고 100으로 떨어지면 안되고 400으로 나누어 떨어지는 해)
 			
 			윤년 / 4 = 0
 			윤년 / 100 !=100 else 윤년 = 400
 			
 			
 */
public class Ex04 {
	public static void main(String[] args) {
		//랜덤 숫자만들기
		int no = (int)(Math.random()*(3000 - 1000 + 1 ) + 1000);
		System.out.println(no);
		//판별
		String result = (no % 4 == 0) ? ((no % 100 != 0)? ((no % 400 == 0) ? "윤년": "평년" ) : "평년") :("평년") ;
		System.out.println(no + " 해당년도는 " + result + "입니다.");

	}

}
