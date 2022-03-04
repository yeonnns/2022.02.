package day07;

import java.util.Arrays;

/*
 	10개의 정수를 랜덤하게 발생시켜서 기억하는 배열을 만들고
 	기억된 수중 가장 큰수를 알아내는 방법
 	
 	
 */
public class Test07 {

	public static void main(String[] args) {
		// 배열을 만든다
		int[] num = new int [10];
		
		// 데이터 채우기
		loop:
		for(int i=0;i<num.length;i++) {
			int no = (int)(Math.random()*99+1);
			
		// 중복 검사
			for (int j = 0; j<i; j++) {
				if(num[j] == no) {
					//이전에 만든 번호와 중복이 되므로 다시 번호를 만든다.
					i--;
					continue loop;
				}
			}
			num[i] = no;
		}
		//데이터 확인
		System.out.println(Arrays.toString(num));
		int max = num[0];
		for (int i =1; i<num.length;i++) {
			int tmp = num[i];
			if(tmp>max) {
				max = tmp;
			}
			
		}
		System.out.println("max : " + max);
	}

}
