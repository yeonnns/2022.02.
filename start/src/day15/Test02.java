package day15;

import java.util.*;

public class Test02 {

	public Test02() {
		Random rd = new Random();
		System.out.println(rd.nextInt());
		
		Random rd1 = new Random(4);
		/*
		 	난수표에서 10번 위치부터 난수를 뽑아주세요.
		 	Seed를 알려주면서 가져오기 떄문에 항상 나오는 순서가 동일
		 */
		
		for(int i = 0; i<10;i++) {
			int no = rd1.nextInt(100); // 0~100사이에 난수 발생
			System.out.print(no + " | ");
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
