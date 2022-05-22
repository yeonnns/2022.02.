package day16.ex;
/*
학생들의 과목점수를 기억하는 HashMap을 만들고
다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하세요.
과목은
	국어, 영어, 수학, 과학, 국사
의 점수를 기억하도록 하세요.
*/

public class Students {
	private String name;
	private int kor, eng, math, sci, guk;
	public Students() {}
	public Students(String name, int kor, int eng, int math, int sci, int guk) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.guk = guk;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getGuk() {
		return guk;
	}
	public void setGuk(int guk) {
		this.guk = guk;
	}
	@Override
	public String toString() {
		return String.format("--------------------\n이름 : %5s\nkor : %3d\neng : %4d\nmath : %3d\nsci : %3d\nguk :%3d " ,
										name, kor, eng, math, sci, guk);
	}

}
