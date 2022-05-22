package day05.ex;

import java.util.Scanner;

/*
문제 7 ]
	5자리의 숫자를 입력한 후
	각자리의 수의 합을 구하는 프로그램을 작성하세요.

	힌트 ] 
		12345 % 10 -->마지막 자리만 꺼낸다 5
		1234 / 10 --> 1234
		  <----
 */


public class Ex07 {

	public static void main(String[] args) {
		//입력 도구 준비
		Scanner sc = new Scanner(System.in);
		//메세지 출력
		System.out.println("5자리 정수 입력하세요 : ");
		//출력값 저장할 변수 만들기
		int no = sc.nextInt();

		int sum = 0;
		int tmp = no;

		//반복해서 합 구하고
		for(int i=0; i<5; i++ ) {
			sum += tmp % 10;
			tmp = tmp / 10;
		}
		System.out.println("입력한 수 " + no + "의 각 자리수의 합은 " + sum);


	}

}
