package day12.Ex;

import day12.Figure;

public class Print {
	private Sample[] sam;
		
	public Print() {
		sam = new Sample[3];
		Fish f1 = new Fish("오징어");
		Fish f2 = new Fish("연어");
		
		Fruit g1 = new Fruit("사과");
		
		Sample s1 = f1;
		Sample s2 = f2;
		
		Sample s3 = g1;
		
		System.out.println("abc() : " + s3.abc());
		System.out.println("toString() : " + f1.toString());
		
		sam[0] = s1;
		sam[1] = s2;
		sam[2] = s3;
		
		/*
		sam[0] = new Fish("오징어");
		sam[1] = new Fish("연어");
		sam[2] = new Fruit("사과");
		
		for(Sample s : sam) {
			System.out.println(s.abc()); // 함수는 인스턴스쪽을 따른다.
		}
		 */
	}

	public static void main(String[] args) {
		new Print();
	}

}
