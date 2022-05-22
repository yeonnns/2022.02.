package day15;

import java.util.*;

public class Test06 {
	/*
	 	다양한 형태이 데이터를 백터에 채워보고 꺼내서 출력하자.
	 */

	public Test06() {
		Vector vec = new Vector();
		
		vec.add("제니");
		vec.add('f'); // 자동 Boxing 이 되서 입력된다. char --> Character --> Object
		vec.add(27);
		vec.add(168.5);
		vec.add(false);
		
		// 벡터 안의 데이터를 꺼내서 출력해보자
		String name = (String) vec.get(0);
		char gen = (Character) vec.get(1); // 자동 Unboxing 참조형->기본형
		int age = (Integer) vec.get(2);
		double height = (Double) vec.get(3);
		Boolean bool = (Boolean) vec.get(4);
		
		// 출력
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gen);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("학원 : " + bool);
		
		for(Object o : vec) {
			System.out.print(o + " | "); // 각 타입별로 오버라읻 된  toString() 가 호출이 되서 내용이 출력된다.
		}
		
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
