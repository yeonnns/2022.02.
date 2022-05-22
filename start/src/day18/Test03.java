package day18;

import java.io.*;
/*
 	이미지 파일을 문자단위 스트림으로 복사해보자. ==> 불가능
 	result / jennie.jpg -> jennie_copy.jpg
 	원칙은 문자단위 스트림으로 주고 받으면 안된다.
 	바이트 코드가 역순이 될수 있기 떄문에...
 	
 	결과는 복사된 이미지 파일이 안보이는것이 정상이다.
 */
public class Test03 {

	public Test03() {
		// 기본스트림 2개 필요 (읽는거, 쓰는거)
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/day18/result/jenny.jpg");
			fw = new FileWriter("src/day18/result/jenny_copy.jpg");
			
			// 몇번 반복해야 하는지 알 수 없으므로...
			char[] buff = new char[1024];
			while(true) {
				// 한쪽에서 읽어서 배열에 채워주고
				int len = fr.read(buff);
				// 읽은 데이터가 없는 경우
				if(len == -1) {
					break;
				}
				// 읽은 데이터 있는 경우 (다른쪽에 내용을 쓴다.)
				fw.write(buff, 0, len);
				
			}
			
			// 결과 출력
			System.out.println("@@@ 제니 사진 이뻐요 @@@");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
				
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
