package day05;
/*
 	구구단 7단 출력하세요.
 */

public class Test07 {

	public static void main(String[] args) {
		//변수 만들기
		int dan = 7;
		//반복문 설정
		for(int i = 0 ; i < 9 ; i++) //0~9까지 
			System.out.println(dan + " X " + (i+1) + " = " + (dan * (i + 1)));
	}

}
