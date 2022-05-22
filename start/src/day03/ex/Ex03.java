package day03.ex;
/*
 	84232원을 지불하려고 한다.
 	우리나라 화폐단위로 이 금액을 지불하려면
 	각 단위가 몇개 씩 필요한지 계산해서 출력하세요. (필요없는거 0개)
 	
 	화폐단위
 	50000권
 	10000권
 	5000권
 	1000권
 	500권
 	100
 	50
 	10
 	1
 */

public class Ex03 {

	public static void main(String[] args) {

						
//	int money = 84232;
//	
//	int money1 = 84232 / 50000;
//	int money2 = (84232 % 50000) / 10000;
//	int money3 = ((84232 % 50000) % 10000) / 5000;
//	int money4 = (((84232 % 50000) % 10000) % 5000) / 1000;
//	int money5 = ((((84232 % 50000) % 10000) % 5000) & 1000) / 500;
//	int money6 = (((((84232 % 50000) % 10000) % 5000) & 1000) % 500) / 100;
//	int money7 = ((((((84232 % 50000) % 10000) % 5000) & 1000) % 500) % 100) / 50;
//	int money8 = (((((((84232 % 50000) % 10000) % 5000) & 1000) % 500) % 100) % 50) / 10;
//
//	
//	
//	System.out.println("50000권 : " + money1);
//	System.out.println("10000권 : " + money2);
//	System.out.println("5000권 : " + money3);
//	System.out.println("1000권 : " + money4);
//	System.out.println("500권 : " + money5);
//	System.out.println("100권 : " + money6);
//	System.out.println("50권 : " + money7);
//	System.out.println("50권 : " + money8);
		
		int total = 84232;
		int tmp = total;
		
		//5만원권 개수
		int oman = tmp / 50000;
		//5만원권 제외한 나머지 금액기억 
		tmp %= 50000; //tmp = tmp % 50000 과 같다.
		
		//1만원권 개수
		int man = tmp / 10000;
		//1만원권 제외한 나머지 금액 기억
		tmp %= 10000;
		
		//5천원권 개수
		int ochun = tmp / 5000;
		//5천원권 제외한 나머지 금액 기억
		tmp %= 5000;
		
		//1천원권 개수
		int chun = tmp / 1000;
		tmp %= 1000;
		
		//5백원 개수
		int obak = tmp / 500;
		tmp %= 500;
		
		//1백원 개수
		int bak = tmp / 100;
		tmp %= 100;
		
		//50원 개수
		int oship = tmp / 50;
		tmp %= 50;
		
		//10원 개수
		int ship = tmp / 10;
	
		//1원 개수
		int il = tmp % 10;
		
		System.out.println("총금액 " + total + " 원은 ");
		System.out.println("오만원권 : " + oman + " 장");
		System.out.println("만원권 : " + man + " 장");
		System.out.println("오천원권 : " + ochun + " 장");
		System.out.println("천원권 : " + chun + " 장");
		System.out.println("오백원권 : " + obak + " 장");
		System.out.println("백원권 : " + bak + " 장");
		System.out.println("오십원권 : " + oship + " 장");
		System.out.println("십원권 : " + ship + " 장");
		System.out.println("일원권 : " + il + " 장");
		
		
		
		
		
		
				
		

		
		

	}

}
