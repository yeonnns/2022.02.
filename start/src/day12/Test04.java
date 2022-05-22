package day12;

import java.util.Calendar;
public class Test04 {
	public Test04() {
//		Calendar cal = new Calendar(); ==> 이 클래스는 추상 클래스로 new 시켜서 객체 만들수 없다.
		// 객체 만들어짐(오브젝트 = 레퍼런스 + 인스턴스 )
		Calendar cal = Calendar.getInstance(); 
		System.out.println(cal.getTime());
	}
	public static void main(String[] args) {
		new Test04();
	}
}
