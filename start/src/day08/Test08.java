package day08;
/*
 	"Black Pink"라는 문자열을 기억하는 변수 str을 만들고
 	그 중에서 
 		1. black만 추출해서 출력
 		2. pink만 추출해서 읿력
 */

public class Test08 {

	public static void main(String[] args) {
		// 문자열 변수
		String str = "black Pink";
				
		//잘라낸 단어 변수
		String word1, word2;
		
		// Black 추출
		
		//' '의 위치
		int idx1 = str.indexOf(' '); //문자열중 특정 문자의 위치값
		word1 = str.substring(0, 5);
		word1 = str.substring(0, idx1);
		
		// Pink 추출
		word2 = str.substring(str.indexOf('P'));
		
		//출력
		System.out.println(word1);
		System.out.println(word2);
	}

}
