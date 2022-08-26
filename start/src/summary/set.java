package summary;

import java.util.Arrays;
import java.util.HashSet;

public class set {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
		set.add("Jump");
        set.add("To");
        set.add("Java");
        set.addAll(Arrays.asList("From", "sql"));
		System.out.println(set);  
		
        
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        
        // 교집합 만들기
        HashSet<Integer> intersection = new HashSet<>(s1); 
        intersection.retainAll(s2);  
        System.out.println(intersection);  
        
        // 합집합 만들기
        HashSet<Integer> union = new HashSet<>(s1);  
        union.addAll(s2); 
        System.out.println(union);  
        
        // 차집합
        HashSet<Integer> substract = new HashSet<>(s1);  
        substract.removeAll(s2);
        System.out.println(substract);  
	}
}
