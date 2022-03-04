package day05.ex;

/*
 	문제 3 ]
 	문자열을 입력받아서 문자를 한글자씩 추출해서 출력하세요.
 	문자열 길이를 알아내는 방법 
 		int 변수 = 문자열.length();
 */
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ex03 {

	public static void main(String[] args) {
	
		//문자열 입력받아서 기억
		String str = JOptionPane.showInputDialog("문자열을 입력하세요!");
		//입력받은 문자열 길이 알아내기
		int len = str.length();
		//길이만큼 반복해서 한글자씩 출력
		for(int i = 0; i < len ; i++) {
			//문자열 위치 반환 
			char ch= str.charAt(i);
			/*
			 	문자를 문자열로 변환시키는 방법
			 	문자 + "";
			 */
			//공백도 문자라 출력 됨.
			System.out.println((i+1) + " 번째 문자 : [" + ch + "]");
		}
		

	}

}
