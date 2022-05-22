package day12;
// 정보 기억하는 클래스로 메인 함수 필요 X
/*
 	이 클래스는 Figure 라는 추상 클래스를 상속 받아서 만든 클래스이다.
 	따라서 상위 클래스가 가지고 있는 추상함수를 100% 모두 구현해야 한다.
 */
public class Semo extends Figure{
	private int width, height;
	private double area;
	
	public Semo() {}
	public Semo(int width, int height) {
		this.width =width;
		this.height =height;
		setArea();
		
	}
	@Override
	public  void setArea() {
		area = width*height / 2.0;
	}
	@Override
	public void toPrint() {
		System.out.printf("이 삼각형은 밑변이 %3d, 높이가 %3d이고, 면접이 %6.2f 입니다.",
				width, height, area );
		System.out.println();
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
	
}
