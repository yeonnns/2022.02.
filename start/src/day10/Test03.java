package day10;

/*
 	Black Pink 멤버의 정보를 기억할 배열을 만들고
 	데이터를 입력하고
 	완성이 되면 내용을 출력하세요.
 	단, 각 멤버의 정보는 Friend 클래스에 기억시키도록 한다.
 	지역변수

 */

public class Test03 {
	// 배열로 저장 할 변수만 만들어 놓은 상태
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int [] naee;
	char gen;
	String addrs ;
	
	
	public Test03() {
		// 멤버 변수들 초기화
		setData();
		
		// 필요한 데이터들이준비된 상태
		// 각 멤버를 배열 하나로 관리
		Friend[] black = getBlack();
		
		
		//내용출력
		for(Friend f : black) {
			System.out.println(f);
			// 이렇게 하면 Friend 클래스에 재정의한 toString() 함수가 자동 호출
		}
		
			// 내가 만든 배열 출력
		System.out.println();
		System.out.println("==================================================1번");
			toPrint(black);
	}
	
	// Friend 배열 내용 출력해주는 함수
	public void toPrint(Friend[] b) {
		for(int i = 0; i<b.length;i++) {
			// 이때 배열의 각 방에 기억된 객체들의 멤버변수는 접근이 불가능 하므로
			// 접근 할 수 있는 함수를 호출해서 처리해야 한다.
			String name = b[i].getName();
			String addr = b[i].getAddr();
			String tel = b[i].getTel();
			String mail = b[i].getMail();
			String birth = b[i].getBirth();
			int age = b[i].getAge();
			char gen = b[i].getGen();
			
			
			System.out.println("이름 : " + name);
			System.out.println("주소 : " + addr);
			System.out.println("생일 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("전화 : " + birth);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + (gen == 'M'? "남자" : "여자"));
			System.out.println("===================================================");
		}
		
		
	}
	
	
	// 준비된 데이터를 Friend[] 타입의 데이터로 만들어서 반환해주는 함수
	public Friend[] getBlack() {
		// 이 함수는 Friend[] 배열을 만들고
		Friend[] anne = new Friend[4]; // 아직 각 방에 Friend 타입의 객체는 들어있지 않고 기억할 공간만 확보한 상태
		
		// 각방에 Friend 객체들을 채워준다.
		for(int i = 0; i<4;i++) {
			// 4명분 데이터가 입력되어야 하므로
			// Friend 객체를 4개 만들어서 각 방에 집어 넣는다.
			anne[i] = new Friend();
		}
		// 위의 반복문이 종료가 되면 각 방에 있는 객체의 변수에 데이터를 입력할 수 있는 상태
		
		// 데이터를 채워서
			for(int i = 0; i<anne.length;i++) {
			Friend f = anne[i];
			
			String name = names[i];
			f.setName(name);
			
			f.setAddr(addrs);
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setAge(naee[i]);
			f.setGen(gen);
			
			
			
			}
		
		// 채워진체의 배열을 반환해준다.
		return anne;
	}
	// 각 데이터를 초기화 시켜주는 함수
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수"};
		tels = new String[] {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444"};
		email = new String[] {"jennie@githrd.com", "Lisa@githrd.com", 
				"rose@githrd.com", "jisoo@githrd.com"};
		birthday = new String[] {"1997/03/08", "1996/04/05", "1998/05/05", "1997/07/07"};
		naee = new int[] {27, 28, 26, 27};
		gen = 'F';
		addrs = "ygM";

	}

	public static void main(String[] args) {
		new Test03();

	}

}
