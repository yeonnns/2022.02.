package day19;


import java.net.*;

/*
 	네트워크에서 가장 중요한 요소는 IP주소이다.
 	자바는 IP주소의 정보를 관리하는 클래스를 제공하고 있다.
 		==> InetAddress
 		
 	1. 내 컴퓨터의 IP주소를 알아내자
 	
 	2. Naver 서버의 IP주소도 알아내자
 	
 */
public class Test01 {

	public Test01() {
		/* 
		  	작업방법
		  			getByname(String host)
		  			==> 지정한 주소를 이용해서 IP주소로 관리
		  			
		  			getLocalHost()
		  			==> 현재 시스템의 IP주소를 알려준다.
		  			
		  			참고 ]
		  				localHost : 현재 시스템
		  							127.0.0.1
		
		*/
		InetAddress inet = null;
		try {
			inet = InetAddress.getLocalHost();
			
			/*
			 	InetAdress 라는 클래스는
			 	정보를 관리하는 클래스이므로
			 	정보를 꺼내는 함수가 중요함수가 된다.
			 	
			 	1. IP주소를 꺼내는 함수
			 		getHostAdress()
			 	2. 도메인 주소를 꺼내는 함수
			 		getHostName()
			 */
			
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			
			// 출력
			System.out.println("IP 주소 " + ip);
			System.out.println("장비이름 " + name);
			System.out.println("###############################");
			
			// 네이버의 정보를 추출해보자.
			inet = InetAddress.getByName("www.naver.com");
			// 만들어진 객체를 꺼내보자
			String naverIP = inet.getHostAddress();
			String sysName = inet.getHostName();
			
			// 출력
			System.out.println("네이버 IP" + naverIP);
			System.out.println("시스템 이름 " + sysName);
			System.out.println("###############################");
			
			
		}catch(Exception e) {
			
		}
		
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
