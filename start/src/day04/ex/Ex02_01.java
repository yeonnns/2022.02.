package day04.ex;
/*
 	문제 2 ] 문자를 임의로 랜덤하게 입력한 후 그 문자가 대문자이면 소문자로
 			소문자이면 대문자로 변환하고 만약 특수문자이면 그문자 그대로 출력하는 프로그램 작성하세요
 			3창 연산자 사용
 			"abcd".charAt(0) 첫번쨰 문자열 추출
 			((char)(ch + ('a' - 'A'))) 대문자 ---> 소문자
 			((char)(ch - ('a' - 'A'))) 소문자 ---> 대문자
 			
 */
import java.util.*;
public class Ex02_01 {
	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//메시지 출력
		System.out.println("문자 입력 : ");
		//입력받아서 문자열 저장
		String str = sc.nextLine();
		//문자열에서 문자 추출하고
		char ch = str.charAt(0);
		System.out.println("문자 : " + ch );
		//판별 (판별결과는 변수에 담아서 처리)
		/*
		 	숫자 A - Z - 특수문자 - a ~ z - 특수문자
		 */
		char result = 0;
		if(ch < 'A') {
			result = ch;
		}else if(ch <= 'Z') {
			result = (char)(ch + ('a' - 'A'));
		}else if(ch < 'a') {
			result = ch;
		}else if(ch <= 'z') {
			result = (char)(ch - ('a' - 'A'));
		}else

		System.out.println("입력한 문자 : " + ch);
		System.out.println("변환된 문자 : " + result);
				
	}

}
