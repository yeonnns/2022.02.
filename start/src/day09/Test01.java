package day09;

public class Test01 {
//	int no = 10;
	// abc라는 이름의 함수
	// static 이 있어야 메인함수에서 호출 가능. 메모리 얹기
	static void abc(int no) { //int no 는 매개변수, 철저한 지역변수
	
	}

	public static void main(String[] args) {
		abc(10);
	}
	void xyz() {// 뭔가 기능이 필요한 경우 함수를 제작한다.
		int no = 10;
		// 위에서 정수타입 하나는 필수로 입력 지정함.
		abc(no);
	}

}
