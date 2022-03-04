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
public class EXEX {

	Scanner sc = new Scanner(System.in);
	//출력메세지
	System.out.println("3~100사이 정수를 입력하세요 : ");
	// 변수에 저장
	String str = sc.nextLine();
	//반복문
	char i = 0;
	String msg = "아닙니다.";
	char sosoo = str.charAt(0);
	for(i = 2 ; i < sosoo ; i--) {
		if((sosoo / i-1) == 0) {
			msg= "맞습니다.";
			
		}
			
	}
	System.out.println("입력하신 정수는 : " + str + " 이고, 이수는 소수가 " +
		msg	); 
	
	}

}
		
		
	