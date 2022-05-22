package day05.ex;

/*
문제 6 ]
	랜덤하게 정수를 컴퓨터가 만들어 내면
	그 수를 알아맞추는 게임을 만드세요.

	예 ]

		발생숫자 : 54

		사용자입력숫자 : 45

		==> "입력한 수가 더 작습니다."
		로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...

		단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하세요.
 */
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		//입렵도구 준비
		Scanner sc = new Scanner(System.in);
		//랜덤숫자만들기
		int num = (int)(Math.random()*100+1);
		//반복해서 출력
		for(int i = 0;i <5; i++) {
			//횟수제한이 있기 때문에 for반복문 사용
			//사용자가 숫자를 입력
			System.out.println("숫자 입력   : ");
			int no = sc.nextInt();
			System.out.println(num);
			//비교해서 결과 보여준다.
			if(no == num) {
				System.out.println("입력한 수 " + no + " 맞습니다.");
				// 정답을 맞췄으므로 반복을 종료한다.
				break;
			}  else if(i != 4 && no > num) {
				System.out.println("큰 수를 입력했습니다.");
				continue;
			} else if(i != 4 && no < num) {
				System.out.println("작은 수를 입력했습니다.");
				continue;
			}
			
			if(i == 4) {
				System.out.println("##### 게임에서 졌습니다. #####");
			}
		}
	}

}