package day10;

public class Test01 {
		
		
		/*
		 	 점근지정자의 범위
		 	 private < 생략  < protected < public
		 */
		private int no1 = 10; 	// 이 변수는 이 클래스 내에사만 접근 가능한 변수
		int no2 = 20; 		  	// 이 변수는 이 클래스 안에서 + 같은 패키지 안에서는 접근 가능
		protected int no3 = 30; // 이 변수는 이 클래스를 상속받은 클래스 안에서 + 같은 패키지 안에서는 접근 가능
		public int no4 = 40;	// 모든곳에서 사용 가능
		
		// 이 함수는 멤버변수의 내용을 출력해주는 기능의 함수
		public void noPrint() {
			System.out.println("no1 : " + no1);
			System.out.println("no2 : " + no2);
			System.out.println("no3 : " + no3);
			System.out.println("no4 : " + no4);

		

	}

}
