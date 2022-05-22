package day15.ex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Ex01 ]
	아이디를 입력받아서 
	입력받은 아이디가 유효한 아이디인지 아닌지를 판별해주는 프로그램을 작성하세요.
	
	아이디는
		첫글자는 영문대문자로 시작하고
		두번째부터는 영문숫자를 사용할 수 있다.
		글자수는 5글자 이상이어야 한다.
*/
public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID 입력 : ");
		String id = sc.nextLine();
		Pattern form = Pattern.compile("[A-Z]{1}[a-zA-Z0-9]{4,}");
		Matcher mat = form.matcher(id);
		boolean bool = mat.matches();
		String result = bool?  "사용 가능" : "사용 불가능";
		System.out.println("입력 받은 id [ " + id + " ] 은 " + result + "합니다.");
		
	
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
