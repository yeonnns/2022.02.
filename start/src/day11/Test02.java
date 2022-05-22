package day11;

public class Test02 {
	// 생성자는 void(반환값) 절대 가지면 안된다.
	public Test02() {
		// 원 하나 만들기
		Won c1 = new Won((int)(Math.random()*21+5));
		
		// c1의 둘레 계산
		int rad = c1.getRad();
		double around = rad*2*Won.PI;
		double area = rad*rad*Won.PI;
		
		
		c1.setAround(around);
		c1.setArea(area);
		
		System.out.printf("반지름이 %3d 이고, 둘레가 %7.2f 이고 , 넓이가 %7.2f 인 동그라미", 
				rad, around, area);
	}

	public static void main(String[] args) {
		new Test02();

	}

}
