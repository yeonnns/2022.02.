package day07.ex;
/*
 	 반지름 5개를 기억하는 배열을 만들고
 	 랜덤하게 반지름을 만들어서 기억시키고 
 	 각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
 	 넓이도 배열에 기억시켜주세요.
 */

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 배열 만들기
		int [] subj = new int[10];
		// 반지금 5개 만들고 뒤에 5개는 넓이 넣기
		
		for (int i= 0; i<subj.length-5;i++) {
			int ban = (int)(Math.random()*10+1);
			subj[i] = ban;
		}
		System.out.println(Arrays.toString(subj));
		double area = 0;
		for (int i= 0; i<subj.length-5;i++) {
			area = subj[i] *2*3.14;
			System.out.println(area);
			subj[i+5] += area;
		}
		System.out.println(Arrays.toString(subj));
	
//		for (int i= 5; i<subj.length;i++) {
//			subj[i] = result * subj[i-5];
//	}

}
}
