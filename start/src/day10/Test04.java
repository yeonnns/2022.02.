package day10;

public class Test04 {
	
	// 변수 선언
		String[] names;
		String[] tels;
		String[] email;
		String[] birthday;
		int [] naee;
		char gen;
		String addrs;
		
		//[전역변수]
		Friend[] black;
	public Test04() {
		// 데이터 변수를 세팅하고
		setData();
		//배열 완성하고
		setBlack();
		//출력
		toPrint();
	}
	
	// Friend 배열 내용 출력해주는 함수
		public void toPrint() {
			// 이 함수가 호출되면 전역변수 black 의 내용을 출력할 일이 있을 떄이므로
			// 별도의 데이터를 입력 받지 않아도 배열에 접근 가능하다.
			for(int i = 0; i<black.length;i++) {
				// 이때 배열의 각 방에 기억된 객체들의 멤버변수는 접근이 불가능 하므로
				// 접근 할 수 있는 함수를 호출해서 처리해야 한다.
				String name = black[i].getName();
				String addr = black[i].getAddr();
				String tel = black[i].getTel();
				String mail = black[i].getMail();
				String birth = black[i].getBirth();
				int age = black[i].getAge();
				char gen = black[i].getGen();
				
				
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
		
	public void setBlack() {
		// 데이터 기억할 공간 확보하고
		black = new Friend[4];
		
		// 확보된 공간에 데이터 채워주고
		for(int i = 0; i<black.length;i++) {
			black[i] = new Friend();
		}
		// 각 방의 객체에 데이터 채워주고
		for(int i = 0; i<black.length;i++) {
			Friend f = black[i];
			
			f.setName(names[i]);
			f.setTel(tels[i]);
			f.setAddr(addrs);
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setAge(naee[i]);
			f.setGen(gen);
		
		}
	}
	// 각 데이터를 초기화시켜주는 함수
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
	new Test04();
}
}
