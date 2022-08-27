package summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class exam1 {
	public static void main(String[] args) {
		aver();
		thirty();
		hong();
		sex();
		ssap();
		reverse();
		life();
		printCoffeePrice(CoffeeType.AMERICANO);
		threeX();
		markaver();
	}
	
	public static void aver(){
		int a = 80;
		int b = 75;
		int c = 55;
		
		System.out.println((a+b+c)/3);
	}
	
	public static void thirty(){
		int a = 13;
		String result = (13%2) == 1 ? "홀수": "찍수";
		System.out.println(a + "는 " + result);
	}
	
	public static void hong(){
		String num =  "881120-1068234";
		String a = num.substring(0, 6);
		String b = num.substring(7);
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void sex() {
		 String num = "881120-1068234";
	     System.out.println(num.charAt(7));  
		
	}
	
	public static void ssap() {
		String a = "a:b:c:d";
		String b = a.replace(":", "#");
		System.out.println(b);
		
	}
	
	 public static void reverse() {
	    ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
	    myList.sort(Comparator.reverseOrder());  
	    System.out.println(myList); 
	    }
	 
	 public static void life() {
		 ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
		 String result = String.join(" ",  myList);
		 System.out.println(result);
	 }
	 
	 public static void list() {
		 ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
		 HashSet<Integer> temp = new HashSet(numbers);
	     ArrayList<Integer> result = new ArrayList<>(temp);  
	     System.out.println(result);  
	 }

	 
	 enum CoffeeType {
	        AMERICANO,
	        ICE_AMERICANO,
	        CAFE_LATTE
	    };
	    
	    
	 static void printCoffeePrice(CoffeeType type) {
	     HashMap<CoffeeType, Integer> Map = new HashMap<>();
	     Map.put(CoffeeType.AMERICANO, 3000);  
	     Map.put(CoffeeType.ICE_AMERICANO, 4000); 
	     Map.put(CoffeeType.CAFE_LATTE, 5000);  
	     int price = Map.get(type);
	     System.out.println(String.format("가격은 %d원 입니다.", price));
	    }

	 static void threeX() {
		 int result = 0;
		 int i = 0;
		 while(i <= 1000) {
			 if (i % 3  == 0 ) {
				 result +=i;
			 }
			 i +=1;
		 }
	 System.out.println(result);
	 }
	 
	 static void markaver() {
		 int[] marks = {70, 65, 80, 50, 55, 90, 95, 100};
		 int total = 0;
		 for(int mark: marks) {
			 total += mark;
		 }
		 float average = (float) total / marks.length;
		 System.out.println(average);
	 }
	
}
