package day11;


// 원 한개의 정보를 기억할 클래스
public class Won {
	private int rad;
	private double around, area;
	public static final double PI = 3.14; // 상수 대문자 PI
	

	// 기본 생성자
	public Won() {}
	
	public Won(int rad) {
		this.rad = rad;
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
	// 오버로딩
	public void setAround() {
		around = 2*rad*Won.PI;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	// 오버로딩
	public void setArea() {
		area = rad*rad*Won.PI;
	}
}
