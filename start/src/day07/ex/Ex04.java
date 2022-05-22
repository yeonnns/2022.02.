package day07.ex;
/*
 	5명의 학생의 이름을 기억할 배열을 만들고
 	각학생의 시험 성적(랜덤)을 기억할 배열을 만들고
 	결과를 출력하는 프로그램을 작성하세요.
 	
 	출력 예 ]
 		둘리 : 80
 		제니 : 90
 		리사 : 85
 		로제 : 75
 		지수 : 100
 		----------
 		총점 : 000
 		평균 : 00.00 
 */

public class Ex04 {

	public static void main(String[] args) {
		// 학생 배열 만들기
		String[] stud = {"둘리", "제니", "리사", "로제", "지수"};
		// 점수 배열 만들기
		int [] score = new int[5];
		int total = 0;
		int avg = 0;
		for(int i = 0; i<score.length;i++) {
			int no = (int)(Math.random()*41+60);
			score[i] = no;
			total += score[i]; 
			avg = total / stud.length;
		}
		for(int i = 0; i<score.length;i++) {
			System.out.println(stud[i] + " | " + score[i]);
		}
		System.out.println("----------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

}
