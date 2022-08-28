package summary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 	InputStream - byte
	InputStreamReader - character
	BufferedReader - String
 */
public class Console {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		
		
		byte[] b = new byte[3];
		//read메소드는 1byte 만 읽음
		in.read(b);
		
		InputStreamReader reader = new InputStreamReader(in);
		char[] c = new char[3];
		reader.read(c);
		
		BufferedReader br = new BufferedReader(reader);
		
		String a = br.readLine();
		System.out.println(a);
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		

	}
}
