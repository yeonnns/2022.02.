package summary;

import java.util.ArrayList;

public class ThreadExam implements  Runnable  {
	
	int seq;

	public ThreadExam(int seq) {
	        this.seq = seq;
	    }
	
	public void run() {
        System.out.println(this.seq + " thread start.");  
        try {
            Thread.sleep(1000);  // 1초 대기
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end."); 
    }
	
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {  //  10개의 쓰레드를 생성하여 실행
            Thread t = new Thread(new ThreadExam(i));
            t.start();
            threads.add(t);
        }
         
        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다림
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");  // main 메소드 종료
    }
}