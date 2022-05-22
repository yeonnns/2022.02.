package day14;

/*
 	문제 1 ]
 		원의 정보를 기억할 클래스를 제작하세요.
 		가지는 정보는 
 			반지름, 면적, 둘레
 		를 가지고 
 		기능은 변수에 접근할 수 있는 함수들...
 		그리고 반지름이 같으면 같은 원으로 처리하는 기능의
 			equals()
 		함수로 오버라이드하고,
 		이클래스 타입의 변수를 출력하면 해당 원의 정보를 출력해주는 함수도
 		오버라이드 하세요.
 */

public class Ex01 {
	public Ex01() {
		Ex01_One o1 = new Ex01_One(5);
		Ex01_One o2 = new Ex01_One(5);
		
		String result = (o1.equals(o2)) ? "같은" : "다른";
		
		System.out.println("o1과 o2 네모는 " + result + " 네모 입니다.");
		System.out.println("o1 : \n\t" + o1);
		System.out.println("o2 : \n\t" + o2);
		System.out.println("o1 == o2 : " + (o1 == o2));
		
		
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
