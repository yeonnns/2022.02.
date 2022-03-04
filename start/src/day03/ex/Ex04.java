package day03.ex;

/*
 	1년은 365.2426 일이다. -> 단위가 일 단위(시간 단위 x, 하루는 24 시간  / 0.5=12시간)
 	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 	
 */

public class Ex04 {

	public static void main(String[] args) {
		
//		1/24 = 1시간
//		(1/24)/60 = 1분
//		((1/24)/60)/60 = 1초
		
		//데이터 변수에 기억
		double total = 365.2426;
		//몇일인지 계산
		int day = (int)total / 1 ;
		//일을 제외한 시간 단위를 초로 계산
		double tmp = (total % 1)*24*60*60;
		//몇시간인지 계산
		int hour = (int)tmp / 3600;
		//몇일 몇시간 제외한 분단위 계산
		double tmp1 = tmp % 3600;
		int minutes = (int)tmp1 / 60 ;
		int seconds = (int)tmp1 % 60 ;	
		
		
		System.out.println("365.2426은 " + day + "일" + hour + "시간" 
		+ minutes + "분" + seconds + "초");
	
		
		

	}

}
