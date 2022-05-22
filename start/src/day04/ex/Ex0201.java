package day04.ex;



/*
 	 1.s
 	 알파벳을 입력받아서 그문자가
 	 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요.
 	 
 	 2.
 	 숫자 또는 알파벳을 입력받아서
 	 그 문자가 숫자인지 대문자인지 소문자인지를 판별하는 프로그램을 작성하세요
 	 	A - Z - 특수문자 - a ~ z - 특수문자
 */
import java.util.Scanner;

public class Ex0201 {

	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//메세지 출력
		System.out.println("문자열을 입력 하세요 : ");
		//입력 받은 문자열 저장
		String str = sc.nextLine();
		//문자열에서 문자 추출
		char ch = str.charAt(0);
		System.out.println("입력된 문자 : " + ch);
		//판별
		String result = (ch >= 'A' && ch <= 'Z') ? ("대문자") : ("소문자");
		//결과 출력
		System.out.println("변환된 문자 : " + result);

		

	}

}
