package summary;

// 육식동물 인터페이스(인터페이스 클래스 둘다 단독으로 파일 저장)
interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator, Barkable {
}

class Animall {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animall implements Predator, Barkable{
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements BarkablePredator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
	/*
	 * 인터페이스 추가 전
    void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed apple");
    }
    // 메소드 오버라이딩
    void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
        System.out.println("feed banana");
    }
    */
	
	void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
	/*
    void barkAnimal(Animall animal) {
        if (animal instanceof Tiger) {
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
            System.out.println("으르렁");
        }
    }
    */
    void barkAnimal(Barkable animal) {
    	animal.bark();
    }
	
}


public class InterfaceExam {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger(); 
        // = Animal tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
        
        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
