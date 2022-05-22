package day11;

public class Sagak extends Figure{
	private int width, height;
	
	// 생성자 
	public Sagak() {}

	public Sagak(int width, int height) {
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


	
	// figure에서 상속받은 setAreat 수정
	@Override
	public void setArea() {
		area = width * height;
	}
}