package day14;
/*
	문제 2 ]
		사각형의 정보를 기억하는 클래스 Nemo를 제작하세요.
		필요한 변수와 함수, 생성자는 필요한만큼 추가하고
		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로 처리되도록
		equals() 함수를 오버라이드 하세요.
		이클래스 객체를 출력하면 내용이 출력되도록 toStrin() 를 오버라이드 하세요.
*/

public class Ex02_Nemo {
	private int width, height;
	// 기본 생성자
	public Ex02_Nemo() {}
	public Ex02_Nemo(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int setHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "사각형 - 가로 : " + width + " , 세로 : " + height;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Ex02_Nemo nam = (Ex02_Nemo) o;
		int garo = nam.getWidth();
		int sero = nam.setHeight();
		
		bool = (this.width == garo && this.height == sero);
		return bool;
		
	}
	

}
