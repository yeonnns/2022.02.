package day07.ex;
/*
 	Ex02 ]
 		int[] coin = {10000,5000,1000,500,100,50,10,1};
 		을 준비하고
 		
 		79456원을 coin에 기억된 화폐단위로 지불하려고 할때 각각의 단위가 
 		몇장씩 필요한지 배열에 기억시켜서 배열의 내용을 출력하세요.
 		
 		출력 예 ]
 			10000	: 7
 			5000	: 1
 			...
 			1		: 6
 */

public class Ex02 {

	public static void main(String[] args) {
		//배열 만들기
		int[] coin = {10000,5000,1000,500,100,50,10,1};
		int [] num = new int[8];
		int don = 79456;
		int result = 0;
		int tmp = 0;
		
		result = don/10000;
		num[0] = result;
		
		tmp = don %10000;
		
		result = tmp/5000;
		num[1] = result;
		tmp %=5000;
		
		result = tmp/1000;
		num[2] = result;
		tmp %=1000;
		
		result = tmp/500;
		num[3] = result;
		tmp %=500;
		
		result = tmp/100;
		num[4] = result;
		tmp %=100;
		
		result = tmp/50;
		num[5] = result;
		tmp %=50;
		
		result = tmp/10;
		num[6] = result;
		tmp %=10;
		

		num[7] = tmp %=10;
		
		
		
		for(int i = 0; i<coin.length;i++) {
			System.out.println(coin[i] + " | " + num[i]);
		}
	
		
		

	}

}
