package day05.ex;
/*
문제 10 ]
	주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
*/

public class Ex10 {

	public static void main(String[] args) {
		// 반복문 설정
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				int result = i + j;
				if(result == 6) {
					System.out.println("1번 주사위 : " + i + " 2번 주사위 : " + j);
				}
			}
		}
		// 판별(주사위 합 6)
		
		// 출력 
	}

}
