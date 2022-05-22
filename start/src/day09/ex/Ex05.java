package day09.ex;
/*
 	문제 5 ]
 		10학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
 		총점과 석차를 구하는 프로그램을 작성하세요
 		
 		각학생의 점수 랜덤입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
 		 */
public class Ex05 {
	public Ex05() {
		int [][] stud = new int [10][5];
		
		// 점수만들기
		setArr(stud);
		// 총점 구하기
		for(int i = 0; i<stud.length;i++){
			int [] no = stud[i];
			setTotal(no);
		}
	
		// 석차 구하기
		
		setRank(stud);
	
		
		
		//내용 출력하고
			toPrint(stud);
	
		
	}

	public static void main(String[] args) {
		new Ex05();
	}
	
	// 배열을 입력해서 실행하면 점수를 채워주는 함수
	// 주소의 내용만 변경 반환값 없어서 void사용
	public void setArr(int [][] score) {
		for(int i = 0; i<score.length;i++) {
			for (int j = 0; j<score[i].length-2;j++) {
				score[i][j] = (int)(Math.random()*41+60);
			}
		}
	}
	
	// 한학생의 총점을 계산해서 셋팅해주는 함수
	public void setTotal(int [] score) {
		int sum = 0;		// 입력된 점수를 누적해서 더해주고
		for(int i=0; i<score.length-2; i++) {
			sum += score[i];
		}
		score[3] = sum;
	}

	
	// 석차를 계산해서 셋팅해주는 함수
	// 석차 세팅해주는 함수
	public void setRank(int [][] score) {
		for(int i = 0; i<score.length;i++) {
			score[i][4] = 1;
			for(int j= 0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][4] += 1;
				
				}
			}
		} 
	
	}
	//출력하는 함수
	public void toPrint(int [][] arr) {
	for(int i = 0; i<arr.length;i++) {
		//한 학생의 점수를 뽑고
		System.out.print((char)('A' + i) + " 학생");
		for(int j= 0; j<arr[i].length; j++) {
			
			// 각 과목 점수 추출
			System.out.printf("%4d ", arr[i][j]);
		
		}
		System.out.println();
		
	}
	
}

}

