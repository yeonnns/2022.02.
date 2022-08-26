package summary;

import java.util.HashMap;

public class map {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
	    map.put("people", "사람");
	    map.put("baseball", "야구");
	    
	    System.out.println(map.get("people"));
	    System.out.println(map.get("java")); 
	    System.out.println(map.containsKey("people"));
	    System.out.println(map.getOrDefault("java", "자바"));  //null 일시  자바 출력
	    System.out.println(map.size());
	    
	    System.out.println(map.keySet()); 
	}
}
