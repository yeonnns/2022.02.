package day11;

public class Test05 {

	public Test05() {
		Grand g1 = new Grand();
		
		Grand g2 = new Father();
		
		Grand g3 = new Son();
		System.out.print("g1.abc() : ");
		g1.abc();
		System.out.print("g2.abc() : ");
		g2.abc();
		System.out.print("g3.abc() : ");
		g3.abc();
		System.out.println("g1.no : " + g1.no);
		System.out.println("g1.no : " + g2.no);
		System.out.println("g1.no : " + g3.no);
		
//		g2.xyz(); grand에 없어서 사용 불가능
		((Father)g2).xyz();
		((Son)g3).xyz();
		
		System.out.println(g3 instanceof Son);
		
	}
	public static void main(String[] args) {
		new Test05();

	}

}

class Grand{
	int no = 80;
	void abc() {
		System.out.println("나는 Grand....!");
	}
}

class Father extends Grand{
	int no = 40;
	void abc() {
		System.out.println("\t나는 Father....!");
	}
	void xyz() {
		System.out.println("*****************");
	}
}

class Son extends Father{
	int no = 10;
	void abc() {
		System.out.println("\t나는 son....!");
}
	void xyz() {
		System.out.println("#####################");
	}
}
