package day13;
/*
 	25를 -3에서 3까지의 정수로 나눈 결과를 출력하는 프로그램을 작성하세요.
 	필요하면 예외처리도 하세요.
 */

public class Test04 {
	public Test04() {
		int no = 25;
		int result = 0;
		
		for (int i = -3; i<=3;i++) {
			try {
				result = no / i;
			}catch(Exception e) {
				System.out.println("예외발생 ] 0으로 나누는 연산을 시도합니다.");
				result = no;
			}
			System.out.println(no + " 를 " + i + " 로 나눈 결과는 " + result + "입니다.");
		}
	}
	

	public static void main(String[] args) {
		new Test04();

	}

}
