package day11;

public class Circle01 extends Moyang {
	private int rad;
	private double around, area;
	
	// 생성자
	public Circle01() {}
	public Circle01(int rad) {
		this.rad = rad;
		setAround();
		setArea();
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getAround() {
		return around;
	}
	public void setAround(double around) {
		this.around = around;
	}
	// 오버로딩(중첩)
	public void setAround() {
		around = 2*rad*3.14;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	// 오버로딩(중첩)
	public void setArea() {
		area = rad* rad*3.14;
	}

	// Moyang의 toPrint 오버라이딩
	@Override
	public void toPrint() {
		System.out.printf("반지름이 %3d 이고, 둘레가 %6.2f 이고, 넓이가 %6.2f인 원", 
				rad, around, area);
		System.out.println();
	
	
	
}
}
