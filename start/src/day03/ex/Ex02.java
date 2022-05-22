package day03.ex;
// import java.util.*; 이렇게 사용할 클래스의 경로를 지정하면 java.util. 
// 패키지 하위에 바로 속한 클래스만 사용할 준비를 하게 된다. Scanner 사용 
// import java.sql.Date;
import java.util.Scanner;

/*
 	문제 2 ]
 		하나의 숫자를 입력받은 후(원의 반지름)
 		그 숫자를 이용해서 원의 넓이(r*r*3.14)와 둘레(2*r*3.14)를 계산하고 출력하세요(실수형식).
 */
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		//입력 도구 준비 (입력 받기 위해서) System.in <- 외부 장치에 연결된 통로. 빨대 역활
		Scanner sc = new Scanner(System.in);
		//입력 받기 전에 메세지 출력
		System.out.print("원의 반지름 : ");
		//입력 받기 (변수에 기억 시키기)
		double r = sc.nextDouble();
		//계산
		double pi = 3.14;
		double area = r*r*pi;
		double circum = 2*r*pi;
		
		
		//출력
		System.out.println("입력된 실수 반지름 : " + r );
		System.out.println("원의 넓이 : " + area);
		System.out.println("원의 둘레 : " + circum);
		
		int intarea = (int)area;
		System.out.println(intarea);
		int intcircum = (int)circum;
		System.out.println(intcircum);
		
		
		

	}

}
