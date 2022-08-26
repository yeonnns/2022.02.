package summary;

public class forEach {

	public static void main(String[] args) {
		int[] marks = {90, 25, 67, 45, 80};
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] < 60) {
		        continue;
		    }
		    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
		}
		
		
		
		System.out.println("-------------------------");
		for(int i=2; i<10; i++) {
		    for(int j=1; j<10; j++) {
		        System.out.print(i*j+" ");
		    }
		    System.out.println("");
		}
		
		System.out.println("for문-------------------------");
		String[] numbers = {"one", "two", "three"};
		for(int i=0; i<numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		System.out.println("for each문-------------------------");
		String[] numbers2 = {"one", "two", "three"};
		for(String number: numbers2) {
		    System.out.println(number);
		}
		
		
	}
}
