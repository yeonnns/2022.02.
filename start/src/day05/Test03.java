package day05;

/*
 	정수를 입력받아서 
 	그 숫자가 짝수인지 홀수인지 판별해서 출력하세요.
 	단, 0인경우는 0으로 출력하세요.
 */
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		//입력 받을 준비
		Scanner sc = new Scanner(System.in);
		//입력메세지 출력
		System.out.print("정수 입력 : ");
		//입력받아서 변수에 기억
		int no = sc.nextInt();
		//제어문 시작 전 변수 미리 만들기 (계속 사용 가능)
		String result = "정수";
		
		if(no == 0) {
			// no가 0인 경우
			result = "0";
		}else {
			// no가 0 이 아닌 경우
			if(no % 2 == 0) {
				//짝수인 경우
				result = "짝수";
			}else
				//홀수인 경우
				result = "홀수";
		}
		System.out.println("입력한 정수 " + no + " 은 " + result + " 입니다.");
	}

}
