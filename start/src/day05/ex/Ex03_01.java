package day05.ex;

/*
문제 03_01 ]
	
	0 ~ 255 사이의 정수를 10개를 랜덤하게 만들고
	그 정수를 아스키 코드값으로 하는 문자열을 만들어서
	만들어진 문자열의 문자를 하나씩 추출해서
	추출한 문자가 
		대문자인지 소문자인지 특수문자인지를
	출력하는 프로그램을 작성하세요.
	
	참고 ]
		문자열의 길이를 알아내는 방법
			
			int 변수 = 문자열.length();
*/

public class Ex03_01 {

	public static void main(String[] args) {
		// 정수 랜덤하게 만들기(반복문)
		for(int i = 0; i<10;i++) {
			int nu = (int)(Math.random()*255+1);
			char num = (char)nu;
		
			
			if (num>='A' && num <= 'Z') {
				System.out.println("대문자"+num);
			}else if(num>='a' && num <= 'z') {
				System.out.println("소문자"+num);
			}
			System.out.println("특수문자"+num);
		}
		
		

	}

}
