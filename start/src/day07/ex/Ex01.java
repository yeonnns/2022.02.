package day07.ex;
/*
 	Ex01 ] 
 		'A' - 'J' 까지의 문자를 랜덤하게 100만들고
 		각문자의 출현횟수를 기억할 배열을 만들어서
 		횟수만큼 '*'출력해주는 프로그램을 작성하세요.
 		
 		문자 저장할 배열 10개 만들기.
 		
 		예 ]
 			A [5] : ***** 
 			B [20] : ********************
 			...
 			j [7] : ******* 
 			
 			'A' + 0 ==> 'A'
			'A' + 1 ==> 'B' 
 */



public class Ex01 {

	public static void main(String[] args) {
		// 배열의 주소를 기억할 변수
		int[] alpCount = new int[10];
		
		for(int i = 0; i<alpCount.length;i++) {
			alpCount[i] = 0;
		}
	System.out.println(alpCount[2]);
		
		for(int i = 0; i<100; i++) {
			char alp = (char)(Math.random()*('J'-'A'+1)+'A');
			System.out.print(alp);
			int idx = alp - 'A';
			alpCount[idx] +=1;
		
		
		}
		
		
		for(int i = 0; i<alpCount.length;i++) {
			
				
			}
		
		}
	

			//출력
		

		
		}
				
		
		
	}



