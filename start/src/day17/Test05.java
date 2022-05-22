package day17;

/*
 	 doc 폴더 안의 파일의 목록을 알아내보자.
 */
import java.io.*;
public class Test05 {

	public Test05() {
		// 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File dir = new File("doc");
		/*
		 * 
		// 1. 목록을 꺼내보자
		String[] flist = dir.list();
		
		// 출력
		for(String f : flist) {
			System.out.println(f);
			
			
		// 2. 파일 정보도 꺼내자
		File[] infoList = dir.listFiles();
		
		// 정보 출력
		for(File f : infoList) {
			String fName = f.getName(); // 파일 이름 꺼내는 함수
			long len = f.length(); // 파일 사이즈 추출
			String pold = f.getParent(); // 상위 폴더 이름 꺼내는 함수
			
		// 출력
		System.out.println("상위 폴더 : " + pold + " , 파일이름 : " + fName + " , 사이즈 " + len + " byte");
		
		*/
		
		// 3. 확장자가 jpg인 파일만 골라서 추출하고싶다.
		// 무명 내부 클래스 사용 , 없는 클래서 상속 바로 받아서 new 시킴
		String[] flist = dir.list(new FilenameFilter() {
			@ Override
			public boolean accept(File dir, String name) {
				/*
				 	이 함수는 자동 호출 함수
				 	목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출된다.
				 	이 함수에서 true 를 반환하면 해당 목록을 결과에 포함시키고
				 			false를 반환하면 해당 목록을 결과에 포함시키지 않는다.
				 	
				 	따라서 포함될 파일들을 여기서 정의 해주면 된다.
				 	
				 	매개변수 ]
				 		File dir		: 현재 파일의 정보를 알려준다
				 		String name 	: 현재 파일의 이름만 알려준다
				 		
				 */
				boolean bool = false;
				
				if(name.endsWith("jpg")) { // 파일 이름이 jpg로 끝나는지 확인하는 함수 endsWith
					// 이 경우는 결과 목록에 이 파일을 포함시킨다.
					bool = true;
				} /*else {
					bool = false;
				}
					// bool 변수는 초기값으로 이미 false로 셋팅되어 있으므로 생략해도 무방
					*/
				return bool;
		
				// return name.endsWith("jpg");
				// ==> 이 경우처럼 상속받아 오버라이드해야하는 함수의 내용이 극도로 짧은 경우는 무명 내부 클래스 처리
 			}
				
		});
		
		for(String f : flist) {
			System.out.println(f);
		}
		
		}
	

	public static void main(String[] args) {
		new Test05();
	}

}
