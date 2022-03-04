package day04.ex;

/*
 	문제 5 ] 3자리 숫자(100 ~ 999)를 입력받아서 이 숫자에 가장 가까운 100의 배수를 만들기 위해서
 	얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 	100/100
 	
 	  ex) 241	은 200에 가까우므로 41을 뺴야 한다
 	  ex) 777	은 800에 가까우므로 23을 더해야 한다
 	  
 */


import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		// 세자리 정수 입력받음.
		String sno = JOptionPane.showInputDialog("세자리 정수 입력 : ");
		
		// 입력받은 데이터는 정수형태의 문자열 이므로 정수로 변환해주어야 한다.
		// 정수형태의 문자열을 정수로 변환해주는기능을 가지고 있는 함수
		//	Integer.parseInt(문자열)
		int no = Integer.parseInt(sno);
		
		// 10단위 이하만 출력(나머지만 출력)
		int num = no % 100;
		// num이 50보다 큰지 판별
		int hap = 0;
		int result = 0;
		
		hap = num > 50 ? (100-num) //76 ==> 100 - 76 를 더해줘야 한다.
				: num ;
		
//		result = num > 50 ? (no + hap) : (no - hap);
		result = num > 50 ? (no / 100 + 1) * 100 : (no / 100) * 100;
		
		String str = num > 50 ? "더해줘야한다." : "뺴줘야한다.";
		
		//출력
		System.out.println("입력한 정수 " + no + " 는 " + 
							result + " 에 가까우므로 " + hap + " 을 " + str);
		
		
		

	
	}

}
