package day11;

public class Semo01 extends Moyang {
	private int width, height;
	private double area;
	
	public Semo01() {}
	public Semo01(int width, int height) {
		this.width=width;
		this.height=height;
		setArea();
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() { 		//overloading
		area = width *height /2. ;
	}
	
	/*
	 	overriding 규칙
	 		0. 상속해준 클래스에 고쳐쓸 함수가 존재해야한다.
	 		1. 함수의 원형을 유지한다.
	 			반환값 타입 + 함수이름 + 매개변수리스트
	 		2. 접근 지정자sms 같거나 넓은 방형으로...
	 		3. 예외처리는 같거나 좁은 방향으로....
	 		
	 */
	
	// Moyang의 toPrint 오버라이딩
	@Override
	public void toPrint() {
		System.out.printf("밑변이 %3d 이고, 높이가 %3d 이고, 넓이가 %6.2f인 삼각형", 
				width, height, area);
		System.out.println();
	}
}
