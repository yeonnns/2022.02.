package day11;

public class Nemo01 extends Moyang {
	private int width, height;
	private double area;
	
	// 기본 생성자
	public Nemo01() {}
	public Nemo01(int width, int height) {
		this.width = width;
		this.height = height;
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
	// 오버로딩(중첩)
	public void setArea() {
		area = width * height;
	}
	
	// 오버라이딩 (재정의) 함수는 재정의한 함수 출력
	@Override
	public void toPrint() {
		System.out.printf("가로가 %3d 이고, 세로가 %3d 이고,  넓이가 %6.2f인 사각형", 
				width, height, area);
		System.out.println();
}
}
