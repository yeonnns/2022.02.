package day07;
/*
 	10개의 문자를 기억 할 배열을 만들고
 	'A' - 'j'까지 차례로 입력하고 출력하세요.
 	
 */

import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		/*
		 	char[] ch;
		 	ch = new char[10]
		 	
		 */
		
		//각방에 차례로 접근해서 하나씩 문자를 채워준다. (A~J)
		for(int i = 0; i<ch.length;i++) {
			//문자 만들기
			char munja = (char)('A' + i); //문자(2) + 숫자(4) ->숫자로 변형돼서 강제형변환
			//만들어진 문자를 배열에 채워넣는다
			ch[i] = munja;
			
		}
		
		System.out.println(Arrays.toString(ch));
		
		for(char munja : ch) {
			System.out.print(munja + " | ");
		}
			
		
		
		
		
		
		
		
	}

}
