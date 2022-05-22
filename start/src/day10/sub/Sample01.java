package day10.sub;

import day10.*;

public class Sample01 {

	private int num1, num2, num3, num4; // 은닉화
	
	// day10.Test01의 멤버변수를 읽어서 위 변수에 셋팅하는 함수
	public void setNum() {
		//힙에 객체 만들고
		Test01 t1 = new Test01();
		
		num1 = t1.no1; // private     no1의 접근 지정자는 Test01 클래스내에서만 사용 
		num2 = t1.no2; // 생략                     Test01클래스와 다른 패키지(폴더)에 있으므로 불가. 접근 기능자 생략은 같은 패키지 안에 클래스에만 접근 가능
		num3 = t1.no3; // protected   상속이나 같은 패키지 내에서만 사용 가능하다.
		num4 = t1.no4; // public	     모든곳 에서 사용 가능 접근 가능
	}

}
