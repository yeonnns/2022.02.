package day15;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 	파라미터로 전달된 문자열
 	http://www.blackpink.org/member/?id=euns&pw=12345&tel=01031759042
 	중에서 넘겨진 데이터만 잘라서 출력하세요.
 */

public class Test01 {

	public Test01() {
		String url = " http://www.blackpink.org/member/?id=euns&pw=12345&tel=01031759042";
		// 위 문자열에서 데이터 부분만 출력하려면 
		// ? 기호의 위치값을 알아낸후 그 바로 다음위치에서부터 끝까지 잘라내면 된다.
		
		// 위치값찾기
		int idx = url.indexOf('?');
		// url은 스트링 클래스 타입 . 사용시 접근하겠다.		
		String param = url.substring(idx+1);
		System.out.println(param);
		System.out.println("+++++++++++++++++++++++++");
		
		// 만들어진 문자열을 & 기준으로 잘라내서 배열에 담아보자
		StringTokenizer token = new StringTokenizer(param, "&");
		int cnt = token.countTokens();
	
		// 문자열을 배열을 만든다.
		String[] tmp = new String[cnt];
		
		// 배열에 잘려진 내용을 순차적으로 채움.
		/*
		int i = 0;
		while(token.hasMoreTokens()) {
			// 토큰에 있는 문자열 잘라서 tmp[i] 번째에 넣음
			tmp [i] = token.nextToken();
	 		i++
 
		 */
		
		for(int i = 0; token.hasMoreTokens();i++) {
			// 이 명령을 실행하는 순간 임시(buffer)메모리에서 꺼낸 데이터는 삭제하게 된다.
			tmp[i] = token.nextToken();
		}
		/*
		 	반복문에서 조건식의 의미는 반복횟수의 컨트롤에 의미가있다.
		 */
		System.out.println(Arrays.toString(tmp));
		String[][] data = new String[cnt][2];
		for(int i = 0; i<tmp.length;i++) {
			String str = tmp[i];
			StringTokenizer tk = new StringTokenizer(str, "=");
			
			data[i][0] = tk.nextToken();
			data[i][1] = tk.nextToken();
		}
		
		// 결과 출력
				for(String[] arr : data) {
					/*
					for(String s : arr) {
						System.out.print(s + " : ");
					}
					System.out.println();
					 */
					System.out.println(arr[0] + " : " + arr[1]);
				}
			}

			public static void main(String[] args) {
				new Test01();
			}

		}