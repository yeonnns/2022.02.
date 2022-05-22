package day03;
/*
 	문자열 데이터의 비교는 equals() 사용
 		문자열.equals(비교할 문자열)
 */

public class Test06 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		//비교연산자로 비교
		boolean bool1 = name1 == name2; // 변수가 기억하는 주소를 비교한다 -> bool1에 결과 저장
		boolean bool2 = name1.equals(name2); //변수가 기억하는 데이터 자체를 비교
		
		System.out.println("name1 == name2 : " + bool1);
		System.out.println("name1.equals(name2) : " + bool2);
	}

}
