package summary;

import java.util.ArrayList;
import java.util.Arrays;

public class list {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
		
		pitches.add(0, "133");
		
		System.out.println(pitches.get(0));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("142"));
		
		ArrayList pitches2 = new ArrayList();
		pitches2.add("138");
		pitches2.add("129");

		String one = (String) pitches2.get(0);
		String two = (String) pitches2.get(1);
		System.out.println(one);
		System.out.println(two);
		
		// 제네릭스 선언으로 형변환 
		ArrayList<String> pitches3 = new ArrayList<>();
		pitches3.add("138");
		pitches3.add("129");
		
		
		String one2 = pitches3.get(0); 
		String two2 = pitches3.get(1); 
		System.out.println(one2);
		System.out.println(two2);
		
		
		ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches4);
        System.out.println(result);  // 138,129,142 출력
    
	}

}
