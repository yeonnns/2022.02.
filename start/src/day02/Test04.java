package day02;

/**
 *  자신의 정보를 기억하고 출력하는 기능의 시스템
 * @author 김소연
 * @since 2022.02.23
 * @version v.1.0
 * 
 */

public class Test04 {
	/*
	 	자심의 이름, 나이 , 이름 첫문자, 키를 변수에 기억시키고 출력 하세요.
	 */
	public static void main(String[] args) {
		String name = "김소연";
		int age = 27;
		char sijak = '김';
		double height = 163; // 실수(double) > 정수(int) type 크기가 커서 가능
		
//		System.out.println("'가' > '나' : " + ('가' > '나'));
		//내용 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("첫문자 : " + sijak);
		System.out.println("기럭지 : " + height);
		
		
	}

}
