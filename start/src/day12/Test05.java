package day12;


// 변수는 레퍼런스 쪽 따른다.
public class Test05 {
	public Test05() {
		Num num = new Num();
		Num no = new No();
		
		System.out.println("num.no : " + num.num);
		System.out.println("no.no : " + no.num);
	
	
	}

	public static void main(String[] args) {
		new Test05();

	}

}
class Num{
	int num = 10;
}

class No extends Num{
	int num = 999;
}
