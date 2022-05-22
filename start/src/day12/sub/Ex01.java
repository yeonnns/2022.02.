package day12.sub;

/*
	 랜덤하게 3~5 정수를 발생시켜서
	 3이 나오면 삼각형
	 4가 나오면 사각형
	 5가 나오면 원
	 의 형태로 10개 의 도형을 만들어서
	 하나의 변수로 관리하고
	 각 도형의 내용을 출력하세요.
*/

public class Ex01 {
	private Figure[] fig;
	
	public Ex01() {
		setFig();
		FigPrint();
	}
	 
	// fig 배열의 내용을 출력해준는 함수
	public void FigPrint() {
	// 향상된 for문
	for(Figure f : fig) {
		f.toPrint();
	}
	}
	
	// 배열 변수 초기화 시켜주는 함수
	public void setFig() {
		fig = new Figure[10];
		
		//각방에 도형 채워넣기
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = getRndNo();
			switch(no) {
			case 3: 
				fig[i] = new Semo((int)(Math.random()*21 + 5), (int)(Math.random()*21 + 5));
				break;
			case 4:
				// 이 경우는 사각형을 채워준다.
				fig[i] = new Nemo((int)(Math.random()*21 + 5), (int)(Math.random()*21 + 5));
				break;
			case 5:
				// 이 경우는 사각형을 채워준다.
				fig[i] = new Won((int)(Math.random()*21 + 5));
				break;
			}
		}
	}	
	// 랜덤하게 3~5의 숫자를 발생시켜주는 함수
	public int getRndNo() {
		return(int)(Math.random()*3+3);
				}
		
	public static void main(String[] args) {
		new Ex01();
	}

}
