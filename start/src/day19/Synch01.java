package day19;

public class Synch01 {
	// 블록 아래 있으면 기본 타입은 0으로 초기화, heap에 저장
	int[] num = new int[5];
	
	public Synch01() {
//		super();  암묵적으로 상위 클래스의 기본 생성자가 호출이 된 상태
		/*
		 	this : 현재 실행중인 자기자신의 주소를 기억하는 예약된 변수
		 	
		 	super : 상위 클래스의 주소를 기억하는 예약된 변수
		 	
		 */
		
		NumThread01 t1 = new NumThread01(this);
		NumThread02 t2 = new NumThread02(this);
		// New Born 상태
		
		// Runnable 상태로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Synch01();
	}

}


class NumThread01 extends Thread{
	Synch01 main; // 넘겨주는 주소를 받을 준비를 한다.
	
	public NumThread01() {}
	// 주소를 넘겨받아서 이 클래스를 new 시킨다.
	public NumThread01(Synch01 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		/*
		 	 이 스레드 에서는 배열 변수에 데이터를 기억하는 역할을 할 예정이다.
		 	 이 스레드가 5개의 데이터를 완성 할 때 까지는 
		 	 다른 스레드는 배열을 사용 하지 못하게 하고 싶다.
		 */
		
		// 메세지 출력
		System.out.println("### 이제 저장할 차례 ###");
		synchronized(main.num) {
			for(int i = 0; i<5;i++ ) {
				int no = (int)(Math.random()*99+1); // 1~99 사이의 랜덤한 정수
				main.num[i] = no;
				System.out.println((i+1) + "번째 방에 [ " + no + " ] 를 기억했습니다.");
				// 잠시 쉬는 시간을 랜덤하게 주도록한다.(0.5~2초)
				int sec = (int)(Math.random()*1501+500);
				try {
					Thread.sleep(sec);
				}catch(Exception e) {}
			}
			System.out.println("\t***** 저장완료 *****");
		}
	}
}

class NumThread02 extends Thread{
	Synch01 main; // 주소를 기억할 준비
	
	public NumThread02() {}
	public NumThread02(Synch01 main) {
		this.main = main;
	
	}
	
	@Override
	public void run() {
		// 이  스레드는 배열변수의 데이터를 꺼내서 사용하는 역할을 할 예정
		System.out.println("\t\t\t이제 사용할 차례.....");
		synchronized(main.num) {
			// main의 num 배열을 사용하는 동안은 다른곳에서 배열을 사용하면 안된다.
			for(int i = 0; i<5;i++) {
				int no = main.num[i];
				// 숫자를 꺼냈으므로 출력한다.
				System.out.println("\t\t\t*** " + no + "를 사용했어요~~~~!");
				// 쉬는 시간을 랜덤하게 전할예정...
				int sec = (int)(Math.random()*1501+500);
				try {
					Thread.sleep(sec);
				}catch(Exception e) {}
			}
			System.out.println("\t\t\t@@@@@@ 사용 종료 @@@@@@");
		}
	}

}