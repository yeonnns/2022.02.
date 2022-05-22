package day13;

public class Test07 {

	public Test07() {
		int [] arr = {25, 30, 38, 75, 47};
		
		// 위치값 초과 입력
		int idx = 5;
		int no = 6;
		int result = 0;
		
		try {
			result = arr[idx] / no;
		}catch(ArithmeticException e) {
			System.out.println(e);	// 에외에 정보만 출력
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("*******************************************");
			e.printStackTrace();	// 예외에 대한 보다 다양한 정보를 출력. 위치, 클래스, 추적해서 출력
		}catch(Exception e) {
			System.out.println("### 나머지 예외 발생 ###");
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new Test07();

	}

}
