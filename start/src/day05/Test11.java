package day05;

public class Test11 {

	public static void main(String[] args) {
		// 구구단 5단을 출력하는데 곱이 5인경우는 제외하고 출력하세요.
		int dan = 5;
		
		for(int i = 0; i < 9; i++) {
			int gop = (i + 1);
			if(gop == 5) {
				continue; // 출력 없이 조건식으로 이동
			}
			System.out.println(dan + " X " + gop + " = " + (dan * gop));
		}

	}

}
