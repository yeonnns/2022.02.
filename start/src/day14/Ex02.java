package day14;

/*
 	문제 2 ]
 		사각형의 정보를 기억하는 클래스 Nemo를 제작하세요.
 		필요한 변수와 함수, 생성자는 필요한만큼 추가하고
 		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리되도록
 		equals() 함수를 오버라이드 하세요.
 		이클래스 객체를 출력하면 내용이 출력되도록 toStrin() 를 오버라이드 하세요.
 */
public class Ex02 {

	public Ex02() {
		Ex02_Nemo n1 = new Ex02_Nemo(10,7);
		Ex02_Nemo n2 = new Ex02_Nemo(10,7);
		
		String result = (n1.equals(n2)) ? "같은" : "다른";
		
		System.out.println("n1과 n2 네모는 " + result + " 네모 입니다.");
		System.out.println("n1 : \n\t" + n1);
		System.out.println("n2 : \n\t" + n2);
		System.out.println("n1 == n2 : " + (n1 == n2));
		
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
