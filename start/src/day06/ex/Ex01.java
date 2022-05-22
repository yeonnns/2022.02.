package day06.ex;

import java.util.Scanner;

/*
문제 1 ]
	3 ~ 100 사이의 정수를 입력받아서
	이 정수가 소수인지 판단하는 프로그램을 작성하세요.
 	17/23456789 == 0소수
	참고 ]
		소수
			1 과 자신 으로만 나누어지는 수
			
보너스 ]
	3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
*/

public class Ex01 {

	public static void main(String[] args) {
		// 입력 도구 
		Scanner sc = new Scanner(System.in);
		//출력메세지
		System.out.println("3~100사이 정수를 입력하세요 : ");
		// 변수에 저장
		int num = sc.nextInt();
		//반복문
		String msg = "아닙니다.";
		loop1:
		for(int i = 2 ; i < num-1 ; i++) {
		 if ((num % i) != 0) 
				msg = "맞습니다.";
		 		break loop1;
			}
				
		
		System.out.println("입력하신 정수는 : " + num + " 이고, 이수는 소수가 " +
			msg	); 
		
		

	}

}
