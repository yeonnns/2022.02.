package summary;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String a = "a:b:c:D";
		String[] temp = a.split(":");
		String result = String.join("#", temp);
		System.out.println("--------------[1]--------------");
		System.out.println(result);
		
		
		
		
		HashMap<String, Integer> b = new HashMap<>();
        b.put("A", 90);
        b.put("B", 80);
        System.out.println("--------------[2]--------------");
        System.out.println(b.getOrDefault("C", 70));
        
       
        
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total = 0;
        for (int c : A) {
        	if(c >= 50) {
        		total += c;
        	}
        }
        System.out.println("--------------[3]--------------");
        System.out.println(total);
        
     
        
        System.out.println("--------------[4]--------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("연속된 숫자를 ,로  입력하세요");
        String userInput = sc.nextLine(); 
        
        String[] numbers = userInput.split(",");
        int total1 = 0;
        for(String num : numbers) {
        	num = num.trim(); // 공백제거
        	  int n = Integer.parseInt(num);  
              total1 += n;
        }
        System.out.printf("총합은 %d 입니다.\n", total1);
       
  
        
        
		
	
	}
}
