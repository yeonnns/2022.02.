package day06.ex;

/*
문제 3 ]
	
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

1 2 3 4 5
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8
5 6 7 8 9

1  2  3  4  5
6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

1
2  3
4  5  6
7  8  9 10
11 12 13 14 15
*/

public class Ex03 {

	public static void main(String[] args) {
		//for 문 사용
		int i= 0;
		int j = 0;
		for( i=0; i<5; i++ ) {
			for( j = 0; j<5;j++) {
				System.out.print(1+i);
			}
			System.out.println();

		}
		System.out.println();
		for( i=0; i<5; i++ ) {
			for( j = 0; j<5;j++) {
				System.out.print(1+j);
			}
			System.out.println();

		}
		System.out.println();
		for( i=0; i<5; i++ ) {
			for( j = 0; j<5;j++) {
				System.out.print((1+j)+i*1);
			}
			System.out.println();

		}
		System.out.println();
		for( i=0; i<5; i++ ) {
			for( j = 0; j<5;j++) {
				System.out.print((j+1)+(5*i));
			}
			System.out.println();

		}
		System.out.println();
		for( i=0; i<5; i++ ) {
			for( j =0 ; j<i+1;j++) {
				System.out.print(j+1);
			}
			System.out.println();

		}
		System.out.println();
		for( i=0; i<5; i++ ) {
			for( j =1 ; j<i+2;j++) {
				System.out.print((2*i)+j);
			}
			System.out.println();

		}
		System.out.println();
		int no = 1;
		for( i = 0;i<5;i++) {
			for(j = 0;j<=i;j++) {
				System.out.print(no);
			}System.out.println();
		}
		
	}
	

}
