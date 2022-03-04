package day05.ex;
/*
문제 4 ]
	전기요금을 계산해주는 프로그램을 작성하세요.
	
	전기요금표
		
					코드		기본요금		사용요금
		가정용		1			3800			245
		산업용		2			2400			157
		교육용		3			2900			169
		상업용		4			3200			174
		
		
	전기요금은 
		기본요금 + 사용량 * 사용요금
		
	사용자 코드와 사용량을 입력하면
	전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
*/

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 입력 도구 준비
		while(true) {
		Scanner sc = new Scanner(System.in);
		// 사용용도 코드 입력 메세지 출력
		System.out.println("사용용도 코드를  입력하세요!\n\t가정용\t1\n\t산업용\t2\n\t교육용 \t3\n\t상업용\t4\n\t종료\t0\n입력코드 : ");
		// 입력 받아 변수에 기억
		int code = sc.nextInt();
		/*
		 	블러킹함수(Blocking Method)
		 		: 특정 상황이 될떄까지 그 함수에서 실행을 멈추고 기다리는 함수
		 */
		if(code == 0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		// 사용량 입력 메세지 출력
		System.out.print("사용량 입력 : ");
		// 입력 받아 변수에 기억
		int sayong = sc.nextInt();
		//용도에 맞게 계산해서 변수에기억
		String yd = "";
		int money = 0;
		switch(code) {
			case 1:
			yd = "가정용";
			money = 3800+245*sayong;
//				System.out.println("입력된 코드는 가정용으로 사용량은  " + 
//				sayong + "이고\n전기요금은 " + (3800+245*sayong + "원 입니다."));
				break;
			case 2:
			yd = "산업용";
			money = 2400+157*sayong;
//				System.out.println("입력된 코드는 산업용으로 사용량은  " + 
//				sayong + "이고\n전기요금은 " + (2400+157*sayong + "원 입니다."));
				break;
			case 3:
			yd = "교육용";
			money = 2900+169*sayong;
//				System.out.println("입력된 코드는 교육용으로 사용량은  " + 
//				sayong + "이고\n전기요금은 " + (2900+169*sayong + "원 입니다."));
				break;
			case 4:
			yd = "상업용";
			money = 3200+174*sayong;
//				System.out.println("입력된 코드는 산업용으로 사용량은  " + 
//				sayong + "이고\n전기요금은 " + (3200+174*sayong + "원 입니다."));
				break;
		}
		System.out.println("입력된 코드는   " + yd + "으로 사용량은 " + 
				sayong + "이고\n전기요금은 " + money + "원 입니다.");
		System.out.println("---------------------------------");
		System.out.println();
		// 결과 출력 하세요
		}
		

	}

}
