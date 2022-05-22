package day07;
/*
 	 1 ~ 10 까지의 정수를 순서대로 배열에 기억시키고
 	 이 숫자를 랜덤하게 섞어서 출력하세요
 	 
 	 방법 ]
 	 배열의 특정 위치 2개를 꺼내서 데이터를 바꾼다.
 	 이 과정을 많이 하면 데이터가 섞이게 된다.
 */

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		// 1~10 배열을 만든다
		int[] num = new int[10];
		for(int i = 0; i <10; i++) {
			num[i] = i+1;

			
		}System.out.println(Arrays.toString(num));
		//이제 배열은 준비 완료
		//임의의 숫자 두개의 위치를 랜덤하게 만들어서 데이터를 서로 바꾼다.
		//==>swapping
		
		for(int i =1; i<100; i++) {
			int idx1 = (int)(Math.random()*10);
			int idx2 = (int)(Math.random()*10);
			if (idx1==idx2) {
				i--;
				continue;
			
			}
			// 원래 첫위치의 데이터를 변수에 기억시키고
			int tmp = num[idx1];
			
			// 두번쨰 위치의 데이터를 첫번째 위치에 기억시킨다.
			num[idx1] = num[idx2];
			num[idx2] = tmp;
		}
		//출력
		for(int no : num) {
			System.out.print(no + " | ");
		}
		System.out.println();
	}

}
