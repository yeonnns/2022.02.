package day05.ex;
/*
 	문제1]
 	1 ~ 10 까지의 합을 구해서 출력해주는 프로그램을 작성하세요.
 	합은 결과값 변수로 만들어 처리하세요.
 */

public class Ex01 {

	public static void main(String[] args) {
		//결과값 만들기
		int total = 0;
		for(int i = 0; i < 10; i++) {
			total = total + (i + 1);
			
		}
		System.out.println("1~10까지의 합은" + total + " 입니다." );
		
		int gob = 1;
		for(int i = 0; i < 10; i++) {
			gob = gob * (i+1);
		}
		System.out.println("1~10까지의 곱은" + gob + " 입니다." );

	}

}
