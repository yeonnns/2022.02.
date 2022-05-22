package day05;
//전체 drag 후  tab 키		     왼쪽으로 보내기
//  		shift + tab 키 오른쪽으로 보내기  
/*
 	나이를 입력받아서
 	 유년기 : ~ 9
  	 10대 : 10 ~ 19
 	 20대 
 	 30대
 	 40대 : 40 ~ 49
 	  장년층 : 50 ~
 	으로 구분해서 출력하세요.
*/
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 조건이 여러가지인 경우는 if ~ else if 구문으로 처리하는 것이 편하다.
		
		// 입력도구 준비하기
		Scanner sc = new Scanner(System.in);
		// 메세지 출력하기(숫자로 기억)
		System.out.println("나이 입력 : ");
		// 입력받아 변수에 기억
		int age = sc.nextInt();
		//	결과 변수 만들기
		String sage = "장년층";
		//판별해서 결과 기억 (조건 줄때 좁은 범위부터)
		if(age >= 50 ) {
			
		}else if(age < 10) {
			sage = "유년기";
		}else if(age < 20) {
			sage = "10대";
		}else if(age < 30) {
			sage = "20대";
		}else if(age < 40) {
			sage = "30대";
		}else if(age < 50) {
			sage = "40대";
		}
		//결과 출력하기
		System.out.println("입력나이  " + age + " 는 " + sage + " 입니다.");

	}

}
