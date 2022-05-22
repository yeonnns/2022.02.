package day16.ex;


import java.util.*;
public class Ex01 {
/*
	5 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	그 수만큼의 학생의 점수를 기억하는 
	HashMap 을 만들어서 데이터를 기억시키고
	꺼내서 출력하세요.
	데이터를 꺼낼때 키를 모두 추출해서 꺼내는 방식으로 출력하세요.
 */
	public Ex01() {
		HashMap map = new HashMap();
		int num = (int)(Math.random()*6+5);
		
		
		for(int i = 1;i<num;i++) {
			int score = (int)(Math.random()*61+40);
			map.put(i, score);
		
				
			}
		Set keys = map.keySet();
		for(Object key : keys) {
			Object value = map.get(key);
			System.out.println("랜덤하게 발생한 정수 [ " + key + " ] 학생 점수 " + value);
			
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}