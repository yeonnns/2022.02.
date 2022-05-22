package day11;

public class Nemo {
	private int garo, sero, area, rank;
	
	// 기본 생성자(아무것도 안하는 변수에 셋팅 안해주는 생성자)
	public Nemo() {}
	
	// 입력 받은 데이터를 세팅해서 객체로 만들 수 있는 생성자
	public Nemo(int  garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		//area = garo*sero;
		setArea();
		rank = 1;
	}
	
	

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	// 오버로딩 (증첩)
	public void setArea() {
		area = garo*sero;
	}

	public static void main(String[] args) {
		new Nemo();

	}

	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + ", rank=" + rank + "]";
	}

}
