package day07;
/*
 	 정수 10랜덤하게 만들고 기억된 정수 내림차순으로 정렬해서 다시 기억
 */

import java.util.Arrays;

public class Test08 {

	public static void main(String[] args) {
		// 배열만들기
		int[] num = new int[10];
		// 데이터 채우기
		loop:
		for(int i = 0; i <num.length; i++) {
			int no = (int)(Math.random()*99+1);
			
			for(int j = 0; j < i; j++) {
				int soo = num[j];
				if(soo==no) {
					i--;
					//중복되는 경우이므로 숫자 생성 다시 반복
					continue loop;
				}
				}
			//중복검사 통과한 경우
			num[i] = no;
			}
			//채워진 내용 확인
			System.out.println(Arrays.toString(num));
			//정렬한다. i가 앞번호 
			for(int i = 0 ; i < num.length - 1 ; i++ ) {
				
				for(int j = i + 1 ; j < num.length ; j++ ) {
					/*
					int pre = num[i];
					int post = num[j];
					if(post > pre) {
						num[i] = post;
						num[j] = pre;
					}
					 */
					if(num[j] > num[i]) {
						int tmp = num[i];
						num[i] = num[j];
						num[j] = tmp;
					}
				}
			}
			
			// 배열 출력
			System.out.print("| ");
			for(int no : num) {
				System.out.print(no + " | ");
			}
		}

	}