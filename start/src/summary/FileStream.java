package summary;

import java.io.FileWriter;
import java.io.IOException;

public class FileStream {
	public static void main(String[] args) throws IOException {
		// 파일 작성
        // FileOutputStream output = new FileOutputStream("c:/out.txt");
		FileWriter fw = new FileWriter("c:/out.txt");
		for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            // output.write(data.getBytes());
            fw.write(data);
		}
       // output.close();
		fw.close();
		
		// 파일을 추가 모드로 연다.
		 FileWriter fw2 = new FileWriter("c:/out.txt", true);  
		 for(int i=11; i<21; i++) {
	            String data = i+" 번째 줄입니다.\r\n";
	            fw2.write(data);
	        }
	        fw2.close();
	    }
	}