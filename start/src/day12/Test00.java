package day12;

import java.util.Arrays;

public class Test00 {
		public Test00() {
			int no = 10; 
			int[] arr = {1, 2, 3, 4, 5};
//			arr = new int[] {1, 2, 3, 4, 5};
			
			no = addNo(no); // addNo(10)
			setArr(arr);
			
			System.out.println("no : " + no);
			System.out.println("arr : " + Arrays.toString(arr));
		}
		// no 에 10더해서 결과를 no에 기억시키는 기능
		// no는 지역 변수라 addNo는 모름 매개 변수 줌 리터럴 풀에 저장
	public int addNo(int no) {
		int sum = no + 10;
		return sum;
	}
	// arr 배열의 첫번째 방에 데이터를 10 더해주는 기능
	// int[] arr heep영역 주소 자체는 안바뀜 안에 데이터만 바뀜
	public void setArr(int[] arr) {
		arr[0] = arr[0] + 10;
	}
		

	public static void main(String[] args) { 
		new Test00();
	}

}
