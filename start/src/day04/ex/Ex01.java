package day04.ex;

/*
 	문제  1] 1~25의 숫자 3개를 랜덤하게 발생 시켜서 그 수들중
 			가장 큰 수만 출력하는 프로그램을 작성하세요. 3창 연산자 사용
 */

public class Ex01 {
	public static void main(String[] args) {
	//랜덤하게 숫자 3개 만들기
		//(int)(Math.random()*(큰수-작은수+1)+작은수);
	int no1 = (int)(Math.random()*25+1);
	int no2 = (int)(Math.random()*25+1);
	int no3 = (int)(Math.random()*25+1);
	
	//보너스 문제 : -100 ~ 100 사이에 점수를 랜덤하게 발생시켜보세요.
	int no4 = (int)(Math.random()*(100-(-100)+1)+(-100));
	System.out.println("no4 : " + no4);
	
	//가장 큰 수 판별해서 정수에 담는다.
	int result = (no1 > no2) ? ((no1 > no3) ? no1 : ((no3 > no2) ? no3 : no1))
			: ((no2>no3) ? no2:no3);
	//출력하기
	/*	[ \ ] 를 이스케이프문자 라고 부른다. 
	  		==>
		\" 문자열 내에 " 를 표현
		\n 줄바꿈
		\r 커서 한줄 내림?
		\t tab을 표현
		\b backspace
	*/
	System.out.println("no1 : " + no1);
	System.out.println("no2 : " + no2);
	System.out.println("no3 : " + no3);
	System.out.println("제일 큰 수 : " + result);
	
	}

}
