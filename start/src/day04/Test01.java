package day04;

/*
 	정수 하나를 입력받아서
 	이 수가 0인지 홀 수 인지 짝수 인지 판별하세요.
 	조건문]
 		if(조건식){ 조건식이 참일 경우 실행하는 부분
 			실행내용
 		}
 */

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//입력 받기전 입력 메세지 출력
		System.out.println("정수 입력 : ");
		//입력받아서 정수를 변수에 기억
		int num = sc.nextInt();
		//조건에 따라서 판별
		String soo = "[영]";
		if(num % 2 !=0) { // num % 2 == 1
			soo = "홀수";
		}
		if(num != 0 && num % 2 ==0) {
			 soo = "짝수";
		}
		//내용 출력
		System.out.println("입력받은 정수 " + num + " 은/는 " + soo + "입니다.");
	}

}
