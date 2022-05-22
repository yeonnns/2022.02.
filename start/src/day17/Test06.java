package day17;

import java.io.*;
import java.util.*;
public class Test06 {

	public Test06() {
	
		/*
		 	우리가 이제까지 키보드로 입력을 받을때 사용한 클래스는
		 	Scanner 클래스  ==> 꼭 입력받는게 아니고 장치 연결하는 클래스이다.
		 	이 클래스의 생성 방법 ]
		 		
		 		Scanner(InputStrean in)
		 		==> Scanner(System.in)
		 		
		 		Scanner(File file)
		 */
		
		// Scanner 를 이용해서 day17/result/FileTest01.txt 파일을 읽어보자.
		
		// File  준비
		File file = new File("src/day17/result/FileTest01.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			/*
			
			// 한 단어만 읽어서 출력 
			String str = sc.next();
			System.out.println(str);
			*/
			// 한 행을 읽어서 출력
			String str = sc.nextLine();
			System.out.println(str);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}

	public static void main(String[] args) {
		new Test06();
	}

}
