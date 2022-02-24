package day03.ex;

/*
	 1년은 365.2426일이다.
	 이 것은 과연 며칠 몇시간 몇분 몇초인지를 계산하고 출력.
 
	힌트]
		365.2426일은 단위가 일 단위이다.
		하루는 24시간.
		따라서 0.5일은 12시간을 의미.
 */

public class dfsgd {
	public static void main(String[] args) {
		float year = 365.2426f;
		float _year = year;
		int day = (int)year;
		float hours = 0;
		float _hours = 0;
		float minutes = 0;
		float _minutes = 0;
		float seconds = 0;
		
		_year -= day;	// 365빼고 나머지 소수점으로 계산
		hours = _year * 24.0f;
		_hours  = hours / 10;
		
		minutes = _hours * 60;
		_minutes = minutes / 100;
		
		seconds = _minutes * 60;
		
		System.out.print(year + "일 : ");
		System.out.print(day + "일 ");
		System.out.print((int)hours + "시간 ");
		System.out.print((int)minutes + "분 ");
		System.out.print((int)seconds + "초");
	}
}