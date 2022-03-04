package day04.ex;

/*
 	문제  1] 1~25의 숫자 3개를 랜덤하게 발생 시켜서 그 수들중
 			가장 큰 수만 출력하는 프로그램을 작성하세요. if구문 사용
 */

public class Ex01_01 {
	public static void main(String[] args) {
	//랜덤하게 숫자 3개 만들기
		//(int)(Math.random()*(큰수-작은수+1)+작은수);
	int no1 = (int)(Math.random()*25+1);
	int no2 = (int)(Math.random()*25+1);
	int no3 = (int)(Math.random()*25+1);
	//if문 만들기
	int result = no3;
	if(no1 >= no2 && no1 >= no3) {
		result = no1;
	}else if (no2 >= no3) {
		result = no2;
	}
	//가장 큰 수 판별해서 정수에 담는다.

	System.out.println("no1 : " + no1);
	System.out.println("no2 : " + no2);
	System.out.println("no3 : " + no3);
	System.out.println("제일 큰 수 : " + result);
	
	}

}
