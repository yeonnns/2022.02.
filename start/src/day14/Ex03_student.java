package day14;
/*
	문제 3]
		학생 한명의 성적을 관리하는 클래스 Student 를 작성하세요.
		기억할 내용은
			반, 이름, 국어, 영어, 수학, 총점
		을 기억하도록 하고
		필요한 기능(함수)는 필요한 만큼 추가해주세요.
		단, 학생의 반과 이름이 같으면 같은 학생으로 처리되도록 하세요.equals()
		학생변수를 출력하면 모든내용이 출력되도록 함수를 오버라이딩 하세요.
*/

public class Ex03_student {
	private int ban, kor, eng, math, sum;
	private String name;	
	
	public Ex03_student() {}
	public Ex03_student(int ban, String name, int kor, int eng, int math) {
		this.ban = ban;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setSum();
	}
	// 오버로딩
	public void setSum() {
		sum = kor + eng + math;
	}
	
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		return "student [ban=" + ban + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sum=" + sum + "]";
	}
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Ex03_student nam = (Ex03_student)o;
		int uban = nam.getBan();
		String uname = nam.getName();
	
		bool = (this.ban == uban && this.name == uname);
		return bool;
	}

}
