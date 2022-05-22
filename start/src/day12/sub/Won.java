package day12.sub;

public class Won implements Figure{
	private int rad;
	private double arround, area;

	// 생성자
	public Won() {}
	public Won(int rad){
		this.rad = rad;
		setArround();
		setArea();
	}
	// figure클래스에 있는 함수 오버라이딩
	@Override
	public void setArea() {
		area = rad *rad*Math.PI;
		
	}
	// 셋터 함수를 오버로딩(원래는 있지만 ,매개변수 없에고 오버로딩)
	public void setArround() {
		arround = 2*rad*Math.PI;
	}
	
	
	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d 이고 둘레가 %6.2f 이고 면적이 %6.2f 입니다.", rad, arround, area);
		System.out.println();
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

		
	}

