package day08.ex;
/*
 	Ex02 ] 
 		Ex01에서 만든 배열의 내용을 
 		5과목의 7학생 배열로 바꿔서 
 		해결하기
 		
 		Ex01의 각 학생의 항목에 석차도 입력되도록 하세요.
 		그후 내림차순 정렬하세요.(높은곳 부터 낮은곳 나열)
 */

public class Ex02 {

	public static void main(String[] args) {
		
		//학생배열 만들기
		int [][] stud = new int[5][9];
		for(int i = 0; i<stud.length; i++) {
			//마지막 방은 총점 입력방 비워두기
			for(int j = 0; j<stud[i].length-1; j++) {
				stud[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
			
				}
		for(int i = 0; i<stud.length; i++) {
			for(int j = 0; j<stud[i].length-1; j++) {
				stud[i][7] += stud[i][j];
			}
		}
			
			for(int i = 0; i<stud.length;i++) {
				stud[i][8] = 1;
				for(int j= 0; j<stud.length; j++) {
					if(stud[i][7]<stud[j][7]) {
						stud[i][8] += 1;
					
					}
				}
			} 
		for(int i = 0; i<stud.length; i++) {
			for(int j = 0; j<stud[i].length; j++) {
				System.out.print(stud[i][j]+" | ");
			}
			System.out.println();
		}
	}

}
