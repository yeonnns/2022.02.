package summary;

class Calcul {
	int result = 0;
	
	int add(int num) {
		result += num;
		return result;
	}
}

public class Class {
    public static void main(String[] args) {
        // System.out.println(Calculator.add(3));
    	// 계산기 객체를 생성
    	Calcul cal1 = new Calcul();
    	Calcul cal2 = new Calcul();

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
        
        // new 키워드로 객체 생성하여 animal 클래스의 인스턴스인 cat(객체) 이 생성
        Animal cat = new Animal();
        cat.setName("boby");
        
        Animal dog = new Animal();
        dog.setName("happy");
        
        // 객체 변수의 값이 독립적으로 존재
        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}

class Animal {
	String name ;
	
	public void setName(String name) {
		this.name = name;
	}
	
}
