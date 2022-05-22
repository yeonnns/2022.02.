package day10.sub;


import day10.Test01;
// 상속
public class Sample02 extends Test01 {
	public int no4 = 300;
	public Sample02() {
//		System.out.println("no1 : " + no1); // private 	같은 클래스내에서만 사용O
//		System.out.println("no2 : " + no2); // 생략		 같은패키지 아니라 사용X
		System.out.println("no3 : " + no3); // protected 상속! 같은 패키지 내 사용O
		System.out.println("no4 : " + no4);
		
		
		noPrint();
		
	
		
	
	}
	
	@Override
	public void noPrint() {
		super.noPrint();
		System.out.println("#############################");
	}
		
	public static void main(String[] args) {
		new Sample02();
		
		/*
			아 그렇구나 하고 넘어가세요...
			나중에 나옵니다.
				
				상속관계에 있는 경우는
				상위 클래스 타입의 변수로 하위 클래스 타입의 인스턴스를 기억시킬 수 있다.
				
				이때
				변수의 경우는 변수쪽의 데이터를 사용하게 되고
				함수의 경우는 인스턴스쪽 함수를 사용하게 된다.
		 */
		Sample02 s1 = new Sample02();
		
		Test01 t1 = s1;
		
		System.out.println("t1.no4 : " + t1.no4);
		t1.noPrint();
	}
}