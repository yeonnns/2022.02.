package day18;

import java.io.*;
public class Test01 {
	
	/*
	 	char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
	 */

	public Test01() {
		// 타겟스트림(기본) 준비
		FileWriter fw = null;
		
		try {
			 fw = new FileWriter("src/day18/result/휘파람.txt");
			/*
			
			// 1. 한글자만 (2바이트만)
			char ch = '휘';
			fw.write(ch);
			
			// 2. 여러 글자를 저장해보자
			// 문자열 준비
			String str = "\t\t\t휘파람\r\n\t\t\t\t\t블랙핑크";
			// 여기서는 문자 단위로 처리 ==> 문자 배열 준비
			// 문자열을 문자배열로 변환시켜주는 함수(toCharArray)
			char[] buff = str.toCharArray();
			fw.write(buff);
			
				참고	]
					char단위는 텍스트 데이터만 처리하도록 되어있기 떄문에 기본함수에 문자처리 기능이 추가되어 있다.
			
			*/
			
			 // 변환 없이 문자열 바로 넣어도 됨
			 String str = "\t\t\t휘파람\r\n\t\t\t\t\t블랙핑크";
			 fw.write(str);
			 
			
			System.out.println("***** 저장 성공 *****");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Test01();
	}

}
