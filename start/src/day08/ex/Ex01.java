package day08.ex;
/*
 	7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
 	각 학생 배열의맨 마지막에는 총점을 계산해서 입력되게 하고
 	결과를 출력하는데 평균도 계산해서 출력
 */

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		//학생배열 만들기
		int [][] stud = new int[7][6];
		for(int i = 0; i<stud.length; i++) {
			//마지막 방은 총점 입력방 비워두기
			for(int j = 0; j<stud[i].length-1; j++) {
				stud[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
		for(int i = 0; i<stud.length; i++) {
			for(int j = 0; j<stud[i].length; j++) {
				System.out.print(stud[i][j]+" | ");
			}
			System.out.println();
		}
		//총점 계산에서 누적시키기
		//stud[i][5] += stud[i][j]
		//012345->6번째에 총점 합산
		for(int i = 0; i<stud.length; i++) {
			for(int j = 0; j<stud[i].length-1; j++) {
				stud[i][5] += stud[i][j];

			}

		} 
		//출력
		System.out.println();
		for(int i = 0; i<stud.length; i++) {
			for(int j = 0; j<stud[i].length; j++) {
				System.out.print(stud[i][j]+" | ");
			}
			System.out.println();
		}
		for(int i = 0; i<stud.length; i++) {
				double avg = stud[i][5] / 5;
				System.out.println((char)('A'+ i)+ " 학생 평균   : " + avg);
		}
		
		
	}
}

