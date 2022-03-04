package day04.ex;

import java.util.Scanner;

/*
	문제 3 ]	게시물을 게시판에 출력하는데 하나의 페이지에
			게시물을 15개를 출력할 예정이다. 게시물 수를 랜덤하게 발생시켜서
			게시판의 페이지가 몇페이지가 필요한지를 계산해서 출력해주는 프로그램 작성하세요
			게시물이 없는 경우는 게시물이 없는 페이지가 적어도 1페이지는 필요하다.
		
 */


public class Ex03 {
	public static void main(String[] args) {
		//입력도구
		Scanner sc = new Scanner(System.in);
		//입력 전 메시지 출력
		System.out.println("게시물 갯수 입력하기 : ");
		//입력 메세지 변수에 저장
		int num = sc.nextInt();
		//조건에 따라서 판별
		int soo = 0;
		int x = num/15;
		//15개 미만일 경우 1page
		if (num / 15 == 0) {
			soo = 1;
		}
		//15개 이상일경우 
		if (num / 15 !=0) {
			soo = x + 1;
		}
		//출력하기
		System.out.println("게시판에 게시물 갯수는 : " + num + "개 이며 page 수는 : " + soo + " page입니다.");
	}
	

}
