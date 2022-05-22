package day08;

import java.util.Arrays;

/*
 	정수 5개를 기억할 배열을 만들고
 	데이터를 채워둔 후
 	1번 방부터 3번방까지 데이터만 
 	다른배엘에 깊은 복사를 해보자.
 	
 	이때 복사될 배열의 길이는 10으로 하세요
 	
 */

public class Test04 {

	public static void main(String[] args) {
		// original 배열 만들기
		int [] ori = {10, 20, 30, 40, 50};
		
		// to copy(배열의 길이 10)
		// 0으로 채워져 있음.
		int [] copy = new int [10];
		
		// 깊은 복사를 한다.
		System.arraycopy(ori, 0, copy, 0, 5);
		
		// 배열 내용 출력
		// ori
		System.out.println("ori : " + Arrays.toString(ori));
		//
		System.out.println("copy : " + Arrays.toString(copy));

	}

}
