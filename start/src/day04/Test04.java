package day04;

/*
 	정수를 입력 받아서 짝수인지 홀수인지를 판별하세요
 	단, 0은 짝수로 간주
 */

import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//입력 메시지 출력
		System.out.print("정수 입력 : ");
		//입력 받아서 변수에 기억
		int num = sc.nextInt();
		//짝수인지, 홀수인지 판별
		String result = (num % 2 == 0) ? ("짝수") : ("홀수");
		//출력
		System.out.println("입력받은 숫자 [ " + num + " ] 은 '" 
		+ result + "' 입니다."); 
		

	}

}
