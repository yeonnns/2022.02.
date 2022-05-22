package day16.ex;

import java.util.*;


public class Ex02 {
/*
	학생들의 과목점수를 기억하는 HashMap을 만들고
	다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하세요.
	과목은
		국어, 영어, 수학, 과학, 국사
	의 점수를 기억하도록 하세요.
 */
	public Ex02() {
		ArrayList names = new ArrayList();
		names.add("학생1");
		names.add("학생2");
		names.add("학생3");
		names.add("학생4");
		names.add("학생5");

		HashMap map = new HashMap();
		
		for(int i = 0; i<5;i++) {
			Object key = names.get(i);
			Students std = new Students((String) key, 
				(int)(Math.random()*41 + 60),
				(int)(Math.random()*41 + 60),
				(int)(Math.random()*41 + 60),
				(int)(Math.random()*41 + 60),
				(int)(Math.random()*41 + 60)
				);
		map.put(key, std);
		}
		Set keys= map.keySet();
		ArrayList list = new ArrayList(keys);
		for(Object key : list) {
			Object value = map.get(key);
			System.out.println("*** " + key + " ***\n" + value);
			System.out.println();
		
	}
			
		}
	

	public static void main(String[] args) {
		new Ex02();
	}

}