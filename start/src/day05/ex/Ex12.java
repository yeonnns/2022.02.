package day05.ex;

import java.util.Scanner;

/*
문제 12 ]
	5자리 숫자 하나를 입력받아서 
	이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
	
	참고 ]
		회문수란?
			첫번째 자리수와 마지막 자리수
			두번째 자리수와 마지막에서 두번째 자리수
			...
			가 동일한 수를 말한다.
*/
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력하세요. : ");
		String str = sc.nextLine(); // 문자열 저장(문자열 뽑아 쓰기 위해서)
		System.out.println(str);
		//변수 선언
		int i = 0;
		int result = 0;
		String msg = "아닙니다.";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		for(i= 5; i>3; i--) {
			if(ch1 == str.charAt(i-1)){
				if(ch2 == str.charAt(i-2))
				result++;
				
			}
			if(result == 1) {
				msg = "맞습니다.";
			}

		}
		System.out.println("입력하신 숫자 " + str +" 은 회문수가 " + msg);
		

	}

}
