package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		/*
		 	 정수 6개 관리할 배열 arr을 만들고
		 	 1~6까지 채워서
		 	 한개씩 꺼내서 출력하세요.
		 */
		
		// 배열 변수 선언
		/*
		 	배열 변수의 선언 형식
		 		데이터타입[] 	변수;
		 */
		
		int[] arr;
		//배열 변수 초기화
		arr = new int[6];
		
		//출력
		//	배열의 길이를 알아내는 방법 : 배열.length
		int len = arr.length;
		for(int i = 0; i < len ; i++) {
			//배열에 기억된 데이터 꺼내는 방법
			//		 배열 변수[위치값]
			int no = arr[i];
			System.out.println(no);
			/*
			 	heap에 만들어지는 기본데이터 타입 변수들은 모두 자동 초기화된다.
			 	boolean : false
			 	char 	: 아스키 코드값 0에 해당하는 문자
			 	byte 	: 0
			 	short 	: 0
			 	int 	: 0
			 	long 	: 0
			 	float 	: 0.0f
			 	double 	: 0.0
			 */
		}
		
		//블랙핑크 멤버 이름 기억
							// 베열의 길이는 4  - 위치값은 0 1 2 3
		String[] blackpink = new String[4];
		//출력
		for(int i=0; i < blackpink.length ; i++) {
			System.out.println(blackpink[i]);
		}
		blackpink[0] = "제니";
		blackpink[1] = "로제";
		blackpink[2] = "지수";
		blackpink[3] = "리사";
		
		//출력
		System.out.println(blackpink);
		//내용 출력 함수 Arrays.toString(배열변수);
		//import
		System.out.println(Arrays.toString(blackpink));
		
		for(int i= 0 ; i < blackpink.length; i++ ) {
			
			/*여러개의 데이터를 관리하는 데이터 타입들은
			데이터 한개를 꺼냈을 때의 그 데이터의 타입을 먼저 생각해봐야한다.
			*/
			//i번째 멤버의 이름을 꺼내서 변수에 기억시키기
			String name = blackpink[i];
			//변수에 기억된 데이터를 출력
			System.out.println(name);
		}
		
		//둘리 멤버를 추가해서 출력하세요
		/*
		 	 배열은 한번 만들어지면 크기와 타입을 수정할 수 없다.
		 	 따라서 데이터의 갯수와 수정이 필요하면 다시 만들기
		 	 
		 */
		
		//배열 다시 만들기
		String[] tmp = new String[5];
		for(int i = 0 ; i<4 ; i++ ) {
			tmp[i] = blackpink[i]; 
				
			}
			//이렇게 하면 5번쨰 방은 비어있음.
			tmp[4] = "둘리";
			
			blackpink = tmp;
			
			// 하나씩 꺼내서 출력
			// 배열과 같은 데이터는 향상된 for 명령이 데이터를 꺼내서 사용하는게 편하다.
			
//			String name = blackpink[i];
//			System.out.println(name);
			
			
			for(String name : blackpink) {
				// blackpink의 데이터를 순차적으로 하나씩 꺼내서 name변수에 기억시키기.
				
				//출력
				System.out.print(name + " ");
			}
			
		}
		
	}


