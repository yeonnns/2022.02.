package summary;


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
	// animal 상속받아서 name객체변수 + setName메소드 만들지 않았지만 그대로 사용 가능
	void sleep() {
		System.out.println(this.name+" zzz");
		
		Animal dog = new Dog();  // Dog is a Animal
	}
}

// 오버라이딩
class HouseDog extends Dog {
	// 생성자(Constructor)- 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않음
	HouseDog(String name) {
		this.setName(name);
	}
	// 생성자 오버로딩
	HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }
	
	
	void sleep() {
		System.out.println(this.name+" zzz in houst");
	}
	
	// 오버로딩
	void sleep(int hour) {
	    System.out.println(this.name+" zzz in house for " + hour + " hours");
	} 
}


public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("이름 지정 전 "+ dog.name);
        dog.setName("상속받은 dog의 poppy");
        System.out.println(dog.name);  
        dog.sleep();  
        
        // 생성자로 인해 new 키워드로 객체를 만들때 문자열을 전달해야한다.
        HouseDog houseDog = new HouseDog("mung");
        System.out.println(houseDog.name);
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(yorkshire.name);
        
        houseDog.setName("오버라이딩된 happy");
        houseDog.sleep();  // happy zzz 출력
        houseDog.sleep(3);  
    }
}


