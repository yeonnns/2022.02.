package day13;

public class Ex01 {
/*
	String[] arr = {"123", "456", "789", ..};
	가 있는 경우
	이 배열이 기억하는 숫자형태의 문자열을 정수로 바꾼 데이터들의
	합과 평균을 구하는 프로그램을 작성하세요.
	
	단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
		1. 배열의 범위를 벗어나서 사용하는 경우
		2. 숫자로 변환이 불가능한 경우
		3. 평균을 계산하는데 0으로 나누는 경우..
		4. 그 외의 예외
 */
	public Ex01() {
		String[] arr = {"123", "456", "789"};
		
		int sum = 0;
		int avg = 0;
		int soo = 3;
		
		try {
			for(int i = 1;i<arr.length;i++) {
			sum += Integer.parseInt(arr[i]);
			avg = sum / soo;
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("1. 배열의 범위를 벗어나서 사용하는 경우");
			
		}catch(NumberFormatException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("2. 숫자로 변환이 불가능한 경우");
		
		}catch(ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("3. 평균을 계산하는데 0으로 나누는 경우");
		
	
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("4. 그 외의 예외");
		
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}