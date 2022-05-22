package day15;

import java.util.*;

public class Test09 {

	public Test09() {
		// ArrayList 타입의 list 에 1~25 사이의 정수 10개를 랜던하게 만들어서 채워주세요.
		// 리스트 만들고
		
		ArrayList list = new ArrayList();
		for(int i =0; i<10;i++ ) {
			list.add((int)(Math.random()*25+1));
		}
		System.out.println("1. 정렬 전 : ");
		for(int i =0; i<list.size();i++ ) {
			System.out.print((int)list.get(i) + " : ");
		}
		System.out.println();
		// 오름차순 정렬 
		Collections.sort(list);
		System.out.println("2. 오름차순 정렬 후 : ");
		for(int i =0; i<list.size();i++ ) {
			System.out.print((int)list.get(i) + " : ");
		}
		System.out.println();
		
		// 내림차순
		Collections.reverse(list);
		System.out.println("2. 내림차순 정렬 후 : ");
		for(int i =0; i<list.size();i++ ) {
			System.out.print((int)list.get(i) + " : ");
				}
	}
	

	public static void main(String[] args) {
		new Test09();
	}

}
