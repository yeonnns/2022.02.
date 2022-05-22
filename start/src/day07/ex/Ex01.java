package day07.ex;
/*
 	Ex01 ] 
 		'A' - 'J' 까지의 문자를 랜덤하게 100만들고
 		각문자의 출현횟수를 기억할 배열을 만들어서
 		횟수만큼 '*'출력해주는 프로그램을 작성하세요.
 		
 		문자 저장할 배열 10개 만들기.
 		
 		예 ]
 			A [5] : ***** 
 			B [20] : ********************
 			...
 			j [7] : ******* 
 			
 			'A' + 0 ==> 'A'
			'A' + 1 ==> 'B' 
 */



public class Ex01 {

	public static void main(String[] args) {
		// 배열의 주소를 기억할 변수
		int[] alpCount = new int[10];

		for(int i = 0; i<alpCount.length;i++) {
			alpCount[i] = 0;
		}
		//랜덤하게 알파벳 출력
		for(int i = 0; i<100; i++) {
			char alp = (char)(Math.random()*('J'-'A'+1)+'A');
			System.out.print(alp);
			//ex) (char)'A'-'A'=0, (char)'B'-'A' = 1
			int idx = alp - 'A';
			alpCount[idx] += 1;

		}
		System.out.println();
		for(int i = 0; i<alpCount.length;i++) {
			//arr 변수에 i위치 배열의 1씩 누적된 값 저장
			int arr = alpCount[i];
			//o->A, 1->B ... 
			char ch = (char)('A' + i);
			System.out.print(ch + " | ");
			//*로 바꿔서 출력
			for(int j = 0; j<arr;j++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
}











