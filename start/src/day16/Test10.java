package day16;

import java.util.*;

public class Test10 {

	public Test10() {
		Properties prop = System.getProperties();
		// System.getProperties()
		// ==> 프로그램에 관련된 정보를 Map으로 만들어 주는 함수
	
		// 키 값들을 모두 꺼내오고
		Enumeration en = prop.keys();
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement(); // object --> String
			String value = (String) prop.get(key);
			
			// 출력
			System.out.println(key + " : " + value);
		}
	}
	

	public static void main(String[] args) {
		new Test10();
		
	}

}
