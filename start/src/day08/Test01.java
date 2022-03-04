package day08;

/*
 	0 - 9 사이의 숫자를 100개 발생 시켜서
 	각각의 숫자가 몇번씩 발생했는지를 알아보자.
 	
 	방법 ]
 		각 숫자의 횟수를 기억할 배열을 만들고
 		각 숫자가 발생할 때마다 1씩 누적시켜준다.
 	
 */

public class Test01 {

	public static void main(String[] args) {
		// 베열
		int[] numCount = new int[10];
		/*
		 	이 배열에 위치값이 0인 위치에는 0이 발생하면 1을 누적시킨다.
		 	1인 위치에는 1이 발생하면 1을 누적시킨다.
		 	....

		 */

		// 반복작업
		// 랜덤하게 숫자 발생시키기
		for(int i = 0; i<100 ;i++){
			int no = (int)(Math.random()*10);
			// 이렇게 위에서 발생된 숫자는 위에 만든 numCount배열의 위치값으로 사용하고
			// 그 위치값에 숫자를 1증가 시켜주면 된다.

			// 발생된 숫자의 카운트를 +1 해주고
			numCount[no] += 1;
			// 결과를 출력한다.
		}
		//숫자로 출력
		for(int i = 0; i< numCount.length ; i++) {
			int no = i ; //숫자
			int count = numCount[i]; //발생한 횟수

			//출력
			System.out.println(no + " : " + count);
		}

		//발생한 횟수를 특수문자를 이용해서 그래프 출력
		for(int i= 0; i<numCount.length ; i++) {
			int count = numCount[i];

			// 숫자 출력
			System.out.println();
			System.out.print(i+ " | ");

			// count 횟수만큼 특수문자를 출력하므로 반복문 처리
			for(int j =0; j<count;j++) {
				// ♠ 출력

				System.out.print("♠");
			}
		}System.out.println();
	}

}
