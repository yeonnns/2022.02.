package day11;

public class Test01 {
	int no1 = 10; // ==> 1.명시적 초기화
	
	int no2;
//	no2 = 100; ==> 클래스 블럭 내에서는 일반 명령(대입)이 절대 오면 안된다
	
	{
		no1 = 1;
		no2 = 100; // 2. 초기화 블럭 
	}
	
	public Test01() {
		System.out.println(no1);
		
	}
	public static void main(String[] args) {
		new Test01();

	}

}
