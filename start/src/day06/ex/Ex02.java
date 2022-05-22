package day06.ex;

/*
문제 2 ]
	두 사람이 등산을 한다.
	한사람은 산 입구에서 0.54m/sec 의 속도로 등산을 시작하고
	한사람은 정상에서 1.07m/sec 의 속도로 내려온다.
	산의 높이가 7564m 라고 가정하면
	두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요.
*/

public class Ex02 {

	public static void main(String[] args) {
		//1시간당 몇m가는지 확인하기
		double na = (double)0.54*60*60;
		double nu = (double)1.07*60*60;
		
		int h = 7564;
		int i = 1;
		double result = 1;
		System.out.println(na);
		System.out.println(nu);
		
		for(i = 1; i < h ; i++ ) {
			if((na + i) >= (nu - i)) {
				System.out.println(na + i); //2898m에서 만남
				System.out.println(i);//954m감
				break;
				
			}
		}
		//만났을때 시간 구하기
		//2898/0.54=5366(2898m가는데 5366초 필요)
		//60초 = 1분, 3600초 1시간 
		double rac =  (na+i) / (double)0.54; // 만났을떄 시간 구하기
		
		int tmp = 0;
		
		int hour = (int)rac / 3600;
		tmp = (int)rac % 3600;
		int min = tmp / 60;
		int sec = tmp % 60;
				
		
		System.out.println("둘이 만나는 시간은" + hour + " 시간 " + 
				min +" 분 " + sec + " 초 입니다. ");//954m감
		
	

	}

}
