package day05.ex;

public class Ex02 {
	/*
	  문제 2 ]
	 	'A' 부터 문자를 10개 출력 하세요.
	 */

	public static void main(String[] args) {
		//변수 만들기 
//		char alp = 'A';
//		//반복문 설정
//		for(int i = 0; i<10; i++) {
//			char result = (char)(alp + i);
//			System.out.print(result + " ");
//		}
		
		System.out.println();
		for(int i = 0; i < 10; i++) {
			char ch = (char)(Math.random()*('Z' - 'A' + 1) + 'A');
			System.out.print(ch + " ");	
		}
		
		System.out.println();
		int i = 0 ;
		for( i = 0 ; i < 10; i++ ) {
			char ch = 'A';
			System.out.print((char)(ch + i) + " ");
		}
			
	}

}

