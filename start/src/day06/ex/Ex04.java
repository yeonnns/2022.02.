package day06.ex;

/*
문제 4 ]
	
	다음 형태로 출력하세요
	
*****
*****
*****
*****
*****


*****
****
***
**
*



    *
   **
  ***
 ****
*****

  *
 ***
*****


 */
public class Ex04 {

	public static void main(String[] args) {
		int i= 0;
		int j = 0;
		for( i=0; i<5; i++ ) {
			for( j = 0; j<5;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();
		for( i=0; i<5; i++ ) {
			for( j = 0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for( i=0; i<5; i++ ) {
			for( j = 0; j<4-i;j++) {
				System.out.print(" ");
			}
			for( j = 0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for( i = 1; i<4;i++) {
			for(j = 3;j-i>0;j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
