package day03.ex;

import java.util.Scanner;

/*
 	문제 2 ]
 		하나의 숫자를 입력받은 후(원의 반지름)
 		그 숫자를 이용해서 원의 넓이(r*r*3.14)와 둘레(2*r*3.14)를 계산하고 출력하세요(실수형식).
 */
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		
		double r = sc.nextDouble();
		double area = r*r*3.14;
		double circum = 2*r*3.14;
		
		

		System.out.println("입력된 실수 반지름 : " + r );
		System.out.println("원의 넓이 : " + area);
		System.out.println("원의 둘레 : " + circum);
		
		
		
		
		

	}

}
