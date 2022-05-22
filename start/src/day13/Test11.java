package day13;
/*
 	poem.txt 파일을 읽어서 출력해보자.
 */

// input output 장치 연결
import  java.io.*;

public class Test11 {

	public Test11() {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/day13/blackpink.txt");
			
			byte[] buff = new byte[1024];
			int len = fis.read(buff);
			String str = new String(buff, 0, len);
			System.out.println(str);
			
		} catch(Exception e) {
			System.out.println("### 예외 발생 ###");
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
