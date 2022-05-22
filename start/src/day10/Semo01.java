package day10;

public class Semo01 {
	//전역변수
	private int height, width;
	private double area;
	
	
	public Semo01() {
		// 아무것도 입력받지 않고 이 클래스를 객체로 만든다면 
		// 높이와 너비를 1로 세팅해서 삼각형을 만들기로 하자. 0으로 두면 (점)이 됨
		// 아래와 같으니까 this로 생성
		/*
		height = 1;
		width = 1;
		setArea();
		*/
		this(1,1); // 아래에 정의된 생성자를 호출하는 것이다.
				   // 이때 이함수를 호출할떄 반드시 생성자의 첫줄 첫문장으로 기술
	}
	
	// 이 생성자는 높이와 너비를 입력받아서 삼각형 객체로 만들어 주는 기능의 생성자
	// 역할 ] 입력된 숫자를 높이와 너비에 입력하고 넓이 구해서 세팅해주는 역할
	// 생성자 오버로딩...
	public Semo01(int height, int width) {
		//전역변수 height에다가 입력된 변수 저장하겠다.
		this.height = height; 
		this.width = width; 
		//area = garo*sero;
		setArea();
	}
	// 오버로딩
	public void setArea() {
		area = width * height / 2.;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
}

