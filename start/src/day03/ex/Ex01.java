package day03.ex;

/*
 	문제 1] 
 			두개의 숫자를 입력받은 후(가로,세로)
 			그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구해서 
 			결과를 출력하세요.
 			
 			출력형식 ] 
 			가로 : XXXXX
 			세로 : XXXXX
 			사각형 넓이 : XXXXX 가로 x 세로
 			삼각형넓이: XXXXX.X 밑변 X 높이 x 1/2
  */

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//입력 메세지 출력
		System.out.print("가로 : ");
		
		//String garo = sc.nextLine(); // 문자열로 입력받는 방법
		
		/*
		 	정수형태의 문자열을 정수로 변환하는 방법
		//integer.parseint(문자열);
		int width = Integer.parseInt(garo);
		*/
		
		/*
		  	정수로 입력받는 방법
		int 변수이름 = sc.nextInt();
		*/
		
		//가로 입력받기
		int width = sc.nextInt();
		
		System.out.println("가로 : " + width);
		
		System.out.print("세로 : ");
		//세로 입력받기
		int sero = sc.nextInt();
		
		System.out.println("세로 : " + sero);
		
		int square = width * sero;
		double triangle = width * sero / 2.;
		
		
		
		System.out.println("사각형 넓이 : " + square);
		System.out.println("사각형 넓이 : " + triangle);
		
		
		
		
		
		
//		System.out.println("입력된 가로 : " + garo); //문자열
//		System.out.println("입력된 가로 : " + (garo + 20));
//		System.out.println("입력된 정수 가로 : " + width);
//		System.out.println("입력된 정수 가로 : " + (width + 20));
	
		
	}

}
