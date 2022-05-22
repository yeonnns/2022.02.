package day09.ex;

/*
 	문제 4]
 		1차원 배열에 정수 10개를 입력한 후 
 		합계와 평균을 구해주는 프로그램을 작성하세요.
 		
 		배엘에 정수를 랜덤하게 채워주는 함수
 		합계를 계산해주는 함수
 		평균을 계산해주는 함수
 		출력해주는 함수
 */

public class Ex04 {
	public Ex04() {
		int[] score = new int[10];
		//점수 만들기
		getArr(score);
		// 합계 평균 함수 불러오기
		int sum = getTotal(score);
		int average = getAvg(score,sum);
	
		//출력
		toPrint(score, sum, average);
		
	}

	public static void main(String[] args) {
		new Ex04();

	}
	//정수 10개 배열로 채워주는 함수 만들기
	public void getArr(int[] score) {
		for(int i= 0; i<10; i++) {
			score[i] = (int)(Math.random()*10+1);
		}
	}
	// 합계를 계산해주는 함수
	public int getTotal(int[] score) {
		int sum = 0;
		for(int i=0; i<score.length;i++) {
			sum += score[i];
			
		}return sum;
	}
	// 평균 계산해주는 함수
	public int getAvg (int[] score, int sum) {
		int average = sum / score.length;
		return average;
		
	}
	
	// 출력 함수
	
	public void toPrint (int[] score, int sum, int average) {
		System.out.print("랜덤하게 만든 정수: " );
		for(int i=0; i <score.length;i++) {
		System.out.print(score[i] + "," );
		}System.out.println();
		System.out.println(" 합계는 " + sum + " 평균은 " + average + " 입니다. ");
	}
	}
	


