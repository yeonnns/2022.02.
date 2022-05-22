package day14;
/*
 	문제 3]
 		학생 한명의 성적을 관리하는 클래스 Student 를 작성하세요.
 		기억할 내용은
 			반, 이름, 국어, 영어, 수학, 총점
 		을 기억하도록 하고
 		필요한 기능(함수)는 필요한 만큼 추가해주세요.
 		단, 학생의 반과 이름이 같으면 같은 학생으로 처리되도록 하세요.equals()
 		학생변수를 출력하면 모든내용이 출력되도록 함수를 오버라이딩 하세요.
 */

public class Ex03 {

	public Ex03() {
		Ex03_student S1 = new Ex03_student(3, "김소연", 90, 80, 70);
		Ex03_student S2 = new Ex03_student(3, "김소연", 70, 55, 90);
		//결과값 변수
		String result = (S1.equals(S2)) ? "같은" : "다른";
		
		System.out.println("S1과 S2 학생은 " + result + " 학생 입니다.");
		System.out.println("S1 : \n\t" + S1);
		System.out.println("S2 : \n\t" + S2);
		System.out.println("S1 == S2 : " + (S1 == S2));	
		
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
