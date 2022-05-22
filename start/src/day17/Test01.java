package day17;

import java.io.*;


/*
 	파일에 내용을 저장하는 프로그램을 만들어 보자.
 */

public class Test01 {

	public Test01() {
		// 파일에 저장하기 위해서는 파일로 연결된 스트림이 필요하다.
		FileOutputStream fout = null;
		// 경로가 잘못되면 파일을 만들 수 없음으로 예외처리 필요 
		
		
		try{
			// 파일이 존재 하지 않아도 자동으로 만들어진다.
			fout = new FileOutputStream("src/day17/result/FileTest01.txt");
			/*
			 
			// 1. 한글자만 입력
			fout.write('j'); // char ==> int 자동 형변환
			
			
			// 2. 여러글자를 내보낸다.
			// 문자열 준비
			String song = "Hey boy\r\nMake 'em whistle like a missile, bomb, bomb"; // /r 커서를 맨왼쪽으로
			// 준비된 문자열을 바이트 배열로 변환
			byte[] buff = song.getBytes();
			// 배열을 스트림에 흘려보낸다.
			fout.write(buff); 
			
			*/
			// 지정 부분 내보내는 함수
			String song = "Make 'em whistle like a missile, bomb, bomb";
			byte[] buff = song.getBytes();
			// buff.lenth - 9 : 내보낼 갯수, 9 : 시작 인덱스
			fout.write(buff, 9, buff.length - 9 );
			
			
			System.out.println("### 파일 저장 성공 ###");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			 // 외부 장치와 연결된 경우는 해당 외부장치의 사용이 끝나면 닫아주는 것이 원칙이다.
			try {
				// 함수 자체가 호출한 곳에서 예외 전이 하는 함수
				fout.close(); 
				
			}catch(Exception e) {}
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
