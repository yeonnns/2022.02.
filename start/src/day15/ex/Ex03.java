package day15.ex;

/*
	학생 한명의 정보를 저장할 클래스를 제작하세요
	정보는
		학생이름, 반, 번호, 
		자바, 데이터베이스, 웹, 스프링 점수
		총점, 평균
	를 기억하게 하고
	
	10명의 학생을 TreeSet에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.
	
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex03 {
	ArrayList names = new ArrayList();

	public Ex03() {
		setNames();

		TreeSet set = new TreeSet();

		for (int i = 0; i < 10; i++) {
			String name = (String) names.get(i);
			Students s = new Students(name, (int) (Math.random() * 10 + 1), (int) (Math.random() * 31 + 5),
					(int) (Math.random() * 61 + 40), (int) (Math.random() * 61 + 40), (int) (Math.random() * 61 + 40),
					(int) (Math.random() * 61 + 40));
					set.add(s);
					
		}
		
		// 이름을 기준으로 오름차순 정렬하도록 데이터를 추가...
		TreeSet set1 = new TreeSet(new Comparator() {
			// 정렬이 안되는 것을 입력한다거나
			// 이전 정렬기준이 있는데 그 정렬기준이외에 다른 정렬기준으로 정렬을 하려고 할 때...
			
			@Override
			public int compare(Object o1, Object o2) {
				Students s1 = (Students) o1;
				Students s2 = (Students) o2;
				
				// 이름을 꺼내고
				String name1 = s1.getName();
				String name2 = s2.getName();
				
//				int result = name1.compareTo(name2);
				int result = ((Students)o1).getName().compareTo(((Students)o2).getName());
				
				return result;
			}
		});
		
		// 오름 차순 정렬 데이터 추가

		for (int i = 0; i < 10; i++) {
			String name = (String) names.get(i);
			Students s = new Students(name, (int) (Math.random() * 10 + 1), (int) (Math.random() * 31 + 5),
					(int) (Math.random() * 61 + 40), (int) (Math.random() * 61 + 40), (int) (Math.random() * 61 + 40),
					(int) (Math.random() * 61 + 40));
					set1.add(s);
		}
		
		
		// 출력
		ArrayList list = new ArrayList(set);
		for (Object o : list) {
			System.out.println(o);
		}
		// 출력
		Iterator itor = set.iterator();
		while (itor.hasNext()) {
			Students result = (Students) itor.next();
			System.out.println(result);
		}
		
		System.out.println();
		// 이름순 셋 출력
		for(Object o : set1) {
			System.out.println(o);
		}
	}

	public void setNames() {
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		names.add("F");
		names.add("G");
		names.add("H");
		names.add("I");
		names.add("J");
	}

	public static void main(String[] args) {
		new Ex03();
	}

}