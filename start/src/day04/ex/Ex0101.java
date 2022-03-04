package day04.ex;

/*
 	문제  1] 1~25의 숫자 3개를 랜덤하게 발생 시켜서 그 수들중
			그수들중 가장 큰 수, 중간수, 작은수를 구분해서 출력
 			단, 3항 연산자 사용
 */

public class Ex0101 {
	public static void main(String[] args) {
		//숫자 3개 랜덤 발생 시키기
		int no1 = (int)(Math.random()*25+1);
		int no2 = (int)(Math.random()*25+1);
		int no3 = (int)(Math.random()*25+1);
		//결과
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		System.out.println("no3 : " + no3);
		//판별
//		String str1 = "큰 수: ";
//		String str2 = "중간 수: ";
//		String str3 = "작은 수: ";
		
		int big = 0;
		int mid = 0;
		int las = 0;
		
		if(no1 > no2 && no1 > no3) {
			if(no2 > no3) {
				big = no1;
				mid = no2;
				las = no3;
				
			}else 
			big = no1;
			mid = no3;
			las = no2;
		}
		System.out.println(big +"," + mid + ","+ las);
		
		
		
	}
}