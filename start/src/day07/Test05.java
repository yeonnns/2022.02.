package day07;

import java.util.Arrays;

/*
 	5과목의 점수를 기억할 배열을 만들고
 	과목 점수를 입력하고 총점도 배열의 마지막에 계산해서 입력
 	평균도 구하고 출력
 	배열에 담긴 과목 점수도 같이 출력하세요.
 */


public class Test05 {

	public static void main(String[] args) {
		// 배열 만들기
			int [] subj = new int[6];
		// 맨 마지막방 에는 총점이 계산이 되어야 하므로 그 이전방까지 접근해서 점수를 입력한다.
			for (int i = 0; i<subj.length -1; i++) {
				
				// 과목 점수 만들어서 입력
				int score = (int)(Math.random()*41+60);
				subj[i] = score;
			}
			System.out.println(Arrays.toString(subj));
		// 총점 계산해서 입력
			for(int i = 0; i < subj.length-1; i++){
//				subj[5] +=subj[i];
				// 0 1 2 3 4 5
				subj[subj.length - 1] += subj[i]; //총점방에 점수를 누적  	위치값(0부터 시작돼서)  = 배열의 길이 -1
			}
			System.out.println("2. " + Arrays.toString(subj));
		
		// 평균 구해서 기억시키기
		// 과목수
		int no = subj.length -1;
		
		double avg = subj[subj.length - 1] / (double) no;
		// 데이터 출력한다.
		// 과목 점수 출력
		System.out.print("과목 점수 : | ");
		for(int i = 0; i<subj.length - 1; i++) {
			System.out.print(subj[i] + " | ");
		}
		// 총점 출력
		System.out.println(); //줄바꿈
		System.out.println("총     점   : " + subj[subj.length - 1]);
		
		// 평균 출력
		System.out.println("총     점   : " + avg);
	}

}
