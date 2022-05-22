package day10;

public class Test01_01 {

		/*
		 	Test01 클래스의 변수에 접근해서 데이터를 만들기 
		 */
		
		private int num1, num2, num3, num4;
		
		// Test01의 변수내용 읽어와서 전역변수에 셋팅해주는 함수
		public void getNo() {
			// Test01의 멤버를 사용하려면 먼저 heap영역에  클래스의 내용을 복사해야한다.
			// 그 작업은 new라는 명령을 통해서 이뤄진다.
			Test01 t1 = new Test01();
//			num1 = t1.no1; // private     no1의 접근 지정자는 Test01 클래스내에서만 사용 할 수 있도록 private 지정
			num2 = t1.no2; // 생략                     Test01클래스와 같은 패키지(폴더) 에 있으므로 접근지정자가 생략된 경우 이상은 사용 가능
			num3 = t1.no3; // protected   같은 패키지 내이기 떄문에 사용 가능하다.
			num4 = t1.no4; // public      모든 접근 가능
		}
	}


