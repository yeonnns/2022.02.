package day09.ex;

/*
 	 문제 3]
 	 	사각형을 넓이를 계산하는 프로그램을 작성하세요.
 	 	
 	 	길이를 랜덤하게 만들어주는 함수
 	 	넓이를 계산해주는 함수
 	 	사각형의 내용을 출력해주는 함수
 	 	
 */

public class Ex03 {
	public Ex03(){
		int garo = getInt();
		int sero = getInt();
		//계산
		int result = area(garo,sero);
		//출력
		toPrint(garo,sero,result);
		
	}

	public static void main(String[] args) {
		new Ex03();

	}
	//랜덤하게 정수 로 가로 세로 길이 얻기
	public int getInt() {
		int no = (int)(Math.random()*10+1);
		return no;
	}
	//넓이 구하는 함수
	public int area(int garo, int sero) {
		return (garo*sero);
	}
	// 출력해주는 함수
	public void toPrint(int garo, int sero,int result) {
	System.out.println("사각형의 가로 : " + garo + " , 세로 : " + sero + 
			" 넓이는  " + result +  " 입니다.");

	}
}
