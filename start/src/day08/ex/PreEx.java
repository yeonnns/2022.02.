package day08.ex;

/*
다음 내용은 다중 반복문과 2원배열 연습용 문제입니다.
모두 풀 수 있다면 좋겠지만
풀지 못하는 문제가 있다 해도 상관없으니
미진한 부분 연습용으로 활용하시기 바랍니다.

1. 
	1  1  1  1  1
	2  2  2  2  2
	3  3  3  3  3
	4  4  4  4  4
	5  5  5  5  5
	
2. 
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
	1  2  3  4  5
3. 
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1
	5  4  3  2  1

4.
	1  2  3  4  5
	5  4  3  2  1
	1  2  3  4  5
	5  4  3  2  1
	1  2  3  4  5
	
5. 
	 1  2  3  4  5
	 6  7  8  9 10
	11 12 13 14 15
	16 17 18 19 20
	21 22 23 24 25
	
6.
	 1  2  3  4  5
	10  9  8  7  6
	11 12 13 14 15
	20 19 18 17 16
	21 22 23 24 25
	
7.
	1  0  0  0  0
	1  2  0  0  0
	1  2  3  0  0
	1  2  3  4  0
	1  2  3  4  5
	
8.
	 1  0  0  0  0
	 2  3  0  0  0
	 4  5  6  0  0
	 7  8  9 10  0
	11 12 13 14 15
	
9.
	 0  0  0  0  1
	 0  0  0  1  2
	 0  0  1  2  3
	 0  1  2  3  4
	 1  2  3  4  5
	     
10.
	 0  0  0  0  1
	 0  0  0  2  3
	 0  0  4  5  6
	 0  7  8  9 10
	11 12 13 14 15
*/


public class PreEx {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		System.out.println("1---------");
		for( i = 0; i<5; i++) {
			for(j = 0; j<5;j++ ) {
				System.out.print(1+i + " ");
			}
					System.out.println();
		}
		System.out.println("2---------");
		for( i = 0; i<5; i++) {
			for(j = 0; j<5;j++ ) {
				System.out.print(1+j + " ");
			}
					System.out.println();
		}

		System.out.println("3---------");
		for( i = 0; i<5; i++) {
			for(j = 0; j<5;j++ ) {
				System.out.print((5-j) + " ");
			}
			System.out.println();
		}
		
		System.out.println("5---------");
		for( i = 0; i<5; i++) {
			for(j = 0; j<5;j++ ) {
				System.out.print(((5*i)+(j+1)) + " ");
			}
			System.out.println();
		}
				
				
			}
	}


