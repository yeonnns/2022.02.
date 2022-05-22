package day15.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/*
	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서 
	10개를 TreeSet에 입력한 후
	내림차순으로 정렬해서 출력하세요.
 */
public class Ex02 {

	public Ex02() {
		// 이 경우는 기존 가지고 있는 정렬기준을 바꾸는 작업이 되기 떄문에
		// Comparator 를 트리셋을 만들때 적용시켜서 만들면 된다.
		TreeSet set = new TreeSet();
		while(true) {
			int num = (int)(Math.random()*99+1);
			set.add(num);
		
			if(set.size() ==10) {
				break;
			}
		}
		System.out.println("정렬 전");
		System.out.println(set);
		
		System.out.println("내림차순 정렬 후");
//		Collections.reverse(set); TreeSet 에 사용불가
		ArrayList list = new ArrayList(set);
		Collections.reverse(list);
		for(Object o : list) {
			System.out.print(o + " , ");
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}