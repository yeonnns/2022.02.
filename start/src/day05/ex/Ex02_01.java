package day05.ex;


/*
Ex02_01 ]
	3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
	단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
*/

public class Ex02_01 {

	public static void main(String[] args) {
		// 랜덤숫자 만들기
		int i = 0;
		int num = (int)(Math.random()*(10-3+1)+3);
		System.out.println(num);
		
		
	for(i = 0; i<num; i++) {
		if(i == 0) {
		char alp = (char)(Math.random()*('Z'-'A'+1)+'A');	
			System.out.print(alp);
		}char alp = (char)(Math.random()*('z'-'a'+1)+'a');
		System.out.print(alp);
	}
	}
}


	


