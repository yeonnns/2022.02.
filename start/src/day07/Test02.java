package day07;
/*
 	6개의 메모리를 배열로 만들고 
 	그안에 랜덤한 숫자(정수)를 입력한 후 출력하세요.
 	1~45숫자
 */

public class Test02 {

	public static void main(String[] args) {
		// 배열의 주소를 기억할 변수
		int[] lotto; 
		// 배열 만들기
		lotto = new int[6];	
		// 랜덤하게 정수를 만들기
		 
		loop:
		for(int i = 0; i<lotto.length; i++) {
		int no = (int)(Math.random()*45+1);
		
			//중복 검사
			//지금 만든 번호가 이전에 이미 만들어진 번호면 
			//지금 회차를 다시 만든다.
			for(int j = 0; j < i; j++) {
				//이전에 만든 번호 추출
				int tmp = lotto[j];
						
				if (no == tmp) {
					//이경우는 지금 만드 번호가 이전 회차에서 이미 만든 번호이므로 
					//지금 회차를 다시 반복
					//회차를 1감소 시킨다.
					i--;
					//다음회차 진행
					continue loop;
				}
			}
		
		// 배열에 채워 넣기
		lotto[i] = no;
		}
		// 하나씩 꺼내서 출력
		/*
		
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		System.out.println(lotto[3]);
		System.out.println(lotto[4]);
		System.out.println(lotto[5]);
		 */
		for(int i =0; i < lotto.length;i++ ) {
			System.out.print(lotto[i] + " | ");
		}
		System.out.println();
	}

}
