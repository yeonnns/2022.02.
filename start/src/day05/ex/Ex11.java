package day05.ex;
/*
문제 11 ]
	2x + 4y = 10 의 방정식의 결과를 출력하세요.
	단, x, y는 모두 
		0 <= x, y <= 10
	사이의 숫자이다.
*/

public class Ex11 {

	public static void main(String[] args) {
		//반복문 설정
		for(int i = 0; i >= 0; i++) {
			for(int j = 0; j <= 10; j++) {
				int result = 2*i + 4*j;
				if(result == 10) {
					System.out.println("2x + 4y = 10 방정식은 " + "x는 : "+ i + " , y는 :" + j);
					break;
				}
			}
		}


	}

}
