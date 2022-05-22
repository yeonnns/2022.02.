package day14;

public class Ex01_One {
	private int rad;
	private double area, dul;


	public Ex01_One() {}
	
	public Ex01_One(int rad) {
		this.rad = rad;
		setArea();
		setDul();
		
	}
	// 오버로딩
	public void setArea() {
		area = rad*rad*3.14;
	}
	public void setDul() {
		dul = 2*rad*3.14;
	}
	
	

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getDul() {
		return dul;
	}

	public void setDul(double dul) {
		this.dul = dul;
	}

	@Override
	public String toString() {
		return "one [rad=" + rad + ", area=" + area + ", dul=" + dul + "]";
	}
	
/*
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Ex01_One nam = (Ex01_One) o;
		int ban = nam.getRad();
		
		bool = this.rad == ban;
		
		return bool;
	}
*/
	@Override
	public boolean equals(Object o) {
		// 반환값 변수, 초기값 셋팅
		boolean bool = false;
		
		Ex01_One nam = null;
		
		try {
			nam = (Ex01_One) o;
		} catch(Exception e) {
			// 만약 입력된 객체가 Nemo로 강제형변환할 때 예외가 발생하면
			// 이 작업 이후의 모든 작업들은 실행자체가 무의미해진다.
			// 따라서 이 함수의 실행 결과는 "다르다"가 될 것이고
			// 이 함수의 실행을 즉시 멈춰줘야 할 것이다.
			return false;
		}
		
		// 남의꺼 면적 꺼내오고
		int ban = nam.getRad();
		
		// 비교해서 결과 만들고
		bool = this.rad == ban;
		
		return bool;
	}

}
	



